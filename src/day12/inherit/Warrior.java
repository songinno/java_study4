package day12.inherit;

public class Warrior extends Player {
    // ### 필드 (임의로 public으로 둠, 그냥 편하게)
    public int rage; // 분노 게이지

    //### 메서드
    public void fireSlash(Player target) {  // + 다형성 연습
        System.out.printf("%s님이 %s님에게 fireflash를 시전하였습니다.\n", this.name, target.name);
        int skillDamage = 10;
        if (target instanceof Mage) {
            target.hp -= skillDamage + 10;
            System.out.printf("%s님이 %d의 피해를 입었습니다.\n", target.name, skillDamage + 10);
        } else if (target instanceof Hunter) {
            target.hp -= skillDamage + 5;
            System.out.printf("%s님이 %d의 피해를 입었습니다.\n", target.name, skillDamage + 5);
        } else if (target instanceof Warrior) {
            target.hp -= skillDamage;
            System.out.printf("%s님이 %d의 피해를 입었습니다.\n", target.name, skillDamage);
        } else {
            System.out.println("대상이 잘못되었습니다.");
        }

        System.out.printf("%s님의 현재 체력: %d\n", target.name, target.hp);

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
