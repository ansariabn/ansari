package All;
class wala{
    int age;
    String name;

    public int getA() {
        return age;
    }

    public void setA(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class setter_getter {
    public static void main(String[] args) {
        wala w = new wala();
        w.setName("momin");
        w.setA(50);
        System.out.println(w.getName());
        System.out.println(w.getA());
    }
}
