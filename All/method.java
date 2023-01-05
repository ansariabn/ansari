package All;

public class method {
    public int logic(int x, int y){
        int z;
        if(x>y){
            z = x + y;
        }else{
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        method obj = new method();
        c = obj.logic(a, b);
        System.out.println(c);

    }
}
//if used static method then simply call.
//if used public method then create an object and then call.