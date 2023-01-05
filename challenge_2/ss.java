package DSA;

// Java code to find largest
// three elements in an array

import java.util.Arrays;

class GFG {
    void find3largest(int[] items)
    {
        Arrays.sort(items); // It uses Tuned Quicksort with
        // avg. case Time complexity = O(nLogn)
        int n = items.length;
        int check = 0, count = 1;

        for (int i = 1; i <= n; i++) {

            if (count < 4) {
                if (check != items[n - i]) {
                    // to handle duplicate values
                    System.out.print(items[n - i] + " ");
                    check = items[n - i];
                    count++;
                }
            }
            else
                break;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        GFG obj = new GFG();
        int[] items = { 12, 45, 1, -1, 45, 54, 23, 5, 0, -10 };
        obj.find3largest(items);
    }
}
// This code is contributed by Prashant Malik
