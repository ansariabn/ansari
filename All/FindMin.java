package All;

    // find min element in the arrays
public class FindMin {
    public static void main(String[] args) {
        int [] num = {18, 12,  3, 14, 2,1};
        System.out.println(Min(num));


    }
    static int Min(int [] arr ){
        int ans = arr.length;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
