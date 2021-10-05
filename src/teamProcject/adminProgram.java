package teamProcject;

import java.util.Arrays;
import java.util.Scanner;

public class adminProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //---------------------* main 화면---------------------------
            System.out.println("====메뉴 관리 프로그램====");
            System.out.println("# 1. 메뉴 신규등록");
            System.out.println("# 2. 모든 메뉴정보 보기");
            System.out.println("# 3. 메뉴 검색");
            System.out.println("# 4. 메뉴 수정");
            System.out.println("# 5. 메뉴 삭제");
            System.out.println("# 6. 종료");
            System.out.println("(# 0. 첫 화면으로)");
            System.out.println("=========================");
            System.out.print("메뉴 번호 입력: ");
            int selectMenuNumber = sc.nextInt();
            sc.nextLine();

            if (selectMenuNumber == 6) break;

            else {
                //* 메뉴 정보 배열 생성
                int[] menuNumber = {0,1,2,3};
                String[] menuName = {"치킨버거", "불고기버거", "한우버거", "새우버거"};
                String[] mainIngredient = {"닭", "돼지", "소", "새우"};
                String[] baseSauce = {"양념치킨소스", "불고기소스", "불고기소스", "타르타르"};
                int[] price = {5000, 5500, 6000, 4500};

                if (selectMenuNumber == 2) {
                    //-------------------------------#2. 모든 메뉴정보 보기-------------------------------
                    System.out.println("**************************** 전체 메뉴 정보 ***************************");
                    System.out.println("[메뉴번호]     [메뉴 이름]     [메인 재료]     [기본 소스]     [판매 가격]");
                    for (int i = 0; i < menuNumber.length; i++) {
                        System.out.printf("    %d          %s         %s           %s      %d"
                                , menuNumber[i], menuName[i], mainIngredient[i], baseSauce[i], price[i]);
                        // ??? : 위치에 맞게 글자 정렬이 안됨.
                        System.out.println("\n====================================================================");
                    }
                    System.out.println("확인하셨으면 <enter>를 눌러주세요");
                    sc.nextLine();
                } // end #2

                else if(selectMenuNumber == 5) {
                    //-------------------------------#5. 메뉴 삭제-------------------------------
                    while (true) {
                        System.out.println("삭제하실 메뉴 이름을 입력해주세요.");
                        System.out.println("현재 메뉴 목록: " + Arrays.toString(menuName));
                        System.out.println("(# 0. 첫 화면으로)");
                        System.out.print("> ");
                        String deleteMenu = sc.next();
                        if (deleteMenu.equals("0")) break;

                        //(1) 입력한 메뉴 배열 순차 탐색
                        int deleteMenuIndex = -1;
                        for (int i = 0; i <menuName.length; i++) {
                            if (deleteMenu.equals(menuName[i])) {
                                deleteMenuIndex = i; // 삭제할 인덱스 번호 확인.
                                break;
                            }

                        }
                        //(2) 삭제할 메뉴 인덱스를 모든 배열에서 삭제하기.
                        if (deleteMenuIndex != -1) {
                            System.out.println("정말 삭제하시겠습니까? [y/n]");
                            System.out.print("> ");
                            String answer = sc.next();

                            if (answer.equals("y")) {
                                //1) 메뉴 번호 배열에서 삭제
                                //현재 menuNumber: [0,1,2,3] / tempMenuNumber: [0,0,0]
                                int[] tempMenuNumber = new int[menuNumber.length - 1];
                                for (int i = 0; i < tempMenuNumber.length; i++) {
                                    tempMenuNumber[i] = menuNumber[i];
                                } // -> tempMenuNumber: [0,1,2]
                                menuNumber = tempMenuNumber;
                                tempMenuNumber = null;

                                // 2) 메뉴 이름 배열에서 삭제
                                String[] tempMenuName = new String[menuName.length - 1];
                                //현재 menuName: [치킨버거, 불고기버거, 한우버거, 새우버거] / tempMenuName: [null,null,null]
                                for (int i = 0; i < tempMenuName.length; i++) {
                                    tempMenuName[i] = menuName[i];
                                } // -> tempMenuName: [치킨버거, 불고기버거, 한우버거]
                                for (int n = deleteMenuIndex;  n < tempMenuName.length; n++) {
                                    tempMenuName[n] = menuName[n+1];
                                } //-> tempMenuName: [치킨버거, 한우버거, 새우버거]
                                menuName = tempMenuName;
                                tempMenuName = null;

                                System.out.println("정상 삭제 되었습니다.\n");
                                break;
                            }
                            else {
                                System.out.println("삭제가 취소되었습니다.\n");
                            }
                        }
                        else {
                            System.out.printf("\"%s\"는 없는 메뉴입니다.\n\n", deleteMenu);
                        }
                    }
                }//end #5
            }
            }




    } //end main


} //end class
