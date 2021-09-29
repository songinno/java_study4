package day05;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {


        int arr[] = {10,20,40,50,60};
        System.out.println("수정전" + Arrays.toString(arr));
        int newNumber = 30;
        //20, 40 사이 30 넣고싶음.

        //큰 방으로 이사를 먼저 가야함.
        int temp[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));

        // 60을 먼저 뒤로 밀고, 50, 40 밀고, 2번 인덱스의 40을 30으로 수정.

//        temp[temp.length] = temp[temp.length - 1];

//        temp[5] = temp[4];
//        temp[4] = temp[3];
//        temp[3] = temp[2];

        // 정규화
        int addIdx = 2;
        for (int a = temp.length-1; a > addIdx ; a--) {
            temp[a] = temp[a - 1];
        }

        temp[addIdx] = newNumber;
        System.out.println("temp: " + Arrays.toString(temp));

        arr = temp; temp = null;

        System.out.println("arr: " + Arrays.toString(arr));

    }
}
