package com.kh.hw.person.model.vo;

public class Employee extends Person {
    //필드
    private int salary; // 급여
    private String dept; //부서

    //생성자
    public Employee() {
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    //메서드
    public String toString() {
        return this.getName() + ", " +  this.getAge() + ", " + this.getHeight() + ", " + this.getWeight() + ", " + salary + ", " + dept;
    }
}
