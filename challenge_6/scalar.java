class scalar {
    static int i;
    static {
        System.out.println("a");
        i = 100;
    }
    public class StaticBlock{
        static {
            System.out.println("b");
        }
    }
    public static void main(String[] args) {
        System.out.println("c");
        System.out.println(scalar.i);
    }
}