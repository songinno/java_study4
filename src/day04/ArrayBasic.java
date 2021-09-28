package day04;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        //1. 배열 변수 선언
        int[] arr; //->참조 타입. 데이터 위치정보를 참조

        //2. 배열 객체 생성
        arr = new int[5]; // arr에는 숫자 5개가 저장된 곳의 위치 정보(주소)가 저장되는 것.
        System.out.println(arr); // =>[I:int배열, @: at, 1b6d3586: 주소값

        //3. 배열의 초기화
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 30.5;
        arr[4] = 100;

        //배열의 길이 - 총 공간 수
        System.out.println(arr.length);

        System.out.println("=========================");
        //배열 반복문 처리
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }

        // 값 목록으로 배열 생성하기
        int[] iArr = new int[] {10, 20, 30};
//        int iArr[] = new int[3]; // 이렇게도 되긴 됨.
//        int[] iArr = {10, 20, 30}; //-> 값목록으로 배열 생성시 new 생략 가능 : 첫 배열변수 선언시 이외에는 불가. (수정시x)
        //-> 수정하려면, iArr = new int[] {1, 2, 3};

        String[] foods = {"사과", "딸기", "복숭아", "파인애플"};
        System.out.println("\nfoods.length = " + foods.length);
        System.out.println(Arrays.toString(foods));

        //배열을 생성만하고 초기회하지 않았다면?
        System.out.println("=======================");

        boolean[] bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));

        int[] bArr2 = new int[5];
        System.out.println(Arrays.toString(bArr2));

        double[] bArr3 = new double[5];
        System.out.println(Arrays.toString(bArr3));

        String[] bArr4 = new String[5];
        System.out.println(Arrays.toString(bArr4));

        // => 각 타입의 기본값(초기값)으로 자동 초기화. -> length가 0이 아님.

        // # 배열의 특징
        /*
        1. homogeneous - 배열은 동종모음구조입니다.
        따라서 같은 데이터 형태만 저장할 수 있습니다.
        int배열은 int들만 String배열은 String만 저장시킬 수 있습니다.

        2. immutable - 한번 생성된 배열은 크기(길이)를 늘이거나 줄일 수 없습니다.
        만약 5개를 저장할 배열을 생성했다면 프로그램 실행중에 7개로 늘이거나 2개로 줄일 수없고
        새로운 배열을 생성하여 값을 복사시켜서 이동해야합니다.

        String[] foods = {"사과", "딸기", "복숭아", "파인애플"}; 여기다가 과일 하나 더 넣고 싶음. -> 새로운 배열에 가야함.


        3. reference type - 배열은 참조타입이며
        따라서 변수에 실제 값이 아닌 데이터객체의 주소값을 저장합니다.
        */

        System.out.println("=============================");
        //# 배열 복사 알고리즘
        //
        String[] foods2 = foods;
        foods[1] = "포도";
        foods2[2] = "귤";
        System.out.println("foods: " + Arrays.toString(foods));
        System.out.println("foods2: " + Arrays.toString(foods2));
        // => 복사x, 배열 1개를 둘이서 관리. 배열을 복사한게 아니라 주소를 넣은것.

        // 배열복사: 원본배열과 크기가 같은 배열을 하나 더 생성
        String[] foods3 = new String[foods.length];

//        foods3[0] = foods[0];
//        foods3[1] = foods[1];
//        foods3[2] = foods[2];
//        foods3[3] = foods[3];

        for (int i = 0; i < foods.length; i++) {
            foods3[i] = foods[i];
        }

        foods[0] = "대추";
        foods3[0] = "감";
        System.out.println("foods: " + Arrays.toString(foods));
        System.out.println("foods3: " + Arrays.toString(foods3));

        //# 빈 배열 믄들기
        String[] sArr = {};
        //String[] sArr = new String[0]; // 또는 이렇게

    }
}
