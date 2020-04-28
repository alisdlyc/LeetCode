package com.alisdlyc.leetcode.study.utils;

import java.util.Objects;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*若将Person 对象作为Map的key，则Person必须实现 equals和 hashcode 方法*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(name, p.name) && age == p.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
