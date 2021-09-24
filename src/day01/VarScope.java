package day01;

public class VarScope {
    public static void main(String[] args) {

        int num1 = 10, num2 = 20;

        // #변수는 "선언된 블록"을 벗어나면, 메모리에서 자동제거됨.
        if (true) {

            int num3 = num1 + num2;

        } // end if

//      int num4 = num3 * num1; // num3가 if블록을 벗어나서 죽음.

    } // end main (<- 이렇게 써놓으면 좋음)

//    int num5 = num1; //-> num1 main 넘어가서 죽음.

} // end class (<- 이렇게 써놓으면 좋음)
