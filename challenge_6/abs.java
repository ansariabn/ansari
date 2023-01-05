
abstract class Bank {
    abstract int getBalance();

}
class BankA extends Bank {

    private int balance;

    @Override
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class BankB extends Bank {

    private int balance;

    @Override
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

}
class BankC extends Bank {

    private int balance;

    @Override
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

}

class abs {

    public static void main(String[] args) {

        BankA bankA = new BankA();

        BankB bankB = new BankB();

        BankC bankC = new BankC();

        bankA. setBalance(100);

        bankB. setBalance(150);

        bankC.setBalance(200);

        System.out.println("Deposit Balance is A = $"+ bankA.getBalance());

        System.out.println("Deposit Balance is B = $"+bankB.getBalance());

        System.out.println("Deposit Balance is C = $"+bankC.getBalance());

    }

}