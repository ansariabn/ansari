package A.skill.com;



interface Calculator {
    void add();
    void sub();
    void mul();


}
interface Test {
    void Test();
}
public class Interface {
    public static void main(String[] args) {
        Calculator c1 = new Calculator() {
            @Override
            public void add() {
                System.out.println("Inside ADD");
            }

            @Override
            public void sub() {
                System.out.println("Inside Sub");
            }

            @Override
            public void mul() {
                System.out.println("Inside mul");
            }
        };
        c1.add();
        c1.mul();
        c1.sub();
         Test t = new Test (){
             public void Test (){
                System.out.println("test");
            }
        };
    }
}
