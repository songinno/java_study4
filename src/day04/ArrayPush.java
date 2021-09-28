package day04;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30}; // 끝에 40 추가하고 싶음.

        int newData = 40;

        // 현재 arr length 3, 길이 4짜리 방으로 새로 만들어야함.
        // -> 새로 만들고 복사하고, 주소값을 arr에 연결. 새로만든 방의 주소를 null로 지워버림

        //1. 원본 배열보다 사이즈 1개 더 큰 새 배열 생성
        int[] temp = new int[arr.length + 1];

        //2. 원본배열 데이터를 값복사하여 신규배열로 이동
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("temp = " + Arrays.toString(temp));

        //3. 새로운 데이터를 신규배열의 맨 끝에 추가
        temp[temp.length - 1] = newData;
        System.out.println("temp = " + Arrays.toString(temp));

        System.out.println("==4. 주소값 이전 + temp 지우기==");
        //4. 주소값 이전 + temp 지우기
        arr = temp; temp = null;
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("temp = " + Arrays.toString(temp));


    }
}
