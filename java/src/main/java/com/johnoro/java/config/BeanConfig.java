package com.johnoro.java.config;

import com.johnoro.java.model.Address;
import com.johnoro.java.model.Phone;
import com.johnoro.java.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Phone phone() {
        return new Phone();
    }

    @Bean
    public Student student() {
        return new Student();
    }
}
