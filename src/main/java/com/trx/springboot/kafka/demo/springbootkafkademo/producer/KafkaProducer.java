package com.trx.springboot.kafka.demo.springbootkafkademo.producer;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String name){
        User u=new User();
        u.setName(name);
        u.setAge(11);
        kafkaTemplate.send("user", JSON.toJSONString(u));
    }
}
