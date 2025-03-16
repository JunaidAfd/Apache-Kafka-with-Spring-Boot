package com.afridi.kafka.consumer;

import com.afridi.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    //@KafkaListener(topics = "afridi",groupId = "myGroup")
    public void consumeMessage(String msg) {
        log.info(String.format("Consuming the message from afridi Topic: %s", msg));
    }

    @KafkaListener(topics = "afridi",groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info(String.format("Consuming the message from afridi Topic: %s", student.toString()));
    }
}
