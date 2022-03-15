package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

/**
 * @author rd20
 */
public class Client {
    public static void main(String[] args) throws IOException {
        final DatagramSocket client = new DatagramSocket(new InetSocketAddress("127.0.0.1", 4321));
        client.connect(new InetSocketAddress("127.0.0.1", 1234));

        client.send(new DatagramPacket("abcdefg".getBytes(StandardCharsets.UTF_8), 5));

        final DatagramPacket p = new DatagramPacket(new byte[6], 6);
        client.receive(p);
        System.out.println(new String(p.getData()));
    }
}
