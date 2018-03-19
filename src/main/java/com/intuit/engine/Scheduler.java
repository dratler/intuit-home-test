package com.intuit.engine;

import com.intuit.controller.EngineController;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.jooby.quartz.Scheduled;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;

public class Scheduler {

    @Inject
    private EngineController engineController;

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
        k.subscribe(Arrays.asList("payment-topic"));
        ConsumerRecords records = k.poll(10000);
        if(!records.isEmpty()) {
            Iterator<ConsumerRecord> iterator = records.iterator();
            while (iterator.hasNext()){
                ConsumerRecord record = iterator.next();
                try {
                    engineController.storePayment(record.value().toString(),0.7);
                } catch (Exception e){
                    System.out.println("Record de-queue failed:"+e.toString());
                }
            }

        }
        System.out.println("Records found "+records.count());
        k.close();

    }

}
