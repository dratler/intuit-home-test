package com.intuit.moduls;

import com.google.inject.Binder;
import com.typesafe.config.Config;
import org.apache.kafka.clients.consumer.Consumer;
import org.jooby.Env;
import org.jooby.Jooby;
import java.util.Properties;

public class KafkaConsumer implements Jooby.Module {

    @Override
    public void configure(Env env, Config conf, Binder binder) throws Throwable {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9091");
        props.put("group.id", "test");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        org.apache.kafka.clients.consumer.KafkaConsumer k = new org.apache.kafka.clients.consumer.KafkaConsumer<>(props);


    }
}
