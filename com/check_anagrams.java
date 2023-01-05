//package A.skill.com;
//
////public class check_anagrams {
////    public static void main(String[] args) {
////        String str1 = "Ansari";
////        String str2 = "irasna";
////        String check = String.valueOf(check_ana( str1,str2));
////        System.out.println(check);
////
////
////    }
////    static boolean check_ana (String name, String name2){
////        int n1 = name.length();
////        int n2 = name2.length();
////        if (n1 != n2){
////            return false;
////        }
////
////
////        for (int i = 0; i < n1; i++){
////            if (name[i] != name2[i]){
////                return false;
////            }
////
////        }
////
////
////        return true;
////
////    }
//
//    // JAVA program to check whether two strings
//// are anagrams of each other
//
//import java.util.Arrays;
//
//    class GFG {
//
//        /* function to check whether two strings are
//        anagram of each other */
//        static boolean areAnagram(String str1, String str2)
//        {
//            // Get lengths of both strings
//            int n1 = str1.length();
//            int n2 = str2.length();
//
//            // If length of both strings is not same,
//            // then they cannot be anagram
//            if (n1 != n2)
//                return false;
//
//            // Sort both strings
//            Arrays.sort(str1);
//            Arrays.sort(str2);
//
//            // Compare sorted strings
//            for (int i = 0; i < n1; i++)
//                if (str1[i] != str2[i])
//                    return false;
//
//            return true;
//        }
//
//        /* Driver Code*/
//        public static void main(String args[])
//        {
//            String str1 = "Ansari" ;
//            String str2 = "irasna";
//
////             Function Call
//            if (areAnagram(str1, str2))
//                System.out.println("The two strings are"
//                        + " anagram of each other");
//            else
//                System.out.println("The two strings are not"
//                        + " anagram of each other");
//        }
//    }
//
//// This code is contributed by Nikita Tiwari.
//
//
