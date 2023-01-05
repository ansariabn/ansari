package A.skill.com;

public class RemoveSpace {
    public static void main(String[] args) {
        String g = "        Hi good evening           ";
        // remove String Without trim method
        String [] str = g.split("\\s");

        for (int i = 0; i < str.length; i++) {
            if (str[i] != ""){
                str[i] = str[i] + " ";
                System.out.print(str[i]);
            }

        }



    }
}
//        System.out.println(g.subSequence(8,23));

//        spaceRemove(g);

        // another method to remove spaces
//        String str = "        Hi good evening           ";
//        String[] str3 = str.split("\\s");
//
//        for (int i = 0; i < str3.length; i++) {
//            if (str3[i] != "") {
//                str3[i] = str3[i] + " ";
//                System.out.print(str3[i]);
//            }
//
//
//        }
//
//    }

//    public static void spaceRemove(String g) {
//        String original = "";
//        for (int i = 0; i < g.length(); i++) {
//            char ch = g.charAt(i);
//
//            if (ch != ' ') {
//
//                original += ch;
//            }
//
//        }
//
//        System.out.println(original);
//
//    }
//
//
//}

