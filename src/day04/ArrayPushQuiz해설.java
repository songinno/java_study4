package day04;

import java.util.*;
public class ArrayPushQuiz해설 {
    public static void main(String[] args) {
        //문자열끼리의 동등비교 시 ==을 사용하지 말고
        // 문자열1.equals(문자열2) 를 사용할 것!
        // ex) if (s1 == s2)  (x)
        //     if (s1.equals(s2)) (o)


        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        Scanner sc = new Scanner(System.in);

        String[] foodList = {};
        while (true) {
            //음식을 한번 입력받을 때 해야 할 일
            //1. 일단 음식명을 입력받아야 함. -> 스캐너가 필요함
            System.out.print("> ");
            String newFood = sc.nextLine();

            if (newFood.equals("그만")) {
                break;
            }

            //2. 배열에 신규데이터가 들어갈 공간 확보
            String[] temp = new String[foodList.length + 1];

            //3. 기존에 저장된 음식들을 모두 신규배열로 복사
            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }
            //4. 신규데이터를 마지막 인덱스에 추가
            temp[temp.length-1] = newFood;
            foodList = temp;
            temp = null;
        }//end while

        System.out.println("먹고 싶은 음식: " + Arrays.toString(foodList));
        sc.close();

    }
}