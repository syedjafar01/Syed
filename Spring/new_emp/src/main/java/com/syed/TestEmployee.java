package com.syed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by syedjafar on 20/12/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class TestEmployee {

    public static void main(String[] args) {
        SpringApplication.run(TestEmployee.class, args);
    }

}
