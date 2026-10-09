
class BankAccount{
    String name;
    double balance;
    BankAccount(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    void deposit(double amount){
        balance=balance +amount;
        System.out.println("After deposit,Balance :"+balance);
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insuffiecient funds");
        }else{
            balance-=amount;
            System.out.println("Amount withdrawn\n Balance :"+balance);
        }
    }
    void showbalance(){
        System.out.println("Balance :"+balance);
    }
}
public class BankSystem {
    public static void main(String[] args) {
        BankAccount bA= new BankAccount("maha",1000);
        bA.deposit(2000);
        bA.withdraw(10000);
        bA.withdraw(100);
        bA.showbalance();
    }
}