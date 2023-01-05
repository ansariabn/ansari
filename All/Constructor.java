package All;
class base{
    int modelYear;
    String modelName;

    public base(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }


}
public class Constructor {
    public static void main(String[] args) {
        base b = new base(5,"ansari");
//        base c = new base(16, "gomne ");
        System.out.println(b.modelName);
        System.out.println(b.modelYear);
    }
}
