//package All;
//
//import java.util.Scanner;
//
//class aToi
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while(t>0)
//        {
//            String str = sc.nextLine();
//
//            Solution obj = new Solution();
//            System.out.println(obj.atoi(str));
//            t--;
//        }
//    }
//}




//class Solution
//{
//    int atoi(String str)
//    {
//
//        int result=0;
//        int i=0;    //just a current character pointer for string
//        int sign = 1;   //multiplied at the end to result to determine if the string is +ve or -ve
//        if(str[i]=='-')
//        {
//            sign = -1;
//            i++;
//        }
//        //Now traverse the entire string and convert it into integer
//        while(str[i])
//        {
//            //If any character is not an integer then just return -1
//            if(!(str[i]-'0'>=0 && str[i]-'0'<=9))
//                return -1;
//            //else just keep updating the result
//            result = result*10 + str[i]-'0';
//            i++;
//        }
//        return result*sign;
//    }
//}