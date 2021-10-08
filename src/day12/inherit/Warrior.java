package day12.inherit;

public class Warrior extends Player {
    // ### 필드 (임의로 public으로 둠, 그냥 편하게)
    public int rage; // 분노 게이지

    //### 메서드
    public void fireSlash() {

    }

    // ### 생성자

    public Warrior() {
//        super(); //-> 이 코드가 숨어있음.
        System.out.println("Warrior 객체 생성됨.");
    }

    public Warrior(String name) {
        super(name); // this() or super() 둘중 하나만 써야함.
        this.rage = 100;
    }

    //** 오버라이딩
    // Player의 메서드 info()의 접근자가 default였으면, 자식은 private으로 하면x (보통 똑같이 감), public이었으면 public만.
    //중괄호 안에만 바뀌어야 함.
    @Override // 이거 위에 붙여놓으면 오버라이딩을 잘 했나 안했나 확인해줌. 시그니처 달라지면 밑에 빨간줄뜸.
    public void info() {
        System.out.println("==========캐릭터 정보==========");
//        System.out.println("# 아이디: " + name);
//        System.out.println("# 레벨: " + level);
//        System.out.println("# 체력: " + hp);
        //->
        super.info(); // super는 직속 부모.
        System.out.println("# 분노: " + rage); // 이것만 추가.
    }







}
