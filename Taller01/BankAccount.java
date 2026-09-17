public class BankAccount {

    private int account_number = 0;
    private String account_holder = "";
    private double balance = 0;

    public int getNumber(){
        return account_number;
    }

    public String getHolder(){
        return account_holder;
    }

    public double getBalance(){
        return balance;
    }

    public void setNumber(int account_number){   
        this.account_number = account_number;
    }

    public void setHolder(String account_holder){
        this.account_holder = account_holder;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    

    public void deposit(double money){
        if(money > 0){
            balance = balance + money;
        }
        else{
            System.out.println("Amount not valid");
        }
    }

    public void withdraw(double money){
        if(money > 0 && money <= balance){
            balance = balance - money;
        }
        else{
            System.out.println("Withdraw not valid");
        }
    }
}
