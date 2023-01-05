import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
class area {
    public static void main(String[] args) {

        // Question No=>3        public class javaExercise
        System.out.println("Q3=>... below");
        int [] myArrays = {1,2,3,4,5,6,7,2,3,4};
        for(int i=0; i<myArrays.length -1; i++){
            for(int j=i+1; j< myArrays.length; j++){

                if(myArrays[i]==myArrays[j]){
                    System.out.println(myArrays[j]);
                }
            }
        }
        System.out.println();
//        code of area of rectangle
       Scanner sc = new Scanner(System.in);
//        Question No=>4
        System.out.println("Q4=>give input of rectangular length and width:");
//        length of rectangular
       int length = sc.nextInt();
        System.out.println("length of  rectangle=" + length);

//        width of rectangular
        int width = sc.nextInt();
        System.out.println("width of rectangle=" + width);

//        area of rectangular
        int area=width*length;
        System.out.println("Area of rectangle="+area);

//        perimeter of rectangular
        int perimeter =(width+width+length+length);
        System.out.println("Perimeter of rectangle="+ perimeter);
        System.out.println();
//
//         Question No=>5 area of circle
        System.out.println("Q5=>Give input of circle Diameter:");
        int diameter =sc.nextInt();  // diameter of circle
        System.out.println("diameter of circle " + diameter);
        int d = diameter*diameter/4;

        System.out.println(d);
//        value of pi
        double pi = 3.14;
        float circleArea = (float) (pi*d);
        System.out.println(circleArea);

        System.out.println();
//      Question No=>6  total marks and percentage scored for Robert.
//      Subject E=> English ; S=> Science ; M=>Math ;
        int E =  78;
        int S =  45;
        int M =  62;
//        sum of all mark give above
        int Sum = E+S+M;
        System.out.println("Sum of all receive Marks "+ Sum);
        int totalMarks = 300;
        System.out.println("Total Marks "+totalMarks);
        float percentage = (float) Sum/totalMarks;
        System.out.println(100*percentage+"%");

        System.out.println();
//        Question No=>7
//        Numbers to swap: 6 and 8
        System.out.println("Q7=>");
        int a, b, t;// x and y are to swap
        System.out.println("Enter the value of a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swapping numbers of a and b: "+a +"  "+ b);
        /*swapping */
        t = a;
        a= b;
        b = t;
        System.out.println("After swapping numbers of a and b: "+a+"   " + b);
        System.out.println( );

//        Question No=>8
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);

        System.out.println();
//        Question No=>9
//        int base = 3, exponent = 4;
        System.out.println("give input any two number for ex 7 and 5");
        int base = sc.nextInt();
        System.out.println(base);
//        this below for spacing between two number
        System.out.println();
        int exponent = sc.nextInt();
        System.out.println(base);
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);

        System.out.println();


//       Question=>10
        System.out.println("Enter Fahrenheit temperature");
        float Fahrenheit =sc.nextFloat();
        float  Celsius;
        Celsius  = (Fahrenheit-32)*5/9;
        System.out.println("Temperature in celsius is: "+Celsius);

        //     challenge-2   question 2=>
        System.out.println();
        System.out.print("Q2:- Enter first Number: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println(b);

        System.out.print("Enter third Number:");
        int c = sc.nextInt();
        System.out.println(c);

        int large  = c > (a>b ? a:b) ? c:((a>b) ? a:b);
        System.out.println("larger number is :" +large);
    }

}