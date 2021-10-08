package teamProcject;

import java.util.Arrays;
import java.util.Scanner;

public class MenuManagementProgram11 {

    // * 1차 int배열 반복문 메서드
    static void loop1(int[] a) {
        for (int i : a) {
            System.out.print(i + "         ");
        }
    }
    // * 2차 String배열 반복문 메서드
    static void loop2(String[][] a, int b) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][b] + "    ");
        }
    }

    ///////////////////////////////main/////////////////////////////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //메뉴 저장할 2차 배열 생성
        String[][] menuList = {
                {"1", "참치샌드위치", "참치", "마요네즈"},
                {"2", "치킨샌드위치", "치킨", "머스타드"}
        };

        //판매 가격 배열 생성
        int[] price = {6000, 7000};
        //메뉴 판매개수 저장할 배열 생성
        int[] salesNum = {0, 0};

        //프로그램 실행
        while (true) {
            System.out.println("##### 🌯 Sandwich & Burger 🍔 메뉴 관리 프로그램 #####");
            System.out.println("==================================================");
            System.out.println("1. 신규 등록");
            System.out.println("2. 전체 조회");
            System.out.println("3. 메뉴 수정");
            System.out.println("4. 메뉴 삭제");
            System.out.println("5. 판매개수 입력");
            System.out.println("6. 매출 현황 조회");
            System.out.println("7. 프로그램 종료");
            System.out.println("==================================================");
            System.out.print("원하는 메뉴 번호를 입력하세요. >>> ");
            int menuNum = sc.nextInt();
            sc.nextLine();

            //------------------------------1. 신규 등록------------------------------
            if (menuNum == 1) {
                System.out.println("# 새 메뉴를 등록합니다. (재료나 추천소스가 여러가지이면 콤마(,)로 구분합니다.)");
                //메뉴 번호는 자동으로 입력
                //빈 2차배열 생성
                String[][] temp = new String[menuList.length + 1][4];
                int[] salesTemp = new int[salesNum.length + 1];
                int[] priceTemp = new int[price.length + 1];
                //빈 배열에 데이터 복사
                for (int i = 0; i < menuList.length; i++) {
                    temp[i] = menuList[i];
                    salesTemp[i] = salesNum[i];
                    priceTemp[i] = price[i];
                }
                //메뉴 추가
                //번호 부여
                temp[menuList.length][0] = "";
                temp[menuList.length][0] += temp.length;

                System.out.print("- 메뉴이름 : ");
                String newName = sc.nextLine();
//                sc.nextLine();
                temp[menuList.length][1] = newName;


                System.out.print("- 주 재료 : ");
                String newMainIgd = sc.nextLine();
//                sc.nextLine();
                temp[menuList.length][2] = newMainIgd;

                System.out.print("- 추천소스 : ");
                String newSause = sc.nextLine();
//                sc.nextLine();
                temp[menuList.length][3] = newSause;

                System.out.print("- 판매가격 : ");
                int newPrice = sc.nextInt();
                sc.nextLine();
                priceTemp[price.length] = newPrice;

                salesTemp[salesNum.length] = 0;


                menuList = temp;
                salesNum = salesTemp;
                price = priceTemp;
//                System.out.println(Arrays.toString(temp[0]));
                temp = null;
                salesTemp = null;
                priceTemp = null;

                System.out.println("메뉴가 정상적으로 등록되었습니다.\n");
            } // end 1

            //------------------------------2. 전체 조회------------------------------
            else if (menuNum == 2) {
                System.out.println("************************************** 전체 메뉴 정보 *************************************");
                System.out.println("[메뉴번호]     [메뉴이름]     [메인재료]     [추천소스]     [판매가격]      [판매개수]");
                System.out.println("=========================================================================================");
                for (int i = 0; i < menuList.length; i++) {
                    System.out.printf(" %s          %s         %s           %s      %d원       %d"
                            , menuList[i][0], menuList[i][1], menuList[i][2], menuList[i][3], price[i], salesNum[i]);
                    // ??? : 위치에 맞게 글자 정렬이 안됨.
                    System.out.println("\n----------------------------------------------------------------------------------------");
                }
                System.out.println("엔터(Enter)를 누르시면 메뉴선택 화면으로 이동합니다.");
                sc.nextLine();
            } // end 2

            //------------------------------3. 데이터 수정------------------------------
            else if (menuNum == 3) {
                while (true) {
                    System.out.println("-현재 메뉴 목록-");
                    for (int i = 0; i < menuList.length; i++) {
                        System.out.print("(" + (i + 1) + ")" + menuList[i][1] + " ");
                    }
                    System.out.print("\n# 수정할 메뉴의 번호를 입력하세요. : ");
                    int editNum = sc.nextInt();
                    sc.nextLine();

                    //입력한 메뉴 번호가 데이터에 있는 경우
                    if (editNum < menuList.length + 1) {
                        System.out.printf("%s의 정보를 수정합니다.\n", menuList[editNum - 1][1]);
                        System.out.println("[ 1. 메뉴 이름 변경 | 2. 재료 변경 | 3. 추천소스 변경 | 4. 판매가격 변경 | 5. 취소 }");
                        int changeMenu = sc.nextInt();
                        sc.nextLine();
                        if (changeMenu == 1) { //메뉴 이름 변경
                            System.out.println("# 변경할 메뉴 이름을 입력하세요.");
                            System.out.print("> ");
                            String changeMenuName = sc.nextLine();
//                            sc.nextLine();
                            System.out.printf("메뉴이름이 %s에서 %s로 변경되었습니다.\n", menuList[editNum - 1][1], changeMenuName);
                            menuList[editNum - 1][1] = changeMenuName;
                            break;
                        } else if (changeMenu == 2) { //재료 변경
                            System.out.println("# 변경할 재료를 입력하세요.");
                            System.out.print("> ");
                            String changeMainIgd = sc.nextLine();
//                            sc.nextLine();
                            System.out.printf("주 재료가 %s에서 %s로 변경되었습니다.\n", menuList[editNum - 1][2], changeMainIgd);
                            menuList[editNum - 1][2] = changeMainIgd;
                            break;
                        } else if (changeMenu == 3) { //추천소스 변경
                            System.out.println("# 변경할 추천소스를 입력하세요.");
                            System.out.print("> ");
                            String changeSause = sc.nextLine();
//                            sc.nextLine();
                            System.out.printf("추천소스가 %s에서 %s로 변경되었습니다.\n", menuList[editNum - 1][3], changeSause);
                            menuList[editNum - 1][3] = changeSause;
                            break;
                        } else if (changeMenu == 4) { //판매가격 변경
                            System.out.println("# 변경할 판매가격을 입력하세요.");
                            System.out.print("> ");
                            int changePrice = sc.nextInt();
                            sc.nextLine();
                            System.out.printf("판매가격이 %d에서 %d로 변경되었습니다.\n", price[editNum - 1], changePrice);
                            price[editNum - 1] = changePrice;
                            break;
                        } else if (changeMenu == 5) { //취소
                            System.out.println("취소되었습니다.");
                            break;
                        } else {
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    } else {
                        System.out.println("해당 번호의 메뉴가 없습니다.");
                    }
                }
            }//end 3

            //-------------------------------4. 데이터 삭제------------------------------
            else if (menuNum == 4) {
                while (true) {
                    System.out.println("-현재 메뉴 목록-");
                    for (int i = 0; i < menuList.length; i++) {
                        System.out.print("(" + (i + 1) + ")" + menuList[i][1] + " ");
                    }
                    System.out.print("\n# 삭제할 메뉴번호를 입력하세요. : ");
                    int delNum = sc.nextInt();
                    sc.nextLine();
                    int delIdx = delNum - 1;
                    if (delNum < menuList.length + 1) {
                        while (true) {
                            System.out.printf("%s의 데이터를 삭제하시겠습니까? yes(y) / no(n)\n", menuList[delNum - 1][1]);
                            System.out.print("> ");
                            String delAnswer = sc.next();
                            sc.nextLine();
                            if (delAnswer.equals("y")) {
                                //배열의 중간 데이터 삭제
                                //삭제하려는 인덱스부터 끝인덱스까지 앞인덱스에 채우기
                                for (int i = delIdx; i < menuList.length - 1; i++) {
                                    for (int j = 1; j < 4; j++) {
                                        menuList[i][j] = menuList[i + 1][j];
                                    }
                                    salesNum[i] = salesNum[i + 1];
                                    price[i] = price[i + 1];
                                }
                                //데이터 배열보다 하나 작은 빈 배열 생성
                                String[][] temp = new String[menuList.length - 1][4];
                                int[] salesTemp = new int[salesNum.length - 1];
                                int[] priceTemp = new int[price.length - 1];

                                //빈 배열에 데이터 복사
                                for (int i = 0; i < menuList.length - 1; i++) {
                                    temp[i] = menuList[i];
                                    salesTemp[i] = salesNum[i];
                                    priceTemp[i] = price[i];
                                }

                                //데이터 주소 복사
                                menuList = temp;
                                salesNum = salesTemp;
                                price = priceTemp;

                                temp = null;
                                salesTemp = null;
                                priceTemp = null;

                                System.out.println("************************************* 삭제 후 메뉴 정보 ************************************");
                                System.out.println("[메뉴번호]     [메뉴이름]     [메인재료]     [추천소스]     [판매가격]      [판매개수]]");
                                System.out.println("=========================================================================================");
                                for (int i = 0; i < menuList.length; i++) {
                                    System.out.printf(" %s          %s         %s           %s      %d원            %d"
                                            , menuList[i][0], menuList[i][1], menuList[i][2], menuList[i][3], price[i], salesNum[i]);
                                    // ??? : 위치에 맞게 글자 정렬이 안됨.
                                    System.out.println("\n----------------------------------------------------------------------------------------");
                                }
                                break;

                            } else if (delAnswer.equals("n")) {
                                System.out.println("삭제를 취소하셨습니다.\n");
                                break;
                            } else {
                                System.out.println("잘못 입력하셨습니다.");
                            }
                        }
                    } else {
                        System.out.println("해당 번호의 메뉴가 없습니다.");
                    }
                    break;
                }
            }//end 4

            //-----------------------5. 판매 개수 입력(누적)----------------------
            else if (menuNum == 5) {
                while (true) {
                    // 메뉴 이름과 판매개수 조회
                    System.out.println("번호       이름           판매건수");
                    System.out.println("==================================");
                    for (int i = 0; i < menuList.length; i++) {
                        System.out.printf("%s       %s       %d\n", menuList[i][0], menuList[i][1], salesNum[i]);
                        System.out.println("----------------------------------");
                    }
                    System.out.print("# 판매량을 추가하려는 메뉴의 번호를 입력하세요. : ");
                    int editNum = sc.nextInt();
                    sc.nextLine();
                    if (editNum < menuList.length + 1) {
                        System.out.printf("# %s의 추가 판매 개수를 입력하세요. : ", menuList[editNum - 1][1]);
                        int plusNum = sc.nextInt();
                        sc.nextLine();
                        salesNum[editNum - 1] += plusNum;
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                }
                System.out.println("\n### 수정 완료 ###\n");


                System.out.println("번호       이름           판매건수");
                System.out.println("==================================");
                for (int i = 0; i < menuList.length; i++) {
                    System.out.printf("%s       %s       %d\n", menuList[i][0], menuList[i][1], salesNum[i]);
                    System.out.println("----------------------------------");
                }
                System.out.println("엔터(Enter)를 누르시면 메뉴선택 화면으로 이동합니다.");
                sc.nextLine();
            }//end 5

            //-----------------------6. 매출 현황 조회--------------------------
            else if (menuNum == 6) {
                System.out.println("");
                System.out.println("======================현재 매출 상황========================");
                //메뉴이름
//              for (int i = 0; i < menuList.length; i++) {
//                  System.out.print("메뉴이름 " + menuList[i][1] + " ");
//              }
                System.out.print("[메뉴이름] ");
                loop2(menuList, 1);
                System.out.println("");
                //판매가격
                System.out.print("[판매가격]    ");
                loop1(price);
                System.out.println("");
                //매출량
                System.out.print("[판매개수]       ");
                for (int i = 0; i < salesNum.length; i++) {
                    System.out.print(salesNum[i] + "            ");
                }
                System.out.println("");
                //매출액
                System.out.print("[매출액]      ");
                for (int i = 0; i < price.length; i++) {
                    System.out.print(price[i] * salesNum[i] + "        ");
                }
                System.out.println("");
                //총매출액
                int totalSales = 0;
                for (int i = 0; i < price.length; i++) {
                    totalSales += price[i] * salesNum[i];
                }
                System.out.println("[매출 총액]: " + totalSales + "원");
                System.out.println("");

                // # 이달의 Best 메뉴
                //  -매출량 1위 찾기
                System.out.println("*** 이 달의 Best 메뉴 (매출량 1위)***");
                int max = -1; // 매출량 기록 변수
                int[] temp = new int[salesNum.length]; // salesNum의 모든 판매량이 0일때의 배열 형태.

                if (menuList.length > 1) {

                    if (Arrays.toString(temp).equals(Arrays.toString(salesNum))) {
                        System.out.println("아직 판매 전입니다.");
                    } else {
                        for (int i = 0; i < salesNum.length; i++) {
                            if (max < salesNum[i]) {
                                max = salesNum[i];
                            }
                        }
                        // 공동 매출량 1위일 때
                        // max 값과 동일한 판매량을 갖고 있는 메뉴의 이름들을 출력.
                        int count = 0;
                        for (int i = 0; i < salesNum.length; i++) {
                            if (max == salesNum[i]) {
                                System.out.printf("=> %s (판매개수: %d)\n", menuList[i][1], max);
                                count++;
                            }
                        }
                        if (count > 1) {
                            System.out.println("(공동 1등입니다.)");
                        }
                    }
                } else {
                    System.out.println("단일 메뉴는 Best 메뉴가 선정되지 않습니다.");
                }
                System.out.println("");

                // #이 달의 Worst 메뉴
                //  매출량 꼴찌 찾기
                System.out.println("*** 이 달의 Worst 메뉴 ***");
                int min = 100000; // 매출량 기록 변수

                if (menuList.length > 1) {

                    if (Arrays.toString(temp).equals(Arrays.toString(salesNum))) {
                        System.out.println("아직 판매 전입니다.");
                    } else {
                        for (int i = 0; i < salesNum.length; i++) {
                            if (min > salesNum[i]) {
                                min = salesNum[i];
                            }
                        }
                        // 공동 매출량 꼴찌일 때
                        // min 값과 동일한 판매량을 갖고 있는 메뉴의 이름들을 출력.
                        int count2 = 0;
                        for (int i = 0; i < salesNum.length; i++) {
                            if (min == salesNum[i]) {
                                System.out.printf("=> %s (판매개수: %d)\n", menuList[i][1], min);
                                count2++;
                            }
                        }
                        if (count2 > 1) {
                            System.out.println("(공동 꼴찌입니다.)");
                        }
                    }
                } else {
                    System.out.println("단일 메뉴는 Worst 메뉴가 선정되지 않습니다.");
                }
                System.out.println("");
                System.out.println("엔터(Enter)를 누르시면 메뉴선택 화면으로 이동합니다.");
                sc.nextLine();
            }//end 6


            //-----------------------7. 프로그램 종료--------------------------
            else if (menuNum == 7) {
                while (true) {
                    System.out.println("# 프로그램을 종료하시겠습니까? y(yes) / n(no)");
                    System.out.print("> ");
                    String exit = sc.next();
                    sc.nextLine();

                    if (exit.equals("y")) { //y를 입력하였다면
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    } else if (exit.equals("n")) { //n을 입력하였다면
                        System.out.println("프로그램을 종료하지 않습니다.\n");
                        break;
                    } else { //그 외의 경우
                        System.out.println("잘못 입력하셨습니다. y 혹은 n을 입력해주세요.");
                    }
                }
            }
            //-------------------메뉴목록에 없는 번호를 입력했을 때------------------------------
            else {
                System.out.println(menuNum + "는(은) 없는 메뉴번호입니다. 다시 입력해주세요.");
                System.out.println("");
            }

        }//end while(true)

    }//end main
}//end class
