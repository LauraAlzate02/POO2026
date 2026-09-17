public class TestBankAccount {
    
    public static void main(String [] args){

        BankAccount account1 = new BankAccount();

        account1.setBalance(20000);
        account1.setHolder("Laura");
        account1.setNumber(123456);

        System.out.println(account1.getNumber());
        System.out.println(account1.getHolder());
        
        account1.deposit(30000);
        System.out.println(account1.getBalance());

        account1.withdraw(6500);
        System.out.println(account1.getBalance());


    }
}
