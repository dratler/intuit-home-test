package com.intuit.controller.util;

import com.google.gson.Gson;
import com.intuit.model.Payment;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javax.inject.Inject;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class ProducerController {
    @Inject
    private Producer producer;

    @Inject private Gson gson;
    public void sendToQueue(Payment payment) throws Exception {
        AtomicReference errors = new AtomicReference(null);
        ProducerRecord record = new ProducerRecord<String,String>("payment-topic", "", gson.toJson(payment));

        producer.send(record, (metadata, exception) -> {
            if(Objects.nonNull(exception)){
                errors.set(exception.toString());
            }
        });
        if(Objects.nonNull(errors.get())){
            throw new Exception(String.valueOf(errors.get()));
        }
    }
}
