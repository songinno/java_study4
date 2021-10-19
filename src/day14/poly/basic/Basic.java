package day14.poly.basic;

class A { // 추가 클래스에는 public x

}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
//////////////모니터//////////////////////////////////
class Computer{
    Monitor monitor;
}
class Monitor {}
class LGMonitor extends Monitor{}
class HPMonitor extends Monitor{}

public class Basic { // public이 붙은 클래스 = 파일명
    A x1 = new A();

    // 상속에 의해 부모 타입 사용 가능.
    A x2 = new B();
    A X3 = new C();

    B x4 = new D();
    A x5 = new D();

    C x6 = new E();
    A x7 = new E();

    //A의 부모-> 오브젝트. Object 타입 전부 사용 가능.

    Object x8 = new A();
    Object x9 = new B(); //new C,D,E

    /////////////// 모니터/////////////////////
    public static void main(String[] args) {

        Computer com = new Computer();
        com.monitor = new LGMonitor(); //됨
        com.monitor = new HPMonitor(); //안됨
        //class Monitor 만들고, 클래스2개에 extends Monitor 걸고, 클래스컴퓨터의 필드 이름을 LGmonitor -> 그냥 Monitor로 변경  -> 됨

        //이종모음구조

//        int[] arr = {10, "메롱", 5.5, true}; // -> 동종모음구조라서 int 말고는 안됨.

        LGMonitor[] lgmonitors = {
            new LGMonitor()
                , new LGMonitor()
                , new LGMonitor()
                , new LGMonitor()
        };

        HPMonitor[] hpmonitors = {
                new HPMonitor()
                , new HPMonitor()
                , new HPMonitor()
        };

        Monitor[] monitors = {
                new LGMonitor()
                , new HPMonitor()
        };

        double[] dArr = {1.1, 2.2, 10, 10.5};
        // 10은 int인데 자동변환. 이거랑 비슷한 얘기

        //Object로 하면 다 가능
        Object[] arr = {5, 3.14, "hello", new LGMonitor()};
        //다른 데이터들 섞여서 별로 안좋음.



    }
}
