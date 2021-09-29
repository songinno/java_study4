package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dbsg = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("*우리반 학생들의 별명: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");
        System.out.println("-삭제할 학생의 별명을 입력하세요!");
        System.out.print("> ");
        String target = sc.next();

        //탐색
        int index = -1;
        for (int i = 0; i < dbsg.length; i++) {
            if(target.equals(dbsg[i])) {
                index = i; break;
            }
        }

        int delIdx = index;
        if (index != -1) {
            System.out.println(target + "의 별명을 삭제합니다.");
            //삭제 알고리즘
            for (int i = delIdx; i < dbsg.length - 1; i++) {
                dbsg[i] = dbsg[i + 1];
            }
            String[] temp = new String[dbsg.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = dbsg[i];
            }
            dbsg = temp; temp = null;
            System.out.println("*삭제 후 정보:" + Arrays.toString(dbsg));


        }
        else {
            System.out.printf("해당 별명 (%s)은 존재하지 않습니다.", target);
        }


    }
}
