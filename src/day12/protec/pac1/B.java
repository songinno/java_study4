package day12.protec.pac1;

public class B {
    public B() {
        A a = new A();
        a.f1 = 1;
        a.f2 = 2;
        a.m1();
        a.m2();
        //A 같은 패키지 -> 모두 가능
    }
}
