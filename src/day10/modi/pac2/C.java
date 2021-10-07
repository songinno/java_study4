package day10.modi.pac2;

import day10.modi.pac1.A;

public class C {

    public C() {
        A a = new A(); // -> 패키지 다름. import.

        a.f1 = 1;
//        a.f2 = 2; // 안됨. default
//        a.f3 = 3; // 안됨. private

        a.m1(); // m2, m3안됨.
    }
}
