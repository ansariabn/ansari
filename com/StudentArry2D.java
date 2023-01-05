package A.skill.com;
import java.util.Scanner;

public class StudentArry2D {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[][] Class1 = new String[1][2];

        String[][] Class2 = new String[1][3];

        String[][] Class3 = new String[1][4];


        for (int i = 0; i < Class1.length; i++) {
            System.out.println("Enter student name of Class1");
            for (int j = 0; j < Class1[0].length; j++) {
                System.out.println("enter name");
                Class1[i][j] = s.next();
            }
        }
        for (int i = 1; i < Class2.length; i++) {
            System.out.println("Enter student name of Class2");
            for (int j = 1; j < Class2[3].length; j++) {
                System.out.println("enter name");
                Class2[i][j] = s.next();

            }
        }


        for (int i = 1; i < Class3.length; i++) {
            System.out.println("Enter student name of Class3");
            for (int j = 1; j < Class3[4].length; j++) {
                System.out.println("enter name");
                Class3[i][j] = s.next();
            }
        }
        for (int i = 0; i < Class1.length; i++) {
            System.out.println("Class1");
            for (int j = 0, c = 1; j < Class1[0].length; j++, c++) {
                System.out.println("Student -" + c + " " + Class1[i][j]);
            }
        }
        for (int i = 0; i < Class3.length; i++) {
            System.out.println("Enter student name of Class3");
            for (int j = 0; j < Class3[0].length; j++) {
                System.out.println("enter name");
                Class3[i][j] = s.next();
            }
        }
        for (int i = 0; i < Class1.length; i++) {
            for (int j = 0, c = 1; j < Class1[0].length; j++, c++) {
                System.out.println("Student -" + c + " " + Class1[i][j]);
                System.out.println("Class1");

            }
        }


        for (int i = 0; i < Class2.length; i++) {
            for (int j = 0, c = 1; j < Class2[0].length; j++, c++) {
                System.out.println("Class2");
                System.out.println("Student -" + c + " " + Class2[i][j]);
            }
        }

        for (int i = 0; i < Class3.length; i++) {
            System.out.println("Class3");
            for (int j = 0, c = 1; j < Class3[0].length; j++, c++) {
                System.out.println("Student -" + c + " " + Class3[i][j]);
            }
        }
    }
}