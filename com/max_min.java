package A.skill.com;

public class max_min {
    public static void main(String[] args) {
        max();
        min();
    }
     static void min() {
        int[] arr = {5, 6, 12, 1, 18, 8};
        int min = arr[0];
        for ( int i = 0; i < arr.length; i++) {


            if (min > arr[i]){
                min = arr[i];
            }

        } System.out.println(min);
    }
    static void max() {
        int[] arr = {5, 6, 12, 1, 18, 8};
        int max = arr[0];
        for ( int i = 0; i < arr.length; i++) {


            if (max < arr[i]){
                max = arr[i];
            }

        } System.out.println(max);
    }
}
