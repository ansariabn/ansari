package A.skill.com;

public class countUpperCase {
    public static void main(String[] args) {
        String name = "JaVa Is thE BeSt LANguaGe";
        System.out.println(upperCase(name));
    }

    static int upperCase(String naam) {
        int count = 0;
        for (int i = 0; i < naam.length(); i++) {
            char ch = naam.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }
}


