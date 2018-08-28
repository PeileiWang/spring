package com.springxml.domain;

/**
 * Created by Wangpl
 * Time 2018/8/28 21:41
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello: " + name);
    }
}
