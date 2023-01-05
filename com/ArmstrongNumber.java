package A.skill.com;


import java.util.Scanner;

public class ArmstrongNumber {

        public static void main(String[] args) {
            int sum = 0, rem;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Number: ");
            int number = sc.nextInt();
            int temp = number;


            while (number > 0){

                rem = number % 10;
                sum = sum + (rem * rem * rem );


                number = number / 10;
            }
            if (temp == sum){
                System.out.println("Number is an Armstrong number");
            }else {
                System.out.println("Number is NOT an Armstrong number");
            }

        }

//        public static void main(String[] args) {
//
//            int no=153,rem,sum=0;
//            int temp=no;
//            while(no>0)
//            {
//                rem=no%10;
//                sum+=(rem*rem*rem);
//                no/=10;
//            }
//            if(sum==temp)
//            {
//                System.out.println("No is Armstrong no");
//            }
//            else
//            {
//                System.out.println("No is not Armstrong no");
//            }
//        }

    }


