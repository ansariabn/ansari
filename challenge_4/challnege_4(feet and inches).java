import java.util.*;

//class Distance to read, print and add distance
class Distance {
    private int feet;
    private int inches;

    public void getDistance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feet: ");
        feet = sc.nextInt();
        System.out.print("Enter inches: ");
        inches = sc.nextInt();
    }
    public void showDistance() {
        System.out.println("Feet:" + feet);
        System.out.println("Inches:" + inches);
    }

    public void addDistance(Distance D1, Distance D2) {
        inches = D1.inches + D2.inches;
        feet = D1.feet + D2.feet + (inches / 12);
        inches = inches % 12;
    }
}

class AddTwoDistance {
    public static void main(String[] s) {
        try {

            Distance D1 = new Distance();
            Distance D2 = new Distance();
            Distance D3 = new Distance();

            //read first distance
            System.out.println("Enter first distance: ");
            D1.getDistance();

            //read second distance
            System.out.println("Enter second distance: ");
            D2.getDistance();

            //add distances
            D3.addDistance(D1, D2);
            //print distance
            System.out.println("Total distance is:");
            D3.showDistance();
        } catch (Exception e) {
            System.out.println("Exception occurred :" + e.toString());
        }
    }
}