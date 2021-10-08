package com.kh.practice.student.run;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class Run {
    public static void main(String[] args) {
        //1)
//        Student a = new Student("aaa", "국어", 50);
//        String aInfo = a.inform();
//        System.out.println(aInfo);
        //2)
//        Student b = new Student();
//        b.setName("bbb");
//        b.setSubject("수학");
//        b.setScore(80);
//        System.out.println(b.inform());
        //=> 둘이 결과론적으론 똑같음.

        StudentController ss = new StudentController();

    }
}
