package com.vipzou.javasetest.Day26;


import java.util.Objects;

public class Person  {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        if (age >= 0 && age < 100) {
            this.age = age;
        } else {
            throw new AgeOutOfBoundsException(age + "年龄超出范围");
        }


    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws IllegaGenderException {
        if ("男".equals(gender) || "女".equals(gender)){
            this.gender = gender;
        }else {
            throw new IllegaGenderException("性别不对");
        }
    }
}
