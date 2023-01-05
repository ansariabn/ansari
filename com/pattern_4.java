package A.skill.com;

public class pattern_4 {
    public static void main(String[] args) {
        int k = 6, l = 11;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1) {

                    System.out.print("0"+i + " ");
                } else if (j % 2 == 0) {
                    System.out.print(k + " ");
                    k += 10;
                } else{
                    System.out.print(l + " ");
                    l += 10;
                }


            }
            k = 6;
            l = 11;
            k = k + i;
            l = l + i;
            System.out.println();
        }




    }
}





