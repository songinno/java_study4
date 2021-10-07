package day10;

//import day10.car.Avante;
//import day10.car.Santafe;

import day10.car.*;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        new Apple(); // => 그냥 Apple

        new day10.juice.Apple(); // 주스 패키지에 있는 Apple을 쓰고 싶을 때. -> 패키지의 경로를 밝혀줘야함.

        //그런데 하위 폴더가 엄청 많을때는? -> 패키지 밑에다가 import 선언
        new Avante();
        new Santafe();
        //car 패키지에 import할 클래스가 잔뜩있을때는 -> import day10.car.*;

//        new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in); // 풀네임
//        Arrays.toString();
    }
}
