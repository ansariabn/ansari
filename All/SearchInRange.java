package All;

public class SearchInRange {
    public static void main(String[] args) {
        int [] num = {40, 20, 50, 70, 80};
        int target = 70;
        int ans = SearchIn(num, target, 1, 4);
        System.out.println(ans);

    }
    static int SearchIn(int [] arr, int target,int Start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = Start; i < end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }

        }
        return -1;
    }
}
