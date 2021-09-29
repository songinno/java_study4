package day05;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        String[] foods = {"치킨", "피자", "삼겹살", "족발", "파스타"};
        foods[0] = "양념치킨";
        Scanner sc = new Scanner(System.in);

        // #탐색 : 내가 찾는 데이터가 배열의 몇번 인덱스에 있는지

        //순차 탐색 알고리즘 : 처음부터 끝까지 순차적으로 찾음.
        System.out.print("찾는 음식: ");
        String target = sc.next();
        sc.close();

        int index = -1; // 찾은 인덱스
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        boolean result = index != -1;
        System.out.println("음식 탐색 성공??? " + result);
        System.out.println("찾은 음식의 인덱스 = " + index);

    }
}
