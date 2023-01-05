package All;

public class SearchNamer {
    public static void main(String[] args) {
        String name = "Ansari";
        char target = 'N';
        System.out.println();

    }
    static boolean Search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
            
        }
        return false;
    }
}
