package advanced.io.AIO;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.StandardCharsets;

public class AIOClientTest {
    public static void main(String[] args) throws Exception {
        AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
        channel.connect(new InetSocketAddress("127.0.0.1", 8080));
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("Hello AIO".getBytes(StandardCharsets.UTF_8));
        buffer.flip();
        Thread.sleep(1000);
        channel.write(buffer);
    }
}
