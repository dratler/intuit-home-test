package com.intuit.engine;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.jooby.quartz.Scheduled;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;

public class Scheduler {
    //This is the Engine here!!!
    @Scheduled("10seconds")
    public void test() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "topic-payment");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        org.apache.kafka.clients.consumer.KafkaConsumer k = new org.apache.kafka.clients.consumer.KafkaConsumer<>(props);
        System.out.println("zero");
        k.subscribe(Arrays.asList("payment-topic"));
        System.out.println("one");
        ConsumerRecords records = k.poll(10000);
        if(!records.isEmpty()) {
            Iterator<ConsumerRecord> iterator = records.iterator();

            iterator.next();
        }
        System.out.println("Records found "+records.count());
        k.close();

    }

}
