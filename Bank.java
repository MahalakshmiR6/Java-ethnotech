class Bank{
    public static void main(String args[]){
        Account a1 = new Account(12345, "John Doe", 400);
        a1.showBalance();
        System.out.println("After Depositing");
        a1.deposit(2000);
        a1.showBalance();}
}
class Account{
    int acc_no;
    String name;
    int balance;

    Account(int acc_no, String name, int balance){
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }
    void deposit(int amount){
        balance += amount;
    }
    void showBalance(){
        if(balance<500){
        System.out.println("Insufficient funds");
        }
        else{
            System.out.println("Balance: "+balance);
        }
    }
}