package day13.static_;

public class Calculator {

//    static String madeBy;
    String madeBy; //제조사
    String color; // 색상

    static double pi = 3.14; // 원주율 -> static

    void paint() {
        this.color = "빨강";
    }
    static double 원의넓이를계산(int 반지름) {
        return 반지름 * 반지름 * pi;
    }


    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.madeBy = "샤프";

        Calculator c2 = new Calculator();
        c2.madeBy = "카시오";

        System.out.println("c1의 모델명 = " + c1.madeBy); //-> 카시오. madeBy에 static 붙이면 안됨.

        double result1 = Calculator.원의넓이를계산(5);
        System.out.println("result1 = " + result1);

        Math.random(); // -> static

        //main도 static -> 프로그램에서 딱 1개여야함.
    }

}
