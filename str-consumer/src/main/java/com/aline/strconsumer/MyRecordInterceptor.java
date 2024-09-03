package com.aline.strconsumer;


import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.RecordInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRecordInterceptor implements RecordInterceptor<String, String> {
    private static final Logger log = LoggerFactory.getLogger(MyRecordInterceptor.class);

    @Override
    public ConsumerRecord<String, String> intercept(ConsumerRecord<String, String> record, Consumer<String, String> consumer) {
        log.info("Interceptando mensagem: " + record.value());
        if (record.value().contains("teste")) {
            log.info("Possui a palavra 'teste'");
        }
        return record;
    }
}

