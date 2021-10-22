package day17.api.lang.obj;

public class Member {
    String name;
    int age;
    String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //주소값 나오는게 싫으면, toString()으로 오버라이딩 해버리면 됨.
//    public String toString() {
////        return "메롱";
//        return String.format("이름: %s, 나이: %d세, 주소: %s", name, age, address);
//    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    //객체가 생성되면, 생성되면서 해야할 일(정해지는것들)이 있음. 그럴때 생성자.
    //객체가 사라질 때도 해야할 일들이 있음. 후처리 할 때 필요한 함수가 소멸자.
    //자바는 자동 제거.

    //소멸자
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "객체 소멸됨.");
    }
}
