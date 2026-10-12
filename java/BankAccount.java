class BankAccount {
    String name;
    int accountNumber;
    double balance;

    void setDetails(String n, int acc, double b) {
        name = n;
        accountNumber = acc;
        balance = b;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setDetails("Antariksh", 12345, 5000.50);
        b.display();
    }
}
```

