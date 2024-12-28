package com.epam.rd.autotasks.library.config;

import com.epam.rd.autotasks.library.Publisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PublisherConfig {
    @Bean
    @Primary
    public Publisher publisher() {
        return new Publisher("Spring Publishing House", "123 Spring St.", 2000);
    }
}