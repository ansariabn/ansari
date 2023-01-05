package A.skill.com;

public class ThirdLargestNumberInAnArray {
    public static void main(String[] args){
        int temp, Size;
        int[] arr = {1, 14, 2, 16, 10, 20};
        Size = arr.length;

        for(int i = 0; i < Size; i++ ){

            for(int j = i+1; j < Size; j++){

                if(arr[i] > arr[j]){

                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }
        }
        System.out.println("Third largest number is "+arr[Size-3]);
    }
}

