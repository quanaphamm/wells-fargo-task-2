package com.wellsfargo.counselor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.wellsfargo.counselor.entity")
public class Entrypoint {
    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }
}
