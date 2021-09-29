package day05;

import java.util.Arrays;

public class ArrayInsert해설 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 50, 60};
        int newNumber = 30;

        System.out.println("삽입전: " + Arrays.toString(arr));

        //1. 사이즈가 하나 더 큰 배열 생성
        int[] temp = new int[arr.length+1];

        //2. 기존 데이터를 전부 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        //3. 끝데이터부터 뒤로 밀기
        int index = 2; //삽입할 위치

        for (int i = temp.length-1; i > index; i--) {
            temp[i] = temp[i-1];
        }

        //4. 타겟인덱스에 데이터 추가
        temp[index] = newNumber;

        arr = temp; temp = null;
        System.out.println("삽입후: " + Arrays.toString(arr));

    }
}







