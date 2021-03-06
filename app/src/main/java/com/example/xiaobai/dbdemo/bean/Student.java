package com.example.xiaobai.dbdemo.bean;

/**
 * Created by Administrator on 2017/8/9.
 */

public class Student {
    private String name;
    private String sex;
    private String school;
    private int age;

    public Student(String name, String sex, String school, int age) {
        this.name = name;
        this.sex = sex;
        this.school = school;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{"
                + "name:" + name +",age" + age + ",sex" + sex + ",school" + school+
                "}";
    }
}
