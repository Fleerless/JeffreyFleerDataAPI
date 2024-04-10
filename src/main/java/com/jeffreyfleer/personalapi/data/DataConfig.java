package com.jeffreyfleer.personalapi.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Hello from the command line runner");
        };
    }
}
q