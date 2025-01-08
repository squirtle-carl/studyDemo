package advanced.io.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author caihuaxin
 * @version 1.0.0
 * @doc 多路复用器nio服务
 * @date 2024/03/04
 */
public class MultiplexerNioServer implements Runnable{
    private ServerSocketChannel serverSocketChannel;
    private Selector selector;

    private volatile boolean stop = false;

    /**
     * @param port 端口
     * @return
     * @doc 初始化多路复用器，绑定监听端口
     */
    public MultiplexerNioServer(int port) {
        try {
            serverSocketChannel = ServerSocketChannel.open();//获得一个serverChannel
            selector = Selector.open();//创建选择器，获取一个多路复用器
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(port), 1024);//设置为非阻塞模式
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void stop(){
        this.stop = true; //优雅停止
    }

    @Override
    public void run() {
        while (!stop) {
            try{
                int client = selector.select(1000);
                System.out.println("1:"+client);
                if(client == 0){
                    continue;
                }
                System.out.println("2:" + client);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                SelectionKey key = null;
                while(iterator.hasNext()){
                    key = iterator.next();
                    iterator.remove();
                    try{
                        handle(key);
                    }catch (Exception e){
                        if(key != null){
                            key.cancel();
                            if(key.channel() != null){
                                key.channel().close();
                            }
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {

            }
        }
        if(selector != null){
            try {
                selector.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void handle(SelectionKey key) throws IOException{
        if(key.isValid()){
            if(key.isAcceptable()){
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel sc = ssc.accept();
                sc.configureBlocking(false);
                sc.register(selector, SelectionKey.OP_READ);
            }
            if(key.isReadable()){
                SocketChannel socketChannel = (SocketChannel) key.channel();
                ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                int readBytes = socketChannel.read(readBuffer);
                if (readBytes > 0){
                    readBuffer.flip();
                    byte[] bytes = new byte[readBuffer.remaining()];
                    readBuffer.get(bytes);
                    String body = new String(bytes, "UTF-8");
                    System.out.println("input is:" + body);
                    res(socketChannel,body);
                }else if(readBytes < 0){
                    key.channel();
                    socketChannel.close();
                }
                //没有读到字节忽略
            }
        }
    }

    private void res(SocketChannel channel,String response) throws IOException {
        if(response != null && !response.isEmpty()){
            byte[] bytes = response.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            channel.write(writeBuffer);
            System.out.println("res end");
        }
    }
}
