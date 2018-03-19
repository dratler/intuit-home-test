package com.intuit.engine;

import com.intuit.controller.EngineController;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.jooby.quartz.Scheduled;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;

public class Scheduler {


    @Inject private EngineController engineController;
    @Inject private Properties properties;
    @Scheduled("1minutes; delay=0; repeat=*")
    public void job() {
        KafkaConsumer consumer = new KafkaConsumer<>(properties);
        consumer.subscribe(Arrays.asList("payment-topic"));
        ConsumerRecords records = consumer.poll(10000);
        if(!records.isEmpty()) {
            Iterator<ConsumerRecord> iterator = records.iterator();
            while (iterator.hasNext()){
                ConsumerRecord record = iterator.next();
                try {
                    engineController.storePayment(record.value().toString());
                } catch (Exception e){
                    System.out.println("Record de-queue failed:"+e.toString());
                }
            }

        }
        System.out.println("Records found "+records.count());
        consumer.close();
    }

}
