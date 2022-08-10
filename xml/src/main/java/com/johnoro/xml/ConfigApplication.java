package com.johnoro.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.johnoro.xml.model.Address;
import com.johnoro.xml.model.Phone;
import com.johnoro.xml.model.Student;

import java.util.List;

@SpringBootApplication
@ImportResource({"classpath*:spring-config.xml"})
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
    }
}
