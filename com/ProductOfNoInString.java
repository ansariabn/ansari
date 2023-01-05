package A.skill.com;

public class ProductOfNoInString {
    public static void main(String[] args) {
        String number = "4PREP2INSTAA6HFRE7";
        int count = 1;

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (ch >= '0' && ch <= '9'){
                count = count * (ch- '0') ;

            }
        }
        System.out.println(count);
    }
}
