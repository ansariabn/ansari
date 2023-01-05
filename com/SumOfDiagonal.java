package A.skill.com;//package A.skill.com;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int[] [] mat = {
                {4, 5, 6, 7},
                {1, 7, 3, 4},
                {11, 12, 13, 14},
                {23, 24, 25, 50}
        };
        sumOfDiagonal(mat, 4);

    }

    static void sumOfDiagonal(int[][] mat, int n) {

        int Pd = 0, Sd = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == col){
                    Pd += mat[row] [col];
                }
                if ((row + col) == (n - 1)){
                    Sd += mat[row][col];
                }

            }


        }System.out.println("Sum of principal diagonal: " + Pd);
        System.out.println("Sum of Secondary diagonal: " + Sd);
    }
}

