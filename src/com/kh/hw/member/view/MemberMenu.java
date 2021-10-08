package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

import static com.kh.hw.member.controller.MemberController.SIZE; // mc.SIZE를 정적(static) import

public class MemberMenu {

    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public MemberMenu() {

    }

    //=====================================메인메뉴 출력 메서드===========================================
    public void mainMenu() {
        while (true) {
            System.out.printf("# 최대 등록 가능한 회원 수는 %d명입니다.\n", SIZE);
            int regCount = mc.existMemberNum();
            System.out.printf("# 현재 등록된 회원 수는 %d명입니다.\n", regCount);

            System.out.println("=========================");

            if(regCount < SIZE) { // 등록회원수 < 등록가능회원수
                System.out.println("# 1. 새 회원 등록");
            }
            System.out.println("# 2. 회원 검색");
            System.out.println("# 3. 회원 정보 수정");
            System.out.println("# 4. 회원 삭제");
            System.out.println("# 5. 모두 출력");
            System.out.println("# 9. 끝내기");
            System.out.print("\n # 메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    if (regCount < SIZE) {
                        insertMember();
                    } else {
                        System.out.println("\n# 사용자를 추가할 수 없습니다.");
                    }
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAll();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // * 프로그램 정상 종료 메서드
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
    //--------------------------4번 입력메뉴---------------------------
    private void deleteMember() {
        while (true) {
            System.out.println("\n 회원 정보 삭제");
            System.out.println("1. 특정 회원 삭제");
            System.out.println("2. 전체 회원 삭제");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("- 메뉴 입력: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    deleteOne();
                    break;
                case 2:
                    deleteAll();
                    break;
                case 9:
                    System.out.println("#메인으로 돌아갑니다.");
                    return;
            }

        }
    }
    //4-1번 입력메뉴
    private void deleteOne() {
        System.out.println("\n 삭제할 회원의 ID: ");
        String delId = sc.next();

        Member member = mc.searchId(delId);

        String name = "";
        if (member != null) {
            name = member.getName();
        }

        boolean delFlag = mc.delete(delId);
        if (delFlag) {
            System.out.printf("%s님의 정보 삭제가 완료되었습니다.", name);
        }
        else {
            System.out.printf("%s은 존재하지 않습니다.", delId);
        }
    }

    //4-2번 입력메뉴
    private void deleteAll() {
        System.out.println("\n전체 회원을 삭제합니다. [y/n]");
        String check = sc.next();
        switch (check) {
            case "Y":
            case "y":
            case "ㅛ":
                mc.delete();
                break;
            case "N":
            case "n":
            case "ㅜ":
                System.out.println("삭제를 취소합니다.");
                return;
        }
    }


    //------------------------5번 입력메뉴---------------------
    private void printAll() {
        Member[] members = mc.printAll();
        int count = mc.existMemberNum();
        if (count <= 0) {
            System.out.println("\n 아직 한명도 등록되지 않았습니다. 회원 등록 먼저 수행하세요.");
        } else{
            System.out.println("=========전체 회원 정보==========");
            for (Member m : members) {
                if (m == null) break;
                System.out.println(m.inform());
            }
        }

    }

    //----------------------2번 입력메뉴----------------------------
    private void searchMember() {
        while (true) {
            System.out.println("\n검색을 시작합니다.");
            System.out.println("======================");
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴 입력: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    searchById();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchByEmail();
                    break;
                case 9:
                    System.out.println("# 메인 메뉴로 돌아갑니다.");
                    return; // 이 함수를 종료시켜서 돌아감.
            }
        }

    }
    // * inputSearchData
    private String inputSearchData(String kind) {
        System.out.println("================");
        System.out.printf("# 검색할 회원의 %s: ", kind);
        return sc.next(); // ctrl alt v 한거 (한번밖에 안써서)
    }
    //2-3번 입력메뉴
    private void searchByEmail() {
        String inputEmail = inputSearchData("이메일");
        Member member = mc.searchEmail(inputEmail);
        if (member != null) {
            System.out.println("\n******조회결과******");
            System.out.println(member.inform());
        }
        else {
            System.out.printf("%s는 등록된 이메일이 아닙니다.\n", inputEmail);
        }
    }

    //2-2번 입력메뉴
    private void searchByName() {
        System.out.println("================");
        while (true) {
            System.out.print("# 검색할 회원의 이름: ");
            String inputName = sc.next();
            Member[] members = mc.searchName(inputName);
            if (members.length != 0) {
                for (int i = 0; i < members.length; i++) {
                    System.out.println(members[i].inform());
                }
                break;
            }
            else {
                System.out.printf("%s는 잘못된 이름입니다. 다시 입력하세요", inputName);
            }
        }
    }

    //2-1번 입력메뉴
    private void searchById() {
        System.out.println("===================");
        System.out.print("# 검색할 회원의 ID: ");
        String inputId = sc.next();

        Member member = mc.searchId(inputId);
        if (member != null) {
            System.out.println("\n******조회결과******");
            System.out.println(member.inform());
        }
        else {
            System.out.printf("%s는 등록된 회원이 아닙니다.\n", inputId);
        }
    }

    //---------------------------1번 입력메뉴-------------------------------
    private void insertMember() {
        System.out.println("\n# 새 회원을 등록합니다.");

        String id = null;
        while (true) {
            System.out.println("- 아이디: ");
            id = sc.next();

            if (mc.checkId(id)) { // ctrl + alt + n 지역변수 없애고 인라인화 , ctrl + alt + v 되돌리기
                System.out.println("# 중복된 아이디입니다. 다시 입력하세요.");
//                continue;
            }
            else {
                break;
            }
        }
        System.out.println("- 이름: ");
        String name = sc.next();
        System.out.println("- 비밀번호: ");
        String pw = sc.next();
        System.out.println("- 이메일: ");
        String email = sc.next();

        char gender = checkGender();
        int age = checkAge(); // ctrl + alt + m

        mc.insertMember(id, name, pw, email, gender, age);
    }
    // ctrl + alt + m 이용, 나이값 검증하는 메서드
    private int checkAge() { // ctrl + alt + m
        int age = 0;
        while (true) {
            System.out.println("- 나이: ");
            age = sc.nextInt();
            if (age < 0 || age > 100) {
                System.out.println("나이 범위가 올바르지 않습니다.(0~100세)");
            }
            else {
                break;
            }
        }
        return age;
    }

    //성별 값을 검증하는 메서드
    private char checkGender() {
        char gender = 0;
        while (true) {
            System.out.println("- 성별(M/F): ");
            gender = sc.next().toLowerCase().charAt(0);
            //한글자만 받는 방법은 없는데, 여러글자를 써도 앞에 글자만 가져올 수 있는 방법은 있음.
            //문자'열': male 이면 m이 0번 인덱스
            //String abc = "메롱메롱";
            //abc.charAt(0); -> 메 (타입은 char)
            //toLowerCase() : 소문자 변환 = FEMALE -> female -> f
            if (gender == 'm' || gender == 'f') {
                return gender;
            }
            else {
                System.out.println("다시 입력하세요");
            }
        }
    }




}//end class
