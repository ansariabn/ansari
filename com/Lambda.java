package A.skill.com;
interface Drawable {
    public void draw();

}

public class Lambda {
    public static void main(String[] args) {
        int width = 10;

        // without lambda Expression
        Drawable d2 = new Drawable(){
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }


        };
        // with lambda Expression
//        Drawable d2 = ()->{
//            System.out.println("Drawing " + width);
//        };
        d2.draw();

    }
}
