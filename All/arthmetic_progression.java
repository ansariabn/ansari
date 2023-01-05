package All;

public class arthmetic_progression {
//    sumOfNaturalNumber = SONN
    static int SONN (int n){
        return n* (n+1) / 2 ;
    }

    public static void main(String[] args) {
        int n = 10 ;
        System.out.println("Sum of Natural Number is: " + SONN(n));
    }

}
