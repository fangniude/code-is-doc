package udp;

import javax.net.SocketFactory;
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author rd20
 */
public class Server {
    public static void main(String[] args) throws IOException {
        final DatagramSocket server = new DatagramSocket(new InetSocketAddress("127.0.0.1", 1234));
        server.connect(new InetSocketAddress("127.0.0.1", 4321));

        while(true) {
            final DatagramPacket p = new DatagramPacket(new byte[10], 6);
            server.receive(p);
            server.send(p);
        }
    }
}
