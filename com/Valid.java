package A.skill.com;

public class Valid {
    public static void main(String[] args) {

        String str = "Alpha#3579";


        System.out.println(password(str));

    }

        static boolean password (String str){
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int sp = (int) ch;

                if (ch > '0' && ch <= '9' || ch >= 'a' && ch <= 'z'
                        || ch >= 'A' && ch <= 'Z' || str.length() > 8 && str.length() < 15
                        || sp >= 35 && sp < 43) {
                    return true;

                }

            }
            return false;
        }

    }
