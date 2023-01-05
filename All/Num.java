package All;

public class Num {
    public static void main(String[] args) {
        int [] nums = { 23, 50, 40, 65, 78, -13, 16, -5, 28};
        int target = 50;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr,int  target) {
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // check for Element at every index if it is = target

            int element = arr[index];
            if (element == target){
                return index;
            }
            
        }
        return -1;

    }
}
