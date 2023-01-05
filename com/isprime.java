package A.skill.com;



import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if (isPrime(n)) {
            System.out.println(n + " is prime No");

        }
        else {
            System.out.println(n + " is NOT prime No");
        }


    }

    static boolean isPrime(int number) {
            if (number == 1){
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;

    }


}
