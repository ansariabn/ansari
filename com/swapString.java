package A.skill.com;

public class swapString {
    public static void main(String[] args) {
        String str = "Java";

        char [] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (i < 1){
                char temp = ch[i];
                ch[i] = ch[i + 1];
                ch[i + 1] = temp;
            }

        }
        System.out.println(ch);
    }
}

