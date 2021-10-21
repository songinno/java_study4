package day16.exception; //2

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("정수: ");
                int num = sc.nextInt(); // 1) warn: 정수를 입력 안하는 경우
                // 우리가 10을 입력하면, 10\n 을 치는거. 10만 떼어서 num으로 가져가고, \n은 남아있음.
                // 메롱이라고 치면, 메롱\n가 남아있고, catch로 감. catch에 메롱\n가 남아 있어서 nextInt에 메롱\n가 입력됨.
                // 그럼 다시 catch로 갔다가 다시 sc.nextInt로감. 이렇게 계속 반복 무한루프. -> nextLine() 으로 남은걸 먹음.
                System.out.println("입력된 정수: " + num);
                System.out.println(10 / num); // 2) warn: 0을 쓰는 경우.
                break;
            } catch (InputMismatchException e) {
                sc.nextLine(); // 얘한테 먹여줌.
                System.out.println("정수로만 입력하세요.");
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
            //예외 발생 상황이 2개인 경우 catch를 각 상황에 따라 적어줘야하기 때문에(구분해야함), 예외 이름을 알아야함.
            //Exception으로는 구분이 안되니까.
            //에러 많이 알아두기.
        }

        sc.close();
        System.out.println("프로그램 정상종료");

        //5.5 썼더니 -> InputMismatchException 발생.

    }

}
