package com.kh.example.practice4.model.vo;

public class Student {

    public int grade;
    public int classroom;
    public String name;
    public double height;
    public char gender;

    public Student(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public void information() {
        System.out.printf("%d학년 %d반 %s는 키가 %.2fcm인 %c자입니다.\n"
                        , grade, classroom, name, height, gender);
    }
}
