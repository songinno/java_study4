package day13.static_;

public class Count {
    //(1)필드
    public int x; // -> 인스턴스 필드
    public static int y; // -> 스태틱 필드

    //(2)메서드
    //인스턴스 메서드
    public void m1() {
        System.out.println("x: " + x);
    }
    //스테틱 메서드
    public static void m2() {
//        System.out.println("x: " + x); // -> x는 불가능.
        System.out.println("y: " + y); // static 데이터 y는 참조 가능.
    }


}
