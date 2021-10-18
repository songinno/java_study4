package com.kh.hw.person.model.vo;

public class Student extends Person {
    //필드
    private int grade; //학년
    private String major; //전공

    //생성자
    public Student() {
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    //메서드
    public String toString() {
        return this.getName() + ", " +  this.getAge() + ", " + this.getHeight() + ", " + this.getWeight() + ", " + grade + ", " + major;
    }
}
