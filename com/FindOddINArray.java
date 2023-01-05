package A.skill.com;



public class FindOddINArray {
    public static void main(String[] args) {
        int [] n =  {1, 2, 3, 2, 5, 3, 1, 3, 2, 4, 5, 1, 4};
        findOdd(n);

    }
     static void findOdd(int [] n) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 !=0){
                count++;
            }

        }
        System.out.println(count);
    }
}
