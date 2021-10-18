package day13.final_;

class Children {
//    @Override
//    void m1() {
//        super.m1();
//    }
    //-> m1은 final이라 오버라이딩 불가능.

//    @Override
//    void m2() {
//        super.m2();
//    }
    //-> class Parent에 final 붙여서 children 에서 extends Parent 불가. 오버라이딩 전체 불가.
}

public final class Parent {
    final void m1() {

    }
    void m2() {

    }
}
