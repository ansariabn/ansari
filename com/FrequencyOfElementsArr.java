package A.skill.com;//package A.skill.com;

public class FrequencyOfElementsArr {
    public static void main(String[] args) {
        int[] number = {10, 30, 10, 20, 10, 20, 30, 10};


        int[] frequency = new int[number.length];
        int counted = -1;

        for (int i = 0; i < number.length; i++) {
            int count = 1;
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {

                    count++;
                    frequency[j] = counted;
                }
            }
            if (frequency[i] != counted) {
                frequency[i] = count;
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != counted){
                System.out.println("Element: " + number[i] + " Frequency: " + frequency[i]);
            }

        }


    }

}

//public class JavaExample {
//    public static void main(String[] args) {
//
//        int [] numbers ={10, 30, 10, 20, 10, 20, 30, 10} ;
//
//        int [] frequency = new int [numbers.length];
//        int counted = -1;
//        for(int i = 0; i < numbers.length; i++){
//            int count = 1;
//            for(int j = i+1; j < numbers.length; j++){
//                if(numbers[i] == numbers[j]){
//                    count++;
//
//                    frequency[j] = counted;
//                }
//            }
//            if(frequency[i] != counted)
//                frequency[i] = count;
//        }
//
//
//        for(int i = 0; i < frequency.length; i++){
//            if(frequency[i] != counted)
//                System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
//        }
//    }}