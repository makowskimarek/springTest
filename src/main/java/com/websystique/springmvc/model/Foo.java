package com.websystique.springmvc.model;

public class Foo {

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Foo() {
    }
}
