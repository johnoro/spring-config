package com.johnoro.java.config;

import com.johnoro.java.model.Address;
import com.johnoro.java.model.Phone;
import com.johnoro.java.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean
    @Scope("prototype")
    public Address address() {
        return new Address();
    }

    @Bean
    @Scope("prototype")
    public Phone phone() {
        return new Phone();
    }

    @Bean
    @Scope("prototype")
    public Student student() {
        return new Student();
    }
}
