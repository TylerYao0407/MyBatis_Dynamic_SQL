package com.tyler.pojo;

/**
 * Created by tyler on 2016/12/20.
 */
public class Teacher {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String info;
    public Teacher(){}
    public Teacher(String name, String sex, int age, String info) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.info = info;
    }
    public Teacher(int id,String name, String sex, int age, String info) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.info = info;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                '}';
    }
}
