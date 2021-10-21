package day06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int playerNum = 0;
        while (true) {
            System.out.print("게임 인원 (2~4명) ==> ");
            try {
                playerNum = sc.nextInt();
                if (playerNum < 2 || playerNum > 4) {
                    System.out.println("인원수가 올바르지 않습니다.(2~4명)\n");
                }
                else break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("2~4까지의 정수로만 입력해주세요.");
            }
        }

        System.out.println("\n플레이어 이름을 등록합니다.");

        String[] players = new String[playerNum];
        for (int i=0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름: ", i+1);
            String name = sc.next();
            players[i] = name;
            }
        System.out.println(Arrays.toString(players) + "참가!");



        int bulletNum = 0;
        while (true) {
            int inputNum = 0;
            try {
                System.out.print("\n실탄 개수 (6 미만) ==> ");
                inputNum = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("정수로만 입력해주세요");
            }
            if (inputNum < 1 || inputNum > 6) {
                System.out.println("1~6 까지의 숫자를 입력해주세요.");
            }
            else {
                bulletNum = inputNum;
                break;
            }
        }

        //탄창 배열 생성
        boolean[] magazine = new boolean[6]; // 현재 다 false.

        //정확하게 총알을 세팅한 횟수
        int successCount = 0;
        while (true) {
            // 0번~5번 랜덤숫자 생성
            int position = (int) (Math.random() * magazine.length);
            if (!magazine[position]) { // 탄창이 비어있다면
                magazine[position] = true; // 실탄 랜덤위치에 장착.
                successCount++; // 장전 성공했으면 카운트 +1
            }
            if (successCount == bulletNum) {
                break;
            }

        }
        /*
        총알세팅 방법2)
        while (successCount < bulletNum) {
            int position = (int) (Math.random() * magazine.length);
            if (!magazine[position]) {
                magazine[position] = true;
                successCount++;
            }
         */
//        System.out.println(Arrays.toString(magazine)); // 실탄 위치 확인용

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        //======================== 게임 시작 로직==============================//
        //선턴은 랜덤. 결정된 이후에는 돌아가면서 발포.
        int turn = (int) (Math.random() * playerNum);
        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[turn]);
        /*
            #한턴동안 벌어질 일들
        1. 탄창의 발포위치를 랜덤으로 재조정
        2. 해당 위치에서 격발: 랜덤 인덱스 위치값이 true인지 확인.
        3. true에서 발포되었으면 사망판정. false였으면 다음 턴으로 넘김.
        */

        while (true) {
            System.out.printf("[%s의 턴!], 탄창을 무작위로 돌립니다.\n", players[turn]);
            System.out.println("# enter를 누르면 격발합니다.");

            int rn = (int) (Math.random() * 6);

            sc.nextLine(); // nextInt, next 들은 뭐를 쓰고 enter를 누르면, \n은 안가져가고 버림.
            // 버려져서 나돌던 \n이 nextLine을 만나서 누르지도 않았는데 실행되어버림.
            //sc.nextLine(); // 이렇게 쓰면 나돌던 \n을 먹어줄 수 있음. 그래서 여기다 안쓰고 위에썼던 next나 nextInt 밑에 써서 먹어주게 함.

            if (!magazine[rn]) { // 생존한경우
                System.out.println("피했다.");

                //만약 현재 턴이 마지막 플레이어라면, 다음 턴은 0번으로
                if (turn == players.length - 1) {
                    turn = 0;
                }
                //그게 아니면 다음 턴은 1 증가
                else {
                    turn++;
                }
            } else {
                System.out.println("죽었다.");
                break;
            }
        }












    } // end main
}
