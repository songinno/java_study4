package day02;

public class Casting1 {
    public static void main(String[] args) {

        // # 묵시적 형변환 (promotion, upcasting)
        //작은 데이터를 큰 데이터로
        byte a = 100; // a 용량 : 1byte
        int b = a; // b 용량 : 4byte
        // 둘이 타입 다름. 원래는 연산x. 묵시적 형변환으로 a(byte타입)를 int로 바꿔서 저장시킴.
        double c = b; // c 용량 : 8byte
        System.out.println(c);

        // # 명시적 형변환(downcasting)
        int n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m); // m = -24, *downcasting은 데이터 손실 위험이 있어서 조심해야함.

        System.out.println("--------------------");
        // 일부러 버려야 하는 경우 ex) 2000천원으로 600원짜리 과자 몇개 살 수 있을까
        int money = 2000;
        double price = 600.0;

//        double result = money / price;
        int result = (int) (money / price);
        System.out.println("result = " + result); // 3.3333333 -> 소숫점 버려야함.
        //그래서 double result = money / price; 를 int result = (int)(money / price); 로 변환.

        // #
        char r = 'A'; // r : 2byte
        int o = r; // -> upcasting
        System.out.println("o = " + o);

//        short p = (short) o;  : 이상 없음.
        short p = (byte) o; // <=> short p = (short(byte)) o;  : 형변환 2번
        System.out.println("p = " + p);

    }
}
