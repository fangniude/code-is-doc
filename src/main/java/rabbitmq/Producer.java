package rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author rd20
 */
public class Producer {
    private static final String EXCHANGE_NAME = "exchange1";
    private static final String QUEUE_NAME = "queue1";
    private static final String ROUTING_KEY = "routing_key_1";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setVirtualHost("test");
        Connection connection = factory.newConnection();// 创建连接
        Channel channel = connection.createChannel();// 创建信道
        // 创建一个 type="direct" 、持久化的、非自动删除的交换器
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT, true, false, null);
        //创建一个持久化、非排他的、非自动删除的队列
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        //将交换器与队列通过路由键绑定
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, ROUTING_KEY);
        //发送一条持久化的消息: hello world !
        String message = "Hello World !";
        channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY, true, true,
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                message.getBytes());
//关闭资源
        channel.close();
        connection.close();
    }
}
