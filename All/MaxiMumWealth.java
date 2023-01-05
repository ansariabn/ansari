package All;

public class MaxiMumWealth {
    public static void main(String[] args) {
int [][] num = {
        {1,2,3},
        {3,2,1}
};
        System.out.println(MaxiWealth(num));
    }
    static int MaxiWealth(int [][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length ; account++) {

                sum += accounts[person][account];

            }
            if (sum > ans ){
                ans = sum;
            }

        }
        return ans;
    }
}
