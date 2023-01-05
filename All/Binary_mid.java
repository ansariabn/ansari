package All;

public class Binary_mid {
    public static void main(String[] args) {
        int [] nums = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 4;
        int ans = middle(nums, target, 0, 9);
        System.out.println(ans);

    }
    static int middle(int [] arr, int target, int start, int end){

        for (int i = 0; i < arr.length; i++) {
            int elemet = arr[i];
            if ( elemet == target){
                return elemet;
            }


        }

        return (-1);
    }
}
