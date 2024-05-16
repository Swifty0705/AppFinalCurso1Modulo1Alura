package model;

public class Customer extends User{
    private String accountType;
    private int accountNumber;
    private int accountBalance;

    public Customer(String username, String email, String accountType,int accountBalance) {
        super(username, email);
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return "Tipo de cuenta: "+accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return "Numero de cuenta: "+accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountBalance() {
        return "Saldo: "+accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void writeCustomerUser(){
        super.writeUser();
        this.setAccountNumber(100000000 + super.getId());
    }

    public void readCustomerUser(){
        super.readUser();
        System.out.println(this.getAccountType());
        System.out.println(this.getAccountNumber());
        System.out.println(this.getAccountBalance());
    }

    public void depositBalance(int amount){
        this.accountBalance += amount;
    }
    public void withdrawBalance(int amount){
        if(this.accountBalance >= amount){
            this.accountBalance -= amount;
        }else {
            System.out.println("El saldo no es suficiente");
        }
    }

}
