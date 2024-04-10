package com.jeffreyfleer.personalapi.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    CommandLineRunner commandLineRunner(DataRepository repository) {
        return args -> {
            Data jeffreyFleer = new Data("Jeffrey Fleer", LocalDate.of(2000, Month.FEBRUARY, 29), "email@gmail.com");
            Data JamesDean = new Data("James Dean",  LocalDate.of(2004, Month.FEBRUARY, 29), "freemail@gmail.com");

            repository.saveAll(List.of(jeffreyFleer, JamesDean));
        };
    }
}
