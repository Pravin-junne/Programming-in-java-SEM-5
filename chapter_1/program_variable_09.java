public class program_variable_09 {
    public static void main(String args[]){
        BankAccount b1 = new BankAccount(5000);
        b1.deposite(5000); //5000 added in bank
        b1.withdraw(2000); //2000 withdraw from bank

        b1.displayBalance(); //total balance
    }
    
}

//bank class
class BankAccount{
    private double balance;

    public BankAccount(double initailBalance){
        this.balance = initailBalance;
    }

    public void deposite(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void displayBalance(){
        System.out.println("Toatal Balance:"+balance);
    }

}
