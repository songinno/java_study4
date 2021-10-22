package day17.api.lang.str;

public class StrEx {
    public static void main(String[] args) {

        String str = "hello java";

        //String 은 class
        //원래는 String str = new String("hello java"); 이렇게 해야함.
        //근데 너무 자주쓰니까 생략 가능하게 만들어줌.

//        str.value[0] -> 이게 h, 근데 value 배열이 private이라 접근 x, 그래서 접근할 수 있게 메서드들을 만들어 놓은것.

        //charAt(index): 문자열 인덱스에 따른 글자 반환
        char c = str.charAt(4);
        System.out.println("c = " + c); // => c = o

        //substring(): 문자열의 특정 범위를 추출
        String ss1 = str.substring(6); //6번부터 끝까지 추출
        System.out.println("ss1 = " + ss1); //=>ss1 = java

        String ss2 = str.substring(0, 5); //0번이상 5번미만
        System.out.println("ss2 = " + ss2); //=> ss2 = hello

        //length(): 문자열의 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len);

        //indexOf(), lastIndexOf(): 특정 문자나 단어의 첫글자 인덱스 반환
        int first = str.indexOf("l"); // 앞에서부터 탐색
        int last = str.lastIndexOf("l"); // 뒤에서부터 탐색
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        //찾는 단어가 포함되어있다면 첫글자 인덱스, 없으면 -1 반환
        int java = str.indexOf("뽀로로");
        System.out.println("java = " + java);

        //일괄 대소문자 변환
        String str2 = "HeLLo PoRORo";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        //파일경로에서 확장자 추출
        String filePath = "C:/local/img/2021/09/17/메롱.HWP";
        String ext = filePath.substring(filePath.lastIndexOf(".")+1);
        System.out.println("ext = " + ext);

        switch (ext.toUpperCase()) {
            case "JPG": case "GIF": case "PNG":
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("기타 파일입니다.");
        }

        //replace(old, new): 문자열 내부에 old문자를 찾아서 new문자로 변경
        String msg = "java study, java program, java coffee";
        System.out.println(msg.replace("java", "자바"));
        System.out.println(msg.replace("java", ""));

        msg.replace("\n", "<br>");


    }


}
