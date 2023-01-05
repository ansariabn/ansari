package A.skill.com;

// Java program to validate
// the password using ReGex

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class valid_password {

    public static boolean
    isValidPassword(String Password)
    {


        String Regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,15}$";

        Pattern a = Pattern.compile(Regex);

        if (Password == null) {
            return false;
        }

        Matcher m = a.matcher(Password);

        return m.matches();
    }

    public static void main(String args[])
    {

        // Test Case 1:
        String str1 = "Alpha#3579";
        System.out.println(isValidPassword(str1));


    }
}

