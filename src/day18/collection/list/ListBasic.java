package day18.collection.list;

//import java.util.List;
import java.util.*; // 이렇게 그냥 써놓으면 편함 (tip)

public class ListBasic {

    public static void main(String[] args) {
        //기존 배열 이용하면
//        String[] strs = new String[10];
        //배열 내에서 데이터 데이터 삭제 등등 이런거 어려움.
        /////////////////////////////////////////////////////
//        List sList = new List(); // 인터페이스를 생성자x
        List<String> sList = new ArrayList<>(); // -> 기본적으로 object배열 이용. 잡것들 다 들어감. 그래서 <>로 제어.
        //공간(배열 길이) 신경 쓸 필요 없음. 다 해놓음.

        String s1 = "멍멍이";
        String s2 = "야옹이";

        //List에 객체 추가하기: add(obj)
        sList.add(s1); // js의 push랑 같음.
        sList.add(s2);
        System.out.println("sList = " + sList);

        sList.add("짹짹이");
        sList.add("개굴이");
        sList.add("어흥이");
        sList.add("야옹이");
        System.out.println("sList = " + sList);

        //리스트에 저장된 객체의 수 얻기: size()
        int size = sList.size();// length 아님.
        System.out.println("size = " + size);

        //리스트에 중간 삽입: add(index, obj) -> index자리에 추가됨.
        sList.add(2,"두껍이");
        System.out.println("sList = " + sList);

        //리스트 객체 수정: set(index, obj)
        sList.set(3, "꾹꾹이");
        System.out.println("sList = " + sList);

        //리스트 객체 삭제
        //1)remove(index)
        sList.remove(6);
        System.out.println("sList = " + sList);
        //2)remove(obj)
        sList.remove("개굴이");
        System.out.println("sList = " + sList);

        //리스트 객체 참조: get(index)
        String s = sList.get(2); // get의 리턴타입 E -> String
        System.out.println("s = " + s);

        //리스트에 저장된 객체의 인덱스 얻기: indexOf(obj) -> 몇번 인덱스인지 알려줌. (못찾으면 -1)
        int index = sList.indexOf("어흥이");
        System.out.println("어흥이의 index = " + index);

        //리스트에 저장된 데이터 유무 확인: contains(obj) -> boolean으로 알려줌
        boolean contains = sList.contains("콩벌레");
        System.out.println("contains = " + contains);
        boolean contains1 = !sList.contains("꾹꾹이");
        System.out.println("contains1 = " + contains1);

        System.out.println("---------리스트의 반복문 처리1----------");
        //리스트의 반복문 처리
        for (int i = 0; i < sList.size(); i++) {
            System.out.print(sList.get(i) + " ");
        }
        System.out.println("");

        System.out.println("---------리스트의 반복문 처리2----------");
        for (String pet : sList) {
            System.out.print(pet + " ");
        }
        System.out.println("");
        System.out.println("---------------------------------------");

        //list 내부 객체 전체삭제: clear()
        sList.clear();
        System.out.println("sList = " + sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty()); // 비어있으면 true
    }



}
