public class Main {
    public static void main(String[] args) {

        BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getAccountNumber());
        System.out.println(defaultAccount.getCustomerName());
        System.out.println(defaultAccount.getBalance());

        BankAccount jinookAccount = new BankAccount("740929", 100000, "Jinook", "jinook@abc.com", "123-456-7890");
        jinookAccount.deposit(50000);
        jinookAccount.getBalance();
        jinookAccount.withdrawal(30000);
        jinookAccount.getBalance();
        jinookAccount.withdrawal(130000);
        jinookAccount.getBalance();

        BankAccount tomAccount = new BankAccount("Tom", "tom@abc.com", "333-333-3333");
        System.out.println(tomAccount.getCustomerName());
        System.out.println(tomAccount.getAccountNumber());
        tomAccount.setAccountNumber("123456");
        tomAccount.setBalance(10000);
        System.out.println(tomAccount.getAccountNumber());

    }
}
