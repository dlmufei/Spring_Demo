package com.qq.springbootdemo.bean;

/**
 * Json 实体demo类
 *
 * Created by cliffyan on 2017/7/16.
 */
public class Person {
    private int id;
    private String name;
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
