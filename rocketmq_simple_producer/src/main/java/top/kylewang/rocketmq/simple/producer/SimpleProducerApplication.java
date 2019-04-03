package top.kylewang.rocketmq.simple.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KyleWang
 * @version 1.0
 * @date 2019年04月03日
 */
@SpringBootApplication
public class SimpleProducerApplication {

    public static void main(String[] args) {
        new SpringApplication(SimpleProducerApplication.class).run(args);
    }

}
