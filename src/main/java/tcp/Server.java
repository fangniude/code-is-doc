package tcp;

import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;

/**
 * @author rd20
 */
public class Server {
    public static void main(String[] args) throws IOException {
        final ServerSocket serverSocket = ServerSocketFactory.getDefault().createServerSocket(7777);
        final ServerSocketChannel channel = serverSocket.getChannel();
        channel.configureBlocking(false);

        final SelectorProvider provider = SelectorProvider.provider();
        final AbstractSelector selector = provider.openSelector();

        channel.register(selector, SelectionKey.OP_ACCEPT);

        selector.select();
        final Set<SelectionKey> selectionKeys = selector.selectedKeys();
        for (SelectionKey selectionKey : selectionKeys) {
            selectionKey.isAcceptable();
            final SocketChannel worker = channel.accept();
        }


        while(true) {
            final Socket workerSocket = serverSocket.accept();
            final InputStream in = workerSocket.getInputStream();
            final InputStreamReader reader = new InputStreamReader(in);
            while(true) {
                final CharBuffer buffer = CharBuffer.allocate(10);
                reader.read(buffer);
                System.out.println(buffer);
            }
        }
    }
}
