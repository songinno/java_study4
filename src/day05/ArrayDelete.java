package day05;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // # 배열의 중간에 있는 데이터 삭제

        int[] arr = {1, 3, 5, 7, 9, 11};
        //3을 지우고 싶음.
        System.out.println("삭제전: " + Arrays.toString(arr));


        /*
            // 3을 5로 수정.
            arr[1] = arr[2];
            // 5뒤의 5를 7로 수정
            arr[2] = arr[3];
            //7뒤의 7을 9로
            arr[3] = arr[4];
            //9뒤의 9을 11로
            arr[4] = arr[5];
            arr[i] = arr[i + 1]
            i시작값 : 삭제 대상 인덱스번호
         */

        // => 정규화
        int delIdx = 1;
        for (int i = delIdx; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }


        // pop
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;




        System.out.println("삭제후: " + Arrays.toString(arr));
    }

}
