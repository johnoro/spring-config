package com.johnoro.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.johnoro.annotation.model.Address;
import com.johnoro.annotation.model.Phone;
import com.johnoro.annotation.model.Student;

import java.util.List;

@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);

        Address address = applicationContext.getBean(Address.class);
        address.setCity("XYZville");
        address.setZipCode("55555");
        address.setState("OH");
        address.setCountry("USA");

        Phone phone = applicationContext.getBean(Phone.class);
        phone.setMobile("7777777");

        Student student = applicationContext.getBean(Student.class);
        student.setId(0);
        student.setName("John");
        student.setAddress(address);
        student.setPhones(List.of(phone));
        System.out.println(student);

        Phone phone1 = applicationContext.getBean(Phone.class);
        phone1.setMobile("4444");

        Student student1 = applicationContext.getBean(Student.class);
        student1.setId(1);
        student1.setName("Joe");
        student1.setAddress(address);
        student1.setPhones(List.of(phone1));
        System.out.println(student1);
        System.out.println(student);
    }
}
