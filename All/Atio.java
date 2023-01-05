package All;

import java.util.Scanner;

public class Atio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        if(Ato(num)){
            System.out.println(num);
        }

    }
    static boolean Ato(String str){
        for (int i = 0; i < str.length(); i++) {
            if ( str != str){
                return true;

            }else{
                return false;
            }
        }
        return false;
    }
}
