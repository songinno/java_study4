package day17.inter;

//public abstract class Pet {
//    public abstract void feeding();
//}
// => interface로 바꾸기.
public interface Pet {

    //인터페이스는 기본적으로 추상메서드만 선언할 수 있다.
//    public void play() {} //-> 안됨.
    //객체 생성 new Pet(); -> 안됨.
//    public int a; //-> 필드 생성도 안됨.
    public static final int A = 100; //-> 상수만 선언 가능. (기울임체 = 상수)
    int ABC = 50; // -> 아무것도 안쓰고 만들면 상수임.


    //그럼 왜 쓰는거? = 다중상속때문에



    void feeding();
}