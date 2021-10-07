package day10.modi.pac1;

public class B {
    public B() {
        A a = new A();
        a.f1 = 1;
        a.f2 = 2;
//        a.f3 = 3;  // -> 에러발생 private이라서.

        a.m1();
        a.m2();
//        a.m3(); // -> 에러. private이라서.
    }
}
