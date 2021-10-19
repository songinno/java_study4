package day14.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("--------------------");

        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("--------------------");
        Parent upChild = new Child();
        upChild.m2(); // 뭐가 나올까. -> 오버라이딩된 2번 메서드
        //타입이 변환 됐어도, 근본은 Child임.
        System.out.println(upChild); // ->Child@
//        upChild.m3(); // 근데 m3는 안됨.
        //-> 부모의 가면을 써서 제약이 걸림
        //다형성을 위해 Parent로 타입을 up 시켰는데. 자기 메서드를 못쓰게됨.

        //못쓰는데 그럼 m3 왜만들었냐.
        //둘 다 쓰고싶다.
        // ->
        ((Child) upChild).m3(); // 자기꺼 쓸때만 잠깐 내림.(downCasting)

        //클래스 Sonata에서 계속




    }
}
