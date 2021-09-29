package day05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {

        //배열의 끝데이터 삭제

        int[] arr = {10, 20, 30, 40, 50};

        //배열 자체 길이 못줄임. -> 길이 4개짜리 배열을 새로 만들고 마지막거 빼고 4개 복사.

        int[] temp = new int[arr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
        
        arr = temp;
        temp = null;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp = " + Arrays.toString(temp));


    }
}
