package com.johnoro.annotation.model;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String mobile;

    public Phone() {}

    public Phone(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mobile='" + mobile + '\'' +
                '}';
    }
}

