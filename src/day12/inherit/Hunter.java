package day12.inherit;

public class Hunter extends Player {
    //### 필드
    public String beast; //헌터는 펫 들고다님

    //### 메서드
    public void frozenShot() {

    }

    // ###생성자
//    public Hunter() {
//        super();
//    }
//-> 다 숨어있음.


    public Hunter(String name, String beast) {
        super(name);
        this.beast = beast;
    }

    //**오버라이딩 (info 라고 치면 추천으로 뜨는거 v)
    @Override
    public void info() {
        super.info();
        System.out.println("펫: " + beast);
    }
}
