package com.kh.hw.person.run;

import com.kh.hw.person.contoroller.PersonController;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Run_controllerTest {
    public static void main(String[] args) {
        PersonController pc = new PersonController();
        //1)[학생수, 직장인수] 확인
        int[] personCount = pc.personCount();
        System.out.println(Arrays.toString(personCount));

        //2) 학생 등록
        pc.insertStudent("남나눔", 21, 187.3, 80.0, 2, "경영학과");
//        pc.show();
//        int[] studentCount = pc.personCount();
//        System.out.println("학생수: " + studentCount[0]);

        //3) 학생 객체 배열 주소 확인
        Student[] printStudent = pc.printStudent();
        System.out.println(printStudent);

        //4) 사원 등록
        pc.insertEmployee("가나다", 20, 190.5, 80.0, 5000000, "마케팅부");
//        pc.show();
//        int[] employeeCount = pc.personCount();
//        System.out.println("직원수: " + employeeCount[1]);





    }
}
