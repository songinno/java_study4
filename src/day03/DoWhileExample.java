package day03;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        int number = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("정수: ");
            number = sc.nextInt();
            total += number;
        }while (number != 0);
        System.out.println("입력된 누적총합: " + total);
        sc.close();

        //while 블록 내의 코드들을 do 블록으로다 옮기고. while 블록 없애고 ;으로 마감처리

    }
}

