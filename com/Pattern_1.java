package A.skill.com;

public class Pattern_1 {
    public static void main(String[] args) {
        for (int row = 0; row < 10 ; row++) {
            if (row >=5){
                System.out.print("#");
            }

            for (int col = 0; col < row; col++) {
                if (row >= 5){

                    System.out.print("@");
                }

            }
            System.out.println("");
        }
    }
}
