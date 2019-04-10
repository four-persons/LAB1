package com.company;
/**
 * Created by 65411 on 2019/4/9.
 */

public class Person {

    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name:"+name+"Age: "+age);

    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String reverseName(){
        StringBuffer Namere=new StringBuffer(name+"n");
        Namere.reverse();
        System.out.println("the rename is :");
        return Namere.toString();

    }

}
