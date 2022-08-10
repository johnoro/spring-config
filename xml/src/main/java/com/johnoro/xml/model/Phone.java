package com.johnoro.xml.model;

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
