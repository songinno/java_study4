package day03;

import java.util.Scanner;

public class ScannerQuiz {
    public static void main(String[] args) {

        System.out.println("****상품재고 총액 구하기****");

        Scanner sc = new Scanner(System.in);

        System.out.print("상품의 가격: ");
        int p = sc.nextInt();
        System.out.print("상품의 개수: ");
        int q = sc.nextInt();

        System.out.printf("상품 재고 총액: %d", p*q );
        sc.close();
    }
}
