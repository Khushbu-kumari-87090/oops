package com.oops.polymorphism;

public class Polymorphism {
    private String name;
    private int num;

    public Polymorphism(String name, int num){
        this.name=name;
        this.num=num;
    }

    public void sum(String name1){
        System.out.println(name+" "+name1);
    }

    public void sum(int n){
        System.out.println(n+num);
    }
}
