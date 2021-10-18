package com.kh.hw.person.view;

import com.kh.hw.person.contoroller.PersonController;
import com.kh.hw.person.model.vo.Student;

import java.util.Arrays;
import java.util.Scanner;

public class PersonMenu {
    private Scanner sc = new Scanner(System.in);
    private PersonController pc = new PersonController();

    public void mainMenu() {
        //----------------------mainMenu----------------------
        while (true) {
            System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
            System.out.printf("현재 저장된 학생은 %d명 입니다.\n", pc.personCount()[0]);
            System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
            System.out.printf("현재 저장된 사원은 %d명 입니다.\n", pc.personCount()[1]);
            System.out.println("");
            System.out.println("---메뉴---");
            System.out.println("1. 학생메뉴");
            System.out.println("2. 사원메뉴");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 >");
            int mainMenuNum = sc.nextInt();

            switch (mainMenuNum) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    employeeMenu();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. y/n");
                    String exit = sc.nextLine();
                    switch (exit) {
                        case "y":
                        case "Y":
                        case "ㅛ":
                            System.exit(0);
                        case "n":
                        case "N":
                        case "ㅜ":
                            break;
                        default:
                            System.out.println("잘못 입력하셨습니다.");
                            break;
                    }
            }
        }

    }//end mainMenu

    //1. 학생메뉴
    public void studentMenu() {
        System.out.println("----------학생메뉴----------");
        System.out.println("1. 학생 추가");
        System.out.println("2. 학생 보기");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 >");
        int studentMenuNum = sc.nextInt();
        sc.nextLine();

        switch (studentMenuNum) {
            case 1:
                insertStudent();
                break;
            case 2:
                printStudent();
                break;
            case 9:
                return;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }
    //1-2 학생 보기 메서드
    private void printStudent() {
        Student[] students = pc.printStudent();
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("");
    }

    //1-1 학생 추가 메서드
    private void insertStudent() {
        while (true) {
            if (pc.personCount()[0] < 3) {
                System.out.print("학생 이름: ");
                String name = sc.nextLine();
                System.out.print("학생 나이: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("학생 키: ");
                double height = sc.nextInt();
                sc.nextLine();
                System.out.print("학생 몸무게: ");
                double weight = sc.nextInt();
                sc.nextLine();
                System.out.print("학생 학년: ");
                int grade = sc.nextInt();
                sc.nextLine();
                System.out.print("학생 전공: ");
                String major = sc.nextLine();
                pc.insertStudent(name, age, height, weight, grade, major);

                System.out.println("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요");
                String continue_ = sc.nextLine();
                switch (continue_) {
                    case "n":
                    case "N":
                        return;
                    default:
                        break;
                }
            } else {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에, 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
                return;
            }
        }
    }//end 1-1.학생 추가 메서드

    public void employeeMenu() {
        System.out.println("----------사원메뉴----------");
        System.out.println("1. 사원 추가");
        System.out.println("2. 사원 보기");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 >");
        int employeeMenuNum = sc.nextInt();
        sc.nextLine();

        switch (employeeMenuNum) {
            case 1:
            case 2:
            case 9:
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }


}//end class
