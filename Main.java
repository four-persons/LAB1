package com.company;

public class Main {

    public static void main(String[] args) {

        Person fuyuanqing=new Person("fuyuanqing",88);
        System.out.println(fuyuanqing.reverseName());

         Mock mock=new Mock(100,"fuyuanqing");
        mock.connect("aaa","liuliu","122");

        mock.getName();
        mock.getId();
    }
}
