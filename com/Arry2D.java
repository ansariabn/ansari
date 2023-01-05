package A.skill.com;

class student{
    int[][] arr ={
            {0, 2},
            {1, 3},
            {2, 4}
    };
}


public class Arry2D {
    public static void main(String[] args) {

        student stu = new student();
        int class1 = stu.arr[0][0];
        System.out.println(class1);





        int[] class2 = stu.arr[1];
        System.out.println(class2);

        int class3 = stu.arr[2][1];


    }
}
