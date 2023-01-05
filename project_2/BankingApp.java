package project_2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static project_2.BankDetails.createAccount;
class Customer{

    String name,address;

    int age;

}

class Account{

    String accType,branchType;

}

class RBI{ // Base class

    int withLimit,n;

    double A,P,r;

    float t;

    long avg,tot,mb;

    int setWithdrawalLimit() {

        Scanner inp = new Scanner(System.in);

        String actype=inp.nextLine();

        String brtype=inp.nextLine();

        if(actype=="SAVINGS" && brtype=="METRO") {

            withLimit = 5000;

        }else {

            withLimit = 4000;

        }

        return withLimit;

    }

    double setInterestRate() {

        A=(P+r)/n*t;

        return A;

    }

    long setMAB() {

        mb=(avg*tot)/31;

        return mb;

    }

}

class SBI extends RBI{ // Child class1

    double setInterestRate() {

        A=P*(1+r/n)+n*t;

        return A;

    }

    long setMAB() {

        mb=(avg+tot)/30;

        return mb;

    }

}

class ICICI extends RBI{ // Child class2

    double setInterestRate() {

        A=(P*r)/n+t;

        return A;

    }

    int setWithdrawalLimit() {

        withLimit=7000;

        return withLimit;

    }

}
class BankDetails {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);
    //method to open new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }
    static void createAccount(){
        System.out.println("****** Welcome to bank ******");
        System.out.println("Do you want to create account: 1. Yes 2. No");
        Scanner acc = new Scanner(System.in);
        int account =acc .nextInt();
        int choice = account;
        if(choice==1){
            System.out.println("Your Account Open");
        }
        else if(choice==2){
            System.out.println("your Account Not Open");
        }
        else{
            System.out.println("Your Not intrested");
        }
        System.out.println("which bank account open: 1.SBI, 2.PNB, 3.ICICI");
        Scanner br = new Scanner(System.in);
         int branch = br.nextInt();
         int Choice = branch;
//
               if (Choice == 1) {
                   System.out.println("Your Account open in SBI");
               }
               if (Choice == 2) {
              System.out.println("Your Account open in PNB");
               }
               if (Choice == 3) {
                   System.out.println("YOur Account open in ICICI");
               }
        System.out.println("Do you want open saving and Current Account: 1. Saving  2. Current");
        Scanner cs = new Scanner(System.in);
        int Sav = cs.nextInt();
        int Choice2 = Sav;
//
        if (Choice2 == 1) {
            System.out.println("Your Account open in Saving");
        }
        if (Choice2 == 2) {
            System.out.println("Your Account open in Current");
        }
        System.out.println(Choice2);
        Random random = new Random();
        int Acc = random.nextInt();
        System.out.println("your ACcount No is: "+ Acc);
        System.out.println("Enter Your Name");
        Scanner n = new Scanner(System.in);
        String name = n.next();
        System.out.println("Your name is :"+name);

        System.out.println("Choose The Password");
        Scanner p = new Scanner(System.in);
//        Random random = new Random();
//        int p = random.nextInt();
        int password = p.nextInt();
        System.out.println("your Password is :"+password);
        System.out.println("******* Your Account will open ******* ");

   }
    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }
    //method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    //method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
    //method to search an account number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
public class BankingApp {
    public static void main(String arg[]) {
        createAccount();
        Scanner sc = new Scanner(System.in);
        SBI sbi = new SBI();

        ICICI icici = new ICICI();

        sbi.P=10.433;

        sbi.r=7.42;

        sbi.n=5;

        sbi.t=7;

        Double sbiInt=sbi.setInterestRate();

        System.out.println("SBI interest rate is:"+sbiInt);

        int iciciWL= icici.setWithdrawalLimit();

        System.out.println("ICICI withdraw limit is:"+iciciWL);
        System.out.println();
        System.out.println("Please Enter you Name And Account NO");
        //create initial accounts
        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();

        BankDetails C[] = new BankDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();
        }

        // loop runs until number 5 is not pressed to exit
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println(" 1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 5);
    }


}