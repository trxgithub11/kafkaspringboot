package com.trx.springboot.kafka.demo.springbootkafkademo;

import com.trx.springboot.kafka.demo.springbootkafkademo.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootKafkaDemoApplication {


    @Autowired
    private KafkaProducer product;
    @PostConstruct
    public void init(){
        for(int i=0;i<10;i++){
            product.send("tom"+i);
        }
    }
    public static void main(String[] args) {

        SpringApplication.run(SpringbootKafkaDemoApplication.class, args);
    }

}
