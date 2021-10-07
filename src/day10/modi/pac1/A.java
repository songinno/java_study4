package day10.modi.pac1;

public class A {

    //필드에 접근제한자를 붙일 수 있음. (변수에는 못붙임)
    public int f1;
    int f2; // 앞에 아무것도 안쓰면 default
    private int f3;


    public void m1() { // 메서드에도 o
        int a = 10; // 이건 변수. -> 접근제한자x
    }

    void m2() {}
    private  void m3() {}

    public A() {
        f1 = 1; f2 = 2; f3 = 3;
        m1();m2();m3();
    }
}
