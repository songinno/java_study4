package day02;

public class RandomExample {
    public static void main(String[] args) {

        double rn = Math.random(); // 0.0 이상 ~ 1.0 미만 실수 생성
        System.out.println("rn = " + rn);

        /*
            #1~10 랜덤 정수
            Math.random() -> 0.0 이상 ~ 1.0 미만
            Math.random() * 10 -> 0.0 ~ 10.0
            (int) Math.random() * 10 -> 0 ~ 10
            (int) (Math.random() * 10) + 1 -> 1 ~ 11

            => x이상 y이하 랜덤정수
            (int) (Math.random() * y - x + 1) + x -> x 이상 ~ y 이하
         */

        System.out.println((int) (rn * 10 + 1)); // -> 1 부터 10까지 랜덤 정수

    }
}
