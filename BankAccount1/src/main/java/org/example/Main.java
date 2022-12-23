public class Main {
    public static void main(String [] args ){
        BankAccount bankerInfo1= new BankAccount("Karuna", 500000);
        BankAccount bankerInfo2= new BankAccount("Hephzibah", 1500000);
        bankerInfo1.withDraw(500);
        bankerInfo1.deposit(2000);
        bankerInfo2.withDraw(1000);
        bankerInfo2.deposit(4000);
        System.out.println("Name of the banker is"+ " "+bankerInfo1.getOwner());
        System.out.println("Account balance is"+" "+ bankerInfo1.getOwner());
        System.out.println("Name of the banker is"+ " "+bankerInfo2.getOwner());
        System.out.println("Account balance is"+ " "+bankerInfo2.getOwner());

    }
}

