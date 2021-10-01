package day07;

public class MethodQuiz2 {

    static double[] calcArrayTotal(int... numbers) {
        double total = 0;
        double[] arrTotAvg = new double[2];
        for (double number : numbers) {
            total += number;
        }
        double avg = total / numbers.length;
        return new double[] {total, avg};



    }

    public static void main(String[] args) {
        int[] numbers = {57, 89, 78, 91, 93, 47};
        double[] arrTotAvg = calcArrayTotal(numbers);
        System.out.printf("총점: %d점, 평균: %.2f점\n", (int)arrTotAvg[0], arrTotAvg[1]);

        // (int)arrTotAvg[0] : 총점, arrTotAvg[1] : 평균

    }
}
