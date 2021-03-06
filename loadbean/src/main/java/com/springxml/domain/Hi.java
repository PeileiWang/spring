package com.springxml.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by WangPeilei
 * Time 2018/9/17 13:39
 */
public class Hi {

    @Resource(name = "Hello")
    private Hello hello;
    private String str;

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hi{" +
                "hello=" + hello +
                ", str='" + str + '\'' +
                '}';
    }
}
