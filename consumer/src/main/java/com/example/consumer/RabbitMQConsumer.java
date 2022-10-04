package com.example.consumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
public class RabbitMQConsumer {
    @RabbitListener(queues = "javainuse.queue")
    public void recievedMessage( Employee employee) {
        System.out.println("Recieved Message From   RabbitMQ: " + employee);
    }
}
