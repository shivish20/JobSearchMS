package com.shivish20.jobs_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JobsMsApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobsMsApplication.class, args);
    }

}
