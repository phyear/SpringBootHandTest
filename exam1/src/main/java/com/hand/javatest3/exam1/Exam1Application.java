package com.hand.javatest3.exam1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Exam1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exam1Application.class, args);
    }

}
