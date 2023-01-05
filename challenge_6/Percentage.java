
abstract class Mark{

    abstract float getPercentage();

}

class A extends Mark{

    float sub1 , sub2 , sub3;

    float per;

    A(float a , float b, float c){

        sub1 = a;

        sub2 = b;

        sub3 = c;

    }

    @Override

    public float getPercentage(){

        per = (sub1 + sub2 + sub3 )/300* 100;

        return per;

    }

}



class B extends Mark{

    float sub1 , sub2 , sub3 , sub4;

    float per;



    B(float a , float b, float c,float d){

        sub1 = a ;

        sub2 = b;

        sub3 = c;

        sub4 = d;

    }



    @Override

    public float getPercentage(){

        per = (sub1 + sub2 + sub3 + sub4 )/400* 100;



        return per;

    }

}
public class Percentage {

    public static void main(String[] args) {

        A ob = new A(70f, 50f, 100f);

        System.out.println("Student 1 Per: " + ob.getPercentage());


        B obj = new B(90f, 75f, 64f,86f);

        System.out.println("Student 2 Per: " + obj.getPercentage());


    }
}



