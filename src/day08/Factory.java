package day08;
//실행용 클래스
public class Factory {


    public static void main(String[] args) {

        //#객체의 생성
        Phone galaxy = new Phone();  // "생성자 호출"
        //new -> 객체의 생성. + 설계도이름 + ();  // 설계도 이름() 하면서 -> 생성자를 호출함.
        // Phone 속성들이 스트링2, 인트2, 불린1 -> 무슨타입?
        // Phone 객체의 변수의 type = Phone
        System.out.println("galaxy = " + galaxy); // => galaxy = day08.Phone@1b6d3586
        //배열처럼 heap에 저장.

        //galaxy + galaxy (x)

        // #참조연산자 . : 객체의 속성과 기능을 참조할 때 사용.

//        galaxy.model = "갤럭시S21";
//        //(new String = "갤력시s21" 이렇게 쓸수도 있음. String은 char의 배열. "" 앞에 뭐가 생략되어있는것)
//        galaxy.color = "그레이";
//        galaxy.price = 800000;
        //그런데 모델명,색상,가격 결정하는건 여기서 할일이 아님. => ***생성자(기술자) : 설계도 가지고 제품을 만듦.(Phone클래스에서)

        galaxy.powerOn();
        galaxy.showSpec();
        // 객체도 초기화x면 기본값으로.

        System.out.println("---------------------------------------------------------------------------------");

        Phone iPhoneX = new Phone("iPhoneX");

        iPhoneX.powerOn();
        iPhoneX.showSpec();

        System.out.println("---------------------------------------------------------------------------------");

        Phone s21 = new Phone("갤럭시노트 S21", "에메랄드그린");

        s21.powerOn();
        s21.showSpec();

        // + 부품속성
        s21.ionBattery = new Battery("로켓");
        System.out.println("s21의 베터리회사명: " + s21.ionBattery.company);

        //아이폰x의 베터리를 충전
        iPhoneX.ionBattery.charge();

    }//end main
}
