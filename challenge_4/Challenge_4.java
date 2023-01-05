
import java.util.Scanner;
//why my answer wrong of area and perimeter?
class Challenge_4 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 3;
        t.b = 4;
        t.c = 5;
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());


    }
    class Distance{
        int feet;
        int inch;
        public void getDistance(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter feet:");
            feet = sc.nextInt();
            System.out.println("Enter inches:");
            inch = sc.nextInt();
        }
        public void showDistance(){
            System.out.println("Feet: \" + feet + \"inches:" + inch);
        }
        public void addDistance(Distance D1, Distance D2) {
            inch = D1.inch + D2.inch;
            feet = D1.feet + D2.feet + (inch / 12);
            inch = inch % 12;
        }

    }

}
    class Triangle {
        int a, b, c;

        public double getArea() {
            double s = (double)(a + b + c ) / 2.0;
            return Math.pow((s * (s - a) * (s - b) * (s - c)),.5);
        }

        public double getPerimeter() {
            return (a + b +c) / 2.0;
        }
    }





