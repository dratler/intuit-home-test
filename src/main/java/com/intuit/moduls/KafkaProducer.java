package com.intuit.moduls;

import com.google.inject.Binder;
import com.typesafe.config.Config;
import org.apache.kafka.clients.producer.Producer;
import org.jooby.Env;
import org.jooby.Jooby;

import java.util.Properties;

public class KafkaProducer implements Jooby.Module {
    @Override
    public void configure(Env env, Config conf, Binder binder) throws Throwable {

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        Producer producer = new org.apache.kafka.clients.producer.KafkaProducer(props);
        binder.bind(Producer.class).toInstance(producer);

    }

}
