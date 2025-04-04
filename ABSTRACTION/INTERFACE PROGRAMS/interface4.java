interface Bank {
    void details();
    void withdraw(double amount);
    void deposit(double amount);
}

class Account implements Bank { 
    private String Name; 
    private double bal;
    private String AccNo;

    Account(String Name, double bal, String AccNo) { 
        this.Name = Name; 
        this.bal = bal;
        this.AccNo = AccNo;
    } 


    public void details() {
        System.out.println("Name: " + Name);
        System.out.println("Account Number: " + AccNo);
        System.out.println("Balance: " + bal);
    }

    public void withdraw(double amount) {
        if (bal >= amount) {
            bal -= amount;
            System.out.println("Balance after withdrawal: " + bal);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(double amount) {
        bal += amount;
        System.out.println("Balance after deposit: " + bal);
    }
}
