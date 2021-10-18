package com.kh.hw.person.contoroller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

import java.util.Arrays;

public class PersonController {

    private Student[] s = new Student[3];

    private Employee[] e = new Employee[10];

    //더미
    public PersonController() {
        s[0] = new Student("강건강", 20, 178.2, 70.0, 1, "정보시스템공학과");
//        s[1] = new Student("남나눔", 21, 187.3, 80.0, 2, "경영학과");

        e[0] = new Employee("박보배", 26, 180.3, 72.0, 1000000, "영업부");
        e[1] = new Employee("송성실", 38, 182.0, 76.0, 2000000, "기획부");
    }

    //--------------------메서드--------------------
    //1) 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메서드
    public int[] personCount() {
        int[] count = new int[2];
        //학생 숫자 카운트
        for (int i = 0; i < s.length; i++) {
            if(s[i] == null) break;
            count[0]++;
        }
        for (int i = 0; i < e.length; i++) {
            if(e[i] == null) break;
            count[1]++;
        }

        return count;
    }
    //2) 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
        if(personCount()[0] < 3) {
            int studentCount = personCount()[0];
            s[studentCount] = new Student(name, age, height, weight, grade, major);;
        } else {
            System.out.println("최대 인원 3명 초과");
        }
    }

    //3) 학생 객체 배열의 주소를 반환하는 메소드
    public Student[] printStudent() {
        return s;
    }

    //4) 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
        if(personCount()[1] < 10) {
            int employeeCount = personCount()[1];
            e[employeeCount] = new Employee(name, age, height, weight, salary, dept);;
        } else {
            System.out.println("최대 인원 10명 초과");
        }
    }
    //5) 직원 객체 배열 주소 반환 메서드
    public Employee[] printEmployee() {
        return e;
    }


    //전체 조회
    public void show() {
        for (Student student : s) {
            System.out.println(student);
        }
        for (Employee employee : e) {
            System.out.println(employee);
        }
    }


}
