package day02;

public class Casting2 {
    public static void main(String[] args) {

        // #
        char c = 'B';
        int i = 2;
        System.out.println(c + i); // -> 68
        // char(c)가 int로 바뀜. int result = c + i;
        // => 크기가 다른 타입끼리의 연산은, 작은 것을 큰 것으로 변환시킴.

        // 억지로 char로 할 수는 있음.
        char result2 = (char) (c + i);
        System.out.println("result2 = " + result2);

        // #
        System.out.println(30.0 + 50); //double과 int의 연산 -> int가 double로 => 80.0

        // # int보다 작은 타입들(byte, char, short) 끼리의 연산은, 결과가 자동으로 int로 처리됨.
        // (원래 같은 타입끼리의 연산은 같은 타입의 결과가 나오는게 정상임.
        // 그런데 용량? 이 너무 작아서 위험하다 판단하여 자동으로 바꿔버림 int로)
        byte b1 = 100;
        byte b2 = 120;
//        byte b3 = b1 + b2; -> 연산 불가.
        int b3 = b1 + b2;
        System.out.println("b3 = " + b3);

        System.out.println("==============");
        // # 5.4가 나오게 하고싶음
        int n1 = 27, n2 = 5;
//      원래, double result3 =  n1 /  n2;
        double result3 = (double) n1 / (double) n2; // 한쪽만 double을 줘도 5.4 나눔. 큰걸로 형변환 일어나서.

        System.out.println("result3 = " + result3);

        //# 형변환 방향 : long(8byte) ~> float(4byte)  ??? => 값의 표현 범위로 따져야함. (실수가 정수보다 큼)
    }
}
