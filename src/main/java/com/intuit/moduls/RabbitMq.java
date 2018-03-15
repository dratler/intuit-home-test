package com.intuit.moduls;

import com.google.inject.Binder;
import com.intuit.mq.service.MqPaymentController;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.typesafe.config.Config;
import org.jooby.Env;
import org.jooby.Jooby;

public class RabbitMq implements Jooby.Module {
    private static final String EXCHANGE_NAME = "payment-test";
    @Override
    public void configure(Env env, Config conf, Binder binder) throws Throwable {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "direct");

        channel.basicPublish(EXCHANGE_NAME,"DEBUG",null,"hi there".getBytes());

        channel.close();
        connection.close();
        binder.bind(MqPaymentController.class);
    }
}
