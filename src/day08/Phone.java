package day08;

//설계도 클래스는 main 메서드를 만들지 않습니다.
public class Phone {

    //#속성: 객체의 데이터

    //field

    //*고유 속성
    //-(한번 정하면 거의 바뀌지 않음. 바뀌긴 바뀜.)
    String model; // 모델명
    String color; // 색상
    int price; // 가격

    //*상태 속성
    // -(자주 바뀜)
    int messageCount; // 문자메세지 수
    boolean on; // 전원 켜진 여부

    //문자메세지함
    String[] receiveMessages = new String[3]; //-> 핸드폰 하나당 문자메세지 3개씩 저장 가능.

    //부품 속성(포함 관계: Composition) - Battery.java 참고
    Battery ionBattery;


    //////////////////////////////////////////////////////////////////////////////////////
    //#기능 : 객체의 행위
    //method : static 붙이지 말 것 (설계도에서는)
    // 전원을 키는 기능
    public void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    // 전원을 끄는 기능
    public void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다.");
    }
    // 핸드폰 정보를 보여주는 기능
    public void showSpec () {
        if (!on) {
            System.out.println("전원을 먼저 켜세요!");
            return;
        }
        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price + "원");
    }

    //-------------------------------문자메세지 보내는 기능
    public boolean sendMessage(Phone targetPhone, String message) {
        if (targetPhone.messageCount < targetPhone.receiveMessages.length) {
            //내가 보낼 메시지를 상대방 핸드폰의 문자메세지함에 저장. + 상대 메세지수 +1
            targetPhone.receiveMessages[targetPhone.messageCount++] = message;
            return true;
        }
        else {
            System.out.println("상대방 메세지함이 가득 찼습니다.");
            return false;
        }
    }

    //수신 문자메세지 확인하는 기능
    public void checkMessages() {
        if (!on) {
            System.out.println("전원을 먼저 켜세요");
            return;
        }
        System.out.printf("\n=========== [%s]의 메세지함 ===========\n", model);
        for (int i = 0; i < messageCount; i++) { // 메세지 있는 수만큼만 반복문 돌려야함 -> messageCount로 (receivemessage.length로 x)
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }

    //---------------------------------# 생성자
    public Phone() { // Phone 앞에 void 생략. 다른 타입x // ctrl누르고 왼쪽마우스 클릭 -> 호출한 곳으로
        System.out.println("핸드폰 1번 생성자 호출!");
        model = "애니콜";
        color = "쥐색";
        price = 30000;
    }

    //생성자는 여러개 선언할 수 있다 (오버로딩)
    public Phone(String modelName) {
        System.out.println("핸드폰 2번 생성자 호출!");
        model = modelName; // model은 필드 : 객체의 속성.  modelName은 변수 : 메서드 데이터
        color = "스노우화이트";
        price = 1000000;
    }

    public Phone(String modelName, String colorName) {
        System.out.println("핸드폰 3번 생성자 호출!");
        model = modelName;
        color = colorName;
        price = 1200000;
    }

}