package tcp;

import javax.net.SocketFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author rd20
 */
public class Client {
    public static void main(String[] args) throws IOException {
        final Socket socket = SocketFactory.getDefault().createSocket();
        socket.connect(new InetSocketAddress("127.0.0.1", 7777));
        final OutputStream out = socket.getOutputStream();
        final OutputStreamWriter writer = new OutputStreamWriter(out);
        writer.append("abcdef");
        writer.flush();
        System.out.println(socket.getChannel());
    }
}
