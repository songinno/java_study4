package day12.protec.pac2;

import day12.protec.pac1.A;

public class D extends A {
    public D() {
//        super.f1 = 1; // protected -> o
        this.f1 = 1; // this로도 가능 (어짜피 super임)

//        super.f2 = 2; // default -> 안됨.
//        super.m1(); //protected -> o
        this.m1(); // this로도 가능

//        super.m2(); // default -> 안됨.
    }
}
