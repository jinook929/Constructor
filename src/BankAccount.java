public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("000000", 0, "Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit (int deposit) {
        this.balance += deposit;
        System.out.println(deposit + " deposited. Your current balance is " + this.balance);
    }

    public void withdrawal (int withdrawal) {
        if(this.balance < withdrawal) {
            System.out.println("Not enough balance for withdrawal of " + withdrawal + ". Your current balance is " + this.balance + ".");
        } else {
            this.balance -= withdrawal;
            System.out.println(withdrawal + " withdrawn. Your current balance is " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
