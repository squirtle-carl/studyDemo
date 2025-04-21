package advanced.io.AIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AIOServerTest {

    public static void main(String[] args) throws IOException {
        System.out.println(Thread.currentThread().getName() + " AioServer start");
        AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open()
                .bind(new InetSocketAddress("127.0.0.1", 8080));
        serverChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {

            @Override
            public void completed(AsynchronousSocketChannel clientChannel, Void attachment) {
                System.out.println(Thread.currentThread().getName() + " client is connected");
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                clientChannel.read(buffer, buffer, new ClientHandler());
            }

            @Override
            public void failed(Throwable exc, Void attachment) {
                System.out.println("accept fail");
            }
        });
        System.in.read();
    }
}
