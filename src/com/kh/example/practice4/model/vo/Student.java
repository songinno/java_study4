package com.kh.example.practice4.model.vo;

public class Student {

    //필드
    public int grade;
    public int classroom;
    public String name;
    public double height;
    public char gender;


    //생성자 (alt + insert로 생성자 만들어보기)
    public Student() {
        this.grade  = 3;
        this.classroom = 5;
        this.name = "고길동";
        this.height = 200.5;
        this.gender = '남';
    }
    //메서드
    public void information() {
        System.out.println("grade = " + grade + "학년");
        System.out.println("classroom = " + classroom + "반");
        System.out.println("name = " + name);
        System.out.println("height = " + height + "cm");
        System.out.println("gender = " + gender);
    }

}
