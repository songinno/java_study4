package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

    public static void main(String[] args) {

        Student pororo
                = new Student(3, 1, "뽀로로", 161.73, '남');
        pororo.information();
    }
}
