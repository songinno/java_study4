package day06;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        
//        int[] nums1;
//        int[] nums2;
//        int[] nums3;
//        int[] nums4;
//        int[] nums5;
//        //=> 배열이 많아져서 관리가 어려움. 배열들을 또 묶어버림.
//
//        int[][] nums; // -> 2차원 배열
//        int[][] nums; // -> 2차원 배열
//        int[][] nums; // -> 2차원 배열
//        int[][] nums; // -> 2차원 배열
//        int[][] nums; // -> 2차원 배열
//
//        int [][][] numss; // -> 3차원 배열

        ///////////2차원 배열////////////
        // = 1차원 배열들의 주소값을 갖고 있는 1차열 배열
        int [][] scores = {
                {80,90,75},
                {50,30,55},
                {50,60,25}
        };
        System.out.println("scores.length = " + scores.length);

        System.out.println(scores[0][1]);
        System.out.println(scores[1]);
        System.out.println("scores[1]: " + Arrays.toString(scores[1]));

        // #데이터 수정
        scores[2][1] = 40;

        scores[0] = new int[] {100, 100, 100};

        for (int[] arr : scores) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println(); // 단순 줄개행
        }

        System.out.println("===========================");
        //배열 생성문으로 2차원 배열 만들기 (3행 5열짜리 배열)

        int[][] testArr = new int[3][5];

        //iter
        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("==============================");
        //3차원
        int[][][] arr3d = {
            {{1,2,3},{1,6,5},{8,4,3}},
            {{2,2,3},{7,5,6},{9,5,1}},
            {{2,5,6},{4,4,7},{8,9,7}}
        };
        System.out.println(arr3d[0][1][2]);

        ///////
        for (int[][] ints : arr3d) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        ////////
        System.out.println("==========================================");
        System.out.println("arr3d = " + arr3d);
        System.out.println("arr3d[0] = " + arr3d[0]);
        System.out.println("arr3d[1 = " + arr3d[1]);
        System.out.println("arr3d[2] = " + arr3d[2]);
        System.out.println("arr3d[0][0] = " + arr3d[0][0]);
        System.out.println("arr3d[0][1] = " + arr3d[0][1]);
        System.out.println("arr3d[0][2] = " + arr3d[0][2]);
        System.out.println("arr3d[0][0][0] = " + arr3d[0][0][0]);
        System.out.println("arr3d[0][0][1] = " + arr3d[0][0][1]);
        System.out.println("arr3d[0][0][2] = " + arr3d[0][0][2]);

        System.out.println("=========");
        System.out.println(Arrays.toString(arr3d));
        System.out.println(Arrays.toString(arr3d[0]));
        System.out.println(Arrays.toString(arr3d[1]));
        System.out.println(Arrays.toString(arr3d[2]));
        System.out.println(Arrays.toString(arr3d[0][0]));
        System.out.println(Arrays.toString(arr3d[0][1]));
        System.out.println(Arrays.toString(arr3d[0][2]));

    }
}
