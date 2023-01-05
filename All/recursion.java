package All;

public class recursion {
    public static void main(String[] args) {
        int n = 10;
        int sum = addNumbers(n);
        System.out.println("sum = " + sum);
    }
    public static int addNumbers(int nu){
        if (nu != 0)
            return nu + addNumbers(nu - 1);
        else
            return nu;

    }
//    public static void main(String[] args) {
//        int number = 10;
//        int sum = addNumbers(number);
//        System.out.println("Sum = " + sum);
//    }
//
//    public static int addNumbers(int num) {
//        if (num != 0)
//            return num + addNumbers(num - 1);
//        else
//            return num;
//    }
}