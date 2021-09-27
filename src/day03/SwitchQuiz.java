package day03;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("직급을 입력하세요.");
        System.out.println("[사원,대리,과장,차장,부장]");
        System.out.print("> ");
        String input = sc.next();
        sc.close();

        int basic = 200;
        switch (input) {
            case "사원":
                System.out.printf("%s의 급여는 200만원 입니다.", input);
                break;
            case "대리":
                System.out.printf("%s의 급여는 %d만원 입니다.", input, basic + 100);
                break;
            case "과장":
                System.out.println("과장의 급여는 400만원 입니다.");
                break;
            case "차장":
                System.out.println("차장의 급여는 500만원 입니다.");
                break;
            case "부장":
                System.out.println("부장의 급여는 600만원 입니다.");
                break;
            default:
                System.out.printf("%s은 없는 직급입니다.", input);
        }

    }
}
