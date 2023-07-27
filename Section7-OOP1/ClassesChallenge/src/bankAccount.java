public class bankAccount {
    //creating fields for account characteristics.
    private int accountNumber;
    private double acctBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //using getter method for the account characteristics above.
    public int getAccountNumber(){

        return accountNumber;
    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //using setter method for the account characteristics.

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAcctBalance(double acctBalance){
        this.acctBalance = acctBalance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public static void deposit(double newDeposit ){
        bankAccount BankAccount = new bankAccount();
        BankAccount.acctBalance += newDeposit;
        double newBalance = BankAccount.acctBalance;
        System.out.println( "You deposited " + newDeposit);
        System.out.println( "You balance is " + newBalance);

    }
    public static void withdrawal(double newWithdrawal){
        bankAccount BankAccount = new bankAccount();
        BankAccount.acctBalance  /*newDeposit*/;
        System.out.println( "You deposited "  /*newDeposit*/);
        System.out.println( "You balance is " + BankAccount.acctBalance);

    }
}

