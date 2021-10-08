package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[6];

        while (arr[5] != 0) {
            int rn = (int) (Math.random() * 45) + 1;
            int checkNum = 0;
            checkNum = rn;
            //순차탐색
            for (int i = 0; i < arr.length; i++) {
                if (checkNum == arr[i]) {
                    break;
                }
                else {
                    arr[i] = checkNum;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    } //end main


}
