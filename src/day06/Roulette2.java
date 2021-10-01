package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int playerNum = 2;
        while (true) {
            System.out.print("게임 인원 (2 ~ 4명) ==> ");
            playerNum = sc.nextInt();

            if (playerNum < 2 || playerNum > 4) {
                System.out.println("인원 수가 올바르지 않습니다.\n");
            } else {
                break;
            }
        }

        System.out.println("\n플레이어 이름을 등록합니다.");

        //플레이어의 이름들을 저장할 배열
        String[] players = new String[playerNum];
        for (int i=0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름: ", i+1);
            String name = sc.next();
            players[i] = name;
        }
        System.out.println(Arrays.toString(players) + " 참가! ");

        System.out.print("\n실탄 개수 (6 미만) ==> ");
        int bulletNum = sc.nextInt();
        sc.nextLine();

        //탄창 배열을 생성
        boolean[] magazine = new boolean[6];
        //정확하게 총알을 세팅한 횟수
        int successCount = 0;
        while (successCount < bulletNum) {
            //랜덤정수 0~5 생성
            int position = (int) (Math.random() * magazine.length);
            if (magazine[position] == false) { //탄창이 비어있다면
                magazine[position] = true; //장전해라
                successCount++;
            }
//            if (successCount == bulletNum) break;
        }

//        System.out.println(Arrays.toString(magazine));

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        //===============게임 시작 로직=================//
        //선턴 플레이어는 랜덤결정, 결정된 이후에는 돌아가면서 발포
        int turn = (int) (Math.random() * playerNum);

        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[turn]);
        /*
           # 한턴 동안 벌어질 일들
           1. 탄창의 발포위치를 랜덤으로 재조정한다.
           2. 해당 위치에서 격발: 랜덤인덱스 위치값이 true인지 확인
           3. true에서 발포되었으면 사망판정, false였으면 다음 턴으로 넘김
         */
        while (true) {
            System.out.printf("\n[%s님의 턴!] 실린더를 돌립니다.\n", players[turn]);
            int bulletPosition = (int) (Math.random() * magazine.length);

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();

            //사망 판정
            if (magazine[bulletPosition]) {
                System.out.printf("\n빵!! [%s]님 사망....\n", players[turn]);
                //사망자를 players배열에서 삭제
                for (int i = turn; i < players.length-1; i++) {
                    players[i] = players[i+1];
                }
                String[] temp = new String[players.length-1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = players[i];
                }
                players = temp; temp = null;
                playerNum--;

                //System.out.println("남은 인원: " + Arrays.toString(players));

                //탄창 배열에서 총알이 나간 위치를 재조정
                magazine[bulletPosition] = false;
                bulletNum--;

                //게임 종료 조건 판단
                // 남은 플레이어가 1명일 때, 총알이 모두 소진되었을 때
                if (playerNum == 1) {
                    System.out.println("\n# 단 한명만 살아남았습니다. 게임을 종료합니다.");
                    System.out.println("최후 생존자: " + players[0]);
                    break;
                } else if (bulletNum == 0) {
                    System.out.println("\n# 총알이 모두 발사되었습니다. 게임을 종료합니다.");
                    System.out.println("남은 인원 정보: " + Arrays.toString(players));
                    break;
                } else {
                    System.out.println("\n# 남은 인원으로 게임을 계속 진행합니다.");
                    System.out.println("남은 인원 정보: " + Arrays.toString(players));
                    //혹시 사망자가 마지막 플레이어면 turn을 0으로 조정
                    if (turn == players.length) {
                        turn = 0;
                    }
                    continue;
                }


            } else {
                //생존한 경우: 턴을 넘김
                System.out.println("휴.... 살았습니다.");
                if (turn == players.length-1) {
                    //마지막 플레이어는 턴을 첫번째로 돌려놓는다.
                    turn = 0;
                } else {
                    turn++;
                }
            }
        }



    }
}