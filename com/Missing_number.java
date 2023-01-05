package A.skill.com;

public class Missing_number {
    public static void main(String[] args) {
        int [] number = {1, 2, 4, 6, 3, 7, 8};

        int N = 8;  // last Number of Series
        int IdealSum = N * (N + 1) / 2;
        int sum = CalculatorSum(number);

        int missingNumber = IdealSum - sum;
        System.out.println(missingNumber);
    }

    static int CalculatorSum(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }

        return sum;
    }
}
