package day16.exception; //1

public class TryExample1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 0;
        System.out.println("나눗셈 시작");

        try {
            // 예외 발생 가능성이 있는 코드. 여기다가 예외처리를 함.
            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (Exception e) { // (): 어떤 오류가 났을 때를 적어줌.-> 모르니까 가장 최상위인 예외인 Exception 적어줌(다형성 이용)
            //예외 발생시 작성할 코드
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램 정상 종료");


    }
}