package Project;

import java.util.Scanner;

public class MenuManagementProgram2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //메뉴 저장할 2차 배열 생성
        String[][] menuList = {
                {"1", "참치샌드위치", "참치", "마요네즈"}
        };
        //가격 배열 생성
        int[] price = {7000};
        //메뉴 판매개수 저장할 배열 생성
        int[] salesNum = {0};

        //프로그램 실행
        while (true) {
            System.out.println("##### 🌯 SUBWAY 🥗 메뉴 관리 프로그램 #####");
            System.out.println("===================================");
            System.out.println("1. 신규 등록");
            System.out.println("2. 전체 조회");
            System.out.println("3. 메뉴 수정");
            System.out.println("4. 메뉴 삭제");
            System.out.println("5. 판매 개수 입력");
            System.out.println("6. 프로그램 종료");
            System.out.println("===================================");
            System.out.print("원하는 메뉴 번호를 입력하세요. >>> ");
            int menuNum = sc.nextInt();
            sc.nextLine();


            //1. 신규 등록
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

                System.out.print("- 메뉴 이름 : ");
                String newName = sc.next();
                temp[menuList.length][1] = newName;


                System.out.print("- 주 재료 : ");
                String newMainIgd = sc.next();
                temp[menuList.length][2] = newMainIgd;

                System.out.print("- 추천 소스 : ");
                String newSause = sc.next();
                temp[menuList.length][3] = newSause;

                System.out.print("- 판매가격 : ");
                int newPrice = sc.nextInt();
                priceTemp[price.length] = newPrice;

                salesTemp[salesNum.length] = 0;

                sc.nextLine();

                menuList = temp;
                salesNum = salesTemp;
                price = priceTemp;
//                System.out.println(Arrays.toString(temp[0]));
                temp = null;
                salesTemp = null;
                priceTemp = null;

                System.out.println("메뉴가 정상적으로 등록되었습니다.\n");
            }

            //2. 전체 조회
            // **판매건수를 토대로 메뉴 추천기능 넣기
            if (menuNum == 2) {
                //-------------------------------#2. 모든 메뉴정보 보기-------------------------------
                System.out.println("************************************** 전체 메뉴 정보 *************************************");
                System.out.println("[메뉴번호]     [메뉴 이름]     [메인 재료]     [기본 소스]     [판매 가격]      [판매 수량]");
                System.out.println("=========================================================================================");
                for (int i = 0; i < menuList.length; i++) {
                    System.out.printf(" %s          %s         %s           %s      %d원       %d"
                            , menuList[i][0], menuList[i][1], menuList[i][2], menuList[i][3], price[i], salesNum[i]);
                    // ??? : 위치에 맞게 글자 정렬이 안됨.
                    System.out.println("\n-----------------------------------------------------------------------------------");
                }
                System.out.println("확인하셨으면 <enter>를 눌러주세요");
                sc.nextLine();
            } // end #2

            //3. 데이터 수정
            if (menuNum == 3) {
                while (true) {
                    System.out.print("# 수정할 메뉴의 번호를 입력하세요. : ");
                    int editNum = sc.nextInt();

                    //입력한 메뉴 번호가 데이터에 있는 경우
                    if (editNum < menuList.length + 1) {
                        System.out.printf("%s의 정보를 수정합니다.\n", menuList[editNum - 1][1]);
                        System.out.println("[ 1. 메뉴 이름 변경 | 2. 재료 변경 | 3. 추천소스 변경 | 4. 판매가격 변경 | 5. 취소 }");
                        int changeMenu = sc.nextInt();
                        if (changeMenu == 1) { //메뉴 이름 변경
                            System.out.println("# 변경할 메뉴 이름을 입력하세요.");
                            System.out.print("> ");
                            String changeMenuName = sc.next();
                            sc.nextLine();
                            System.out.printf("메뉴 이름이 %s에서 %s로 변경되었습니다.\n", menuList[editNum - 1][1], changeMenuName);
                            menuList[editNum - 1][1] = changeMenuName;
                            break;
                        } else if (changeMenu == 2) { //재료 변경
                            System.out.println("# 변경할 재료를 입력하세요.");
                            System.out.print("> ");
                            String changeMainIgd = sc.next();
                            sc.nextLine();
                            System.out.printf("주재료가 %s에서 %s로 변경되었습니다.\n", menuList[editNum - 1][2], changeMainIgd);
                            menuList[editNum - 1][2] = changeMainIgd;
                            break;
                        } else if (changeMenu == 3) { //추천소스 변경
                            System.out.println("# 변경할 추천소스를 입력하세요.");
                            System.out.print("> ");
                            String changeSause = sc.next();
                            sc.nextLine();
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

            }

            //4. 데이터 삭제
            if (menuNum == 4) {
                while (true) {
                    System.out.print("# 삭제할 메뉴 번호를 입력하세요. : ");
                    int delNum = sc.nextInt();
                    int delIdx = delNum - 1;
                    if (delNum < menuList.length + 1) {
                        while (true) {
                            System.out.printf("%s의 데이터를 삭제하시겠습니까? yes(y) / no(n)\n", menuList[delNum - 1][1]);
                            System.out.print("> ");
                            String delAnswer = sc.next();
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
                                System.out.println("[메뉴번호]     [메뉴 이름]     [메인 재료]     [기본 소스]     [판매 가격]      [판매 수량]");
                                System.out.println("=========================================================================================");
                                for (int i = 0; i < menuList.length; i++) {
                                    System.out.printf(" %s          %s         %s           %s      %d원       %d"
                                            , menuList[i][0], menuList[i][1], menuList[i][2], menuList[i][3], price[i], salesNum[i]);
                                    // ??? : 위치에 맞게 글자 정렬이 안됨.
                                    System.out.println("\n-----------------------------------------------------------------------------------");
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

            }

            //5. 판매 개수 입력(누적)
            if (menuNum == 5) {
                // 메뉴 이름과 판매개수 조회
                System.out.println("번호       이름           판매건수");
                System.out.println("==================================");
                for (int i = 0; i < menuList.length; i++) {
                    System.out.printf("%s       %s       %d\n", menuList[i][0], menuList[i][1], salesNum[i]);
                    System.out.println("----------------------------------");
                }
                System.out.print("# 판매량을 추가하려는 메뉴의 번호를 입력하세요. : ");
                int editNum = sc.nextInt();
                System.out.printf("# %s의 추가 판매 개수를 입력하세요. : ", menuList[editNum - 1][1]);
                int plusNum = sc.nextInt();
                sc.nextLine();
                salesNum[editNum - 1] += plusNum;

                System.out.println("\n### 수정 완료 ###\n");

                System.out.println("번호       이름           판매건수");
                System.out.println("==================================");
                for (int i = 0; i < menuList.length; i++) {
                    System.out.printf("%s       %s       %d\n", menuList[i][0], menuList[i][1], salesNum[i]);
                    System.out.println("----------------------------------");
                }
                System.out.println("엔터(Enter)를 누르시면 메뉴선택 화면으로 이동합니다.");
                sc.nextLine();
            }

            //6. 프로그램 종료
            if (menuNum == 6) {
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

        }


    }
}
