package day01;

public class DataType {
    public static void main(String[] args) {
        // #정수 타입
        byte a = 128 - 1;
        // 128: 타입 int, 1: 타입 int / a: 타입 byte
        short b = 32768 - 1;
        // 32768: 타입 int
        //int c = 2147483648 - 1;
        // 2147483648: 리터럴, 타입 int -> 저장 불가. 범위 초과.
        //long d = 20000000000;
        //  20000000000 : 타입 int -> 범위 초과. 저장 불가.

        // => L을 붙여주면 O
        long d = 20000000000L;
        System.out.println("d = " + d);

        System.out.println("----실수타입-----");
        //# 실수타입
        float f1 = 1.234567F; // 4byte ,F붙여줘야함. 잘 안쓰긴함.
        double d1 = 1.234567; // 8byte

        float f2 = 1321.234567891234F;
        double d2 = 123211.234567891234;
        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);
        // float은 소숫점 자리가 많이 짤린다. double은 더 짤린다. 라고 알아두기.

        //# 논리타입
        // true, false 로만 표현 가능. (나머지 다 안됨.)
        System.out.println("----문자타입----");
        // #문자타입
        // 단일 문자
        char c1 = 'A';  // 한글자만 저장할 때는 쌍따옴표X, 홑따옴표로O
        char c2 = 97; // 정수도 가능.
        char c3 = 0x41; // 16진수도 가능.
        char c4 = 54444;
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("c2 = " + c2);

        System.out.println("----문자열-----");
        // 문자열
        String s1 = "hey!";
        String s2 = "my name is Hong~";
        System.out.println(s1 + s2);

        String msg = "여기는 아주 \"위험해\"!"; // 위험해 강조하고 싶음. -> 역슬래쉬로.
        System.out.println(msg);

    }
}
