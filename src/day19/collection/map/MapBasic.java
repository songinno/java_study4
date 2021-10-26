package day19.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member{
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class MapBasic {
    public static void main(String[] args) {

        //Map: key, value의 쌍으로 데이터를 집합관리
        // key는 중복 불가능, value는 중복 가능.
        Map<String, Member> memberMap = new HashMap<>();

        //(Map은 Colletion 상속x, 메서드 이름 다름)
        //Map에 객체를 추가: put(key, value)
        memberMap.put("멍멍이", new Member("김철수", 30));
        memberMap.put("야옹이", new Member("고길동", 45));
        memberMap.put("짹짹이", new Member("박영희", 35));

        System.out.println("memberMap = " + memberMap);

        int size = memberMap.size();
        System.out.println("size = " + size);

        //#중복된 key를 설정하면, value가 수정됨 -> Map 객체 수정: put이용
        memberMap.put("야옹이", new Member("둘리", 10));
        System.out.println("memberMap = " + memberMap); // 에러는 안나고 수정됨.

        //#map에 저장된 객체 참조: get(key)
        Member 짹짹이 = memberMap.get("짹짹이");
        System.out.println("짹짹이 = " + 짹짹이);

        //#map 데이터 삭제: remove(key)
        Member remove = memberMap.remove("야옹이");
        System.out.println("memberMap = " + memberMap);
        System.out.println("remove = " + remove);

        //#map에 저장된 key 존재 유무 확인: containsKey(key)
        System.out.println(memberMap.containsKey("야옹이"));
        System.out.println(memberMap.containsKey("짹짹이"));

        System.out.println("-----------------------------");
        //#map의 반복문 처리
        //map은 iter 반복문 안됨. (iterable 상속x)
        //keySet() 리턴타입 Set<K => String> -> Set은 됨.
        Set<String> keys = memberMap.keySet();
        System.out.println("keys = " + keys);
        System.out.println("---------------------------");
        for (String s2 : keys) {
            System.out.println(s2);
        }
        System.out.println("---------------------------");

        for (String s : keys) {
            System.out.println(memberMap.get(s));
        }


    }

}
