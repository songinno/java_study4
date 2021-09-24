package day01;

public class StdOutput {
    public static void main(String[] args) {
        String dog = "멍멍이";
        String cat = "야옹이";

        //ln 없이 출력.
        System.out.print(dog + "\n");
        System.out.print(cat + "\n");
        // -> 멍멍이야옹이 붙어서 나옴. 자동 줄넘김x. 그래서 + "\n" 해줌.

        // => println : 자동 줄바꿈까지 해주면서 출력.
        System.out.println(dog);
        System.out.println(cat);

        System.out.println("----------------------------------");
        int month = 10;
        int day = 3;
        String anni = "개천절";

        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");

        //정수: %d, 실수: %f, 문자: %s
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.println("메롱메롱");  // => souf 은 자동 줄개행x -> \n 걸어줘야함.

        //
        double saleRate = 0.2532;
        System.out.printf("할인비율: %f\n", saleRate); // -> %f는 소수점 6자리까지 표현.
        System.out.printf("할인비율: %.2f\n", saleRate); // -> 이렇게 자리수 조절 가능.

        System.out.printf("할인비율: %.2f%%\n", saleRate * 100); // %% 2개로 특수기호 % 넣어줄 수 있음.




    }
}
