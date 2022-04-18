package com.wz.ootest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/13
 * Time: 17:26
 */
public class Person {

    public String name;

    public Integer age;

    public String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void sayHello(){
        System.out.println("name=" + name + "\tage=" + age + "\taddress=" + address);
    }
}
