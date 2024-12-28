package com.epam.rd.autotasks.library.config;

import com.epam.rd.autotasks.library.Author;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AuthorConfig {
    @Bean
    @Primary
    public Author author() {
        return new Author("John Doe");
    }
}