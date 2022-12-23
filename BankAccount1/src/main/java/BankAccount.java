public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void withDraw(double amountWithdraw){
        if(amountWithdraw<balance){
            this.balance=this.balance-amountWithdraw;
        } else if (amountWithdraw>balance) {
            System.out.println("Withdraw failed"+owner);
        }

    }

    public void deposit(double amountDeposited){
        this.balance=this.balance+amountDeposited;
        System.out.println("Account balance for"+" "+owner+" "+balance);
    }


}
