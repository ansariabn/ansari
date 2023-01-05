import java.util.Scanner;
class challeneg_3{
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++)  {  // the number taken between 1 to 50 only.
            if(isPrime(i))
            {
                System.out.println(i);
            }

        }  // this is question no 1


//        question no 2
        Scanner console = new Scanner(System.in);  //this is question no 2

        int num;

        System.out.print("Enter a number: ");
        num = console.nextInt();

        if(isPalindrom(num))
        {
            System.out.println("Number is palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        }
    }


//    question no 2
    public static boolean isPalindrom(int number)  // this is question no 2
    {
        int temp = number;
        int remainder;
        int reverse = 0;

        while(temp > 0)
        {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse == number;
    }


    // question no 1
    public static boolean isPrime(int number)  // this is question no 1
    {
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}