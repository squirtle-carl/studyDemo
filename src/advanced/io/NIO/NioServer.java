package advanced.io.NIO;

public class NioServer {
    public static void main(String[] args) {
        int port = 8080;
        MultiplexerNioServer nioServer = new MultiplexerNioServer(port);
        new Thread(nioServer).start();
    }
}
