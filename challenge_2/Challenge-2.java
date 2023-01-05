import jdk.swing.interop.SwingInterOpUtils;
import java.util.Random;
import java.util.Scanner;
class challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        question 1=>
        System.out.println(" Q1:- Enter any number for factorial:");
        int number = sc.nextInt();
        System.out.println("your choice Number is: "+number);
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);


        System.out.println();
        //        question 2=>
        int num1, num2, num3;
        System.out.println("Enter three integers: ");
        Scanner in = new Scanner(System.in);
        num1=in.nextInt();
        System.out.println("first Number:" +num1);
        num2=in.nextInt();
        System.out.println("Second Number:" +num2);
        num3=in.nextInt();
        System.out.println("Third number:" +num3);
        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is: " + num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("The largest number is: "+num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println("The largest number is: "+num3);
        }
        else{
            System.out.println("The numbers are same.");
        }


        System.out.println();
//        Question 3=>
        int n, j; //space = 1;
        System.out.println("Q3=> number of rows: ");
        n = 5;
//        space = n - 1;
        for (j = 1; j <= n; j++) //row
        {
//            for (i = 1; i <= space; i++)  // half diamond
//            {
//                System.out.print(" ");
//            }
//            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
//        space = 1;
        for (j = 1; j <= n - 1; j++)
        {
//            for (i = 1; i <= space; i++)
//            {
//                System.out.print(" ");
//            }
//            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }




        System.out.println();
//        Question 5=>
        int sum = 0;
        int nu = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        // do...while loop continues
        // until entered number is positive
        do {
            // add only positive numbers

            System.out.println("Enter a first number");
            num1 = input.nextInt();
            System.out.println("Enter a Second Number");
            num2 = input.nextInt();
            nu = num1 + num2;
            sum += nu;
            break;

        } while(nu >= 0);

        System.out.println("Sum = " + sum);
        input.close();



        System.out.println();
//        Question 6 => part 1
        for(int z = 0; z<10; z++){
            if(z % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
//        question 6 => part 2
        int s = 0;
        for( s = 0 ; s < 10; s++){
            continue;
        }
        System.out.println(s);



        System.out.println();
//        Question 4=>
        int answer, guess;
        // maximum value is 100
        final int MAX = 100;
        // takes input using scanner
        Scanner ins = new Scanner(System.in);

        // Random instance
        Random rand = new Random();

        boolean correct = false;

        // correct answer
        answer = rand.nextInt(MAX) + 1;

        // loop until the guess is correct
        while (!correct) {

            System.out.println("Guess a number between 1 and 100: ");

            // guess value
            guess = ins.nextInt();

            // if guess is greater than actual
            if (guess > answer) {
                System.out.println("Too high, try again!");
            }

            // if guess is less than actual
            else if (guess < answer) {
                System.out.println("Too low, try again!");
            }

            // guess is equal to actual value
            else {
                System.out.println( "Yes, you guessed the number.");
                correct = true;
            }
        }
        System.exit(0);


    }
}