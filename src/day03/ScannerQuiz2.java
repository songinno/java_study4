package day03;

import java.util.Scanner;

public class ScannerQuiz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("얼마있어요? >> ");
        int money = sc.nextInt();
        sc.close();

        String food = (money >= 5000) ? "김치찌개" : (money >= 2500) ? "라면" : (money == 0) ? "굶어" : "라면";
        System.out.println(food);

    }
}
