        //Question_5

class remove_duplicate {
    public static void main(String[] args) {
        String Str = "skilllync";
        System.out.println("old string is :" +Str);
        System.out.println("New string is: "+ removeDupliChar(Str));

    }
    public static String removeDupliChar(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(newStr.indexOf(ch)==-1){
                newStr =newStr + ch;

            }
        }
        return newStr;
    }

}