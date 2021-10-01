package day07;

public class MethodBasic {
    // 1. 자바의 메서드는 클래스 내부, 메서드 외부에 선언합니다.
    //java는 함수(메서드) 안에 함수 못만듦 (중첩함수x) -> main도 함수. main 안에 x
    //class 안에서만 함수 생성 가능.
    // 2. 메서드의 호출은 메서드나 생성자 내부에서만 가능.

    // # 메서드 만들기
    // 1~x까지의 누적합
    static int calcTotal(int x) { //function 자리에, static + return 되는 데이터의 타입 / 매개변수에도 받을 타입 적어주기.
        int total = 0;
        for (int n = 1; n <= x; n++) {
            total += n;
        }
        return total;
    }


    public static void main(String[] args) {

        int result = calcTotal(10);
        System.out.println("result = " + result);

        int result2 = calcTotal(100);
        System.out.println("result2 = " + result2);


    }




} // end class
