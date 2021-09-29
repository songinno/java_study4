package day05;

import java.util.*;


public class ArraySearchQuiz해설 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수"
                , "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String target = sc.next();

            //탐색 알고리즘
            int index = -1;
            for (int i = 0; i < tvxq.length; i++) {
                if (target.equals(tvxq[i])) {
                    index = i; break;
                }
            }

            //수정 여부 결정
            if (index != -1) {
                System.out.println(target + "의 별명을 변경합니다.");
                System.out.print("> ");
                String newName = sc.next();
                tvxq[index] = newName;
                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", target);
            }
        }

    }
}