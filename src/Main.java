public class Main {
    public static void main(String[] args) {

        BankAccount jinookAccount = new BankAccount("740929", 100000, "Jinook", "jinook@abc.com", "123-456-7890");
        jinookAccount.deposit(50000);
        jinookAccount.getBalance();
        jinookAccount.withdrawal(30000);
        jinookAccount.getBalance();
        jinookAccount.withdrawal(130000);
        jinookAccount.getBalance();
    }
}
