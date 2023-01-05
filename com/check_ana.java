package A.skill.com;

import java.util.Arrays;

public class check_ana {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "dcba";

        if(anagram (str, str2)){
            System.out.println("The both String is Anagram");
        }else {
            System.out.println("The both String is Not Anagram ");
        }
    }
     static boolean anagram(String str, String str2) {
         char [] a1 = str.toCharArray();
         char [] a2 = str2.toCharArray();
         Arrays.sort(a1);
         Arrays.sort(a2);
         return Arrays.equals(a1, a2);

     }
}
