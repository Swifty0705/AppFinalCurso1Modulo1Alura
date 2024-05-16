package model;

public class Customer extends User{
    private String accountType;
    private String accountNumber;

    public Customer(String username, String email, String accountType) {
        super(username, email);
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
