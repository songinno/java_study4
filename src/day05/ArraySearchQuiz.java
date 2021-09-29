package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        /*
        * 변경 전 정보: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]
        - 수정할 멤버의 이름을 입력하세요.
        > 김현중
        김현중은(는) 없는 이름입니다.
        - 수정할 멤버의 이름을 입력하세요.
        > 유노윤호
        유노윤호의 별명을 변경합니다.
        > 아이노유돈노
        변경 완료!
        * 변경 후 정보: [영웅재중, 최강창민, 시아준수, 믹키유천, 아이노유돈노]
         */

        String[] dbsg = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String target = sc.next();

            for (int i = 0; i < dbsg.length; i++) {

                if (target.equals(dbsg[i])) {
                    System.out.println(target + "의 이름을 변경합니다.");
                    System.out.print("> ");
                    String newName = sc.next();
                    dbsg[i] = newName;
                    System.out.println("변경완료!");
                    System.out.println("*변경 후 정보" + Arrays.toString(dbsg));
                    break;
                }
            }



        }

    }
}
