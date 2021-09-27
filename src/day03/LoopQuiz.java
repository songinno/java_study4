package day03;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int i1 = sc.nextInt();

        System.out.print("정수2: ");
        int i2 = sc.nextInt();

        sc.close();

        int total = 0;
        for (int a = i1; a <= i2; a++) {
            total += a;
        }
        System.out.printf("%d~%d까지의 누적총합: %d\n", i1, i2, total);


    }
}
