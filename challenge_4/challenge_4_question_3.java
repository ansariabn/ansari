
//this method is common for all this is the best method.
        class Employee{
            int age, Id;
            String name , Designation;
            public int getAge(){
                return age;
            }
            public int getId(){
                return Id;
            }
            public String getDesignation(){
                return Designation;
            }
            public String getName(){
                return name;
            }
        }
public class challenge_4_question_3 {
    public static void main(String[] args) {
//        this is for first employee when you used second employee then make another object
        Employee EM1 = new Employee();
        Employee Em2 = new Employee();
        Em2.Id = 102;
        Em2.age = 222;
        Em2.name = "Ansariii";
        Em2.Designation = "Engineeiiiir";
        EM1.Id = 101;
        EM1.age = 22;
        EM1.name = "Ansari";
        EM1.Designation = "Engineer";

        // this is second employee
        System.out.println("age: "+EM1.getAge());
        System.out.println("Name:"+EM1.getName());
        System.out.println("Designation:" +EM1.getDesignation());
        System.out.println("Id:" +EM1.getId());

        System.out.println();

        // this is first employee
        System.out.println("age: "+Em2.getAge());
        System.out.println("Name:"+Em2.getName());
        System.out.println("Designation:" +Em2.getDesignation());
        System.out.println("Id:" +Em2.getId());

    }
}


