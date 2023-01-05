class challenge_3_part_two{
    public static void main(String[] args) {
        // question No 3( a and b):-
        System.out.println("Question No3(b):");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days.length);
        System.out.println(days[4]);
        for (int i = 0; i < days.length; i++) {
            System.out.println(i);

        }
        for (String week : days) {
            System.out.println(week);

        }
        System.out.println("Question No 4(b)");
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.print("Array length:");
        System.out.println(numArray.length);
        for (int num:numArray) {
            System.out.println(num);
        }

        System.out.println();
        System.out.println("Output the value of the tenth element of the array numArray:");
            for (int i = 0; i<=10; i++) {
                System.out.println(i);


            }  // this is first method for finding the tenth element of the numArray.

        System.out.println(numArray[9]);  // this is second method for the tenth element of the numArray.

        numArray[4]= 15;
        // for changing the array element given above.
        System.out.println("changing the array element from given:- " +numArray[4]);

        System.out.print("the sixth is 5 and thirteenth 12, sum of both value is:- ");
        numArray[8] = numArray[5]+numArray[12];   // the sixth is 5 and thirteenth 12;
        System.out.println(numArray[8]);


//        question No 6:
        System.out.println("question No 6:");
        int [] x = new int[3];
        System.out.println("x[0] is "+ x[0]);


        System.out.println();
        int[] dedo = {1, 3, 6, 9, 2, 5, 7};
        int que =dedo[0];
        for(int k = 0; k< dedo.length; k++){
            if(dedo[k]<que)
                que = dedo[k];
        }
        System.out.println( "question No 6 (2):"+que);


    }


}

