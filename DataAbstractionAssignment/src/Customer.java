import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private double checkDeposit;
    private double savingDeposit;
    private double checkWithdraw;
    private double savingWithdraw;
    private double amount;

    Customer(){
        //create default constructor
        name = "";
        accountNumber = 1;
        checkDeposit = 400.0;
        savingDeposit = 400.0;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkDeposit = checkDeposit;
        this.savingDeposit = savingDeposit;

    }

    //Requires: double amt
    //Modifies: this, deposits
    //Effect: if the account is Checking, the amt is equal to checkBalance
    //if the account is Saving, the amt is equal to savingBalance
    public double deposit(double amount, Date date, String account){
        //your code here
        if(account.equals("Checking")){
            checkBalance = checkBalance + amount;
            return checkBalance;
        }
        else {
            savingBalance = savingBalance + amount;
            return savingBalance;
        }

    }

    //Requires: double amt
    //Modifies: this, withdraw
    //Effect: if the account is Checking, the amount is equal to checkWithdraw, then the checkBalance is calculated
    //if the account is Saving, the amount is equal to savingWithdraw, then the savingBalance is calculated
    public double withdraw(double amount, Date date, String account){
        //your code here
        if(account.equals("Checking")){
            amount = checkWithdraw;
            checkBalance = checkBalance - amount;
            if (checkOverdraft(amount, account)){
                checkBalance = checkBalance + amount;
            }
            return checkBalance;
        }
        else {
            amount = savingWithdraw;
            savingBalance = savingBalance - amount;
            if (checkOverdraft(amount,account)){
                savingBalance = savingBalance + amount;
            }
            return savingBalance;
        }

    }

    //Requires: double amt
    //Modifies: nothing
    //Effect: returns true if overdraft is bigger than checkBalance
    private boolean checkOverdraft(double amount, String account){
        //your code here
        if(checkBalance<OVERDRAFT){
            return true;
        }
        return savingBalance < OVERDRAFT;
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

    //Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<Deposit> deposits) {
        this.deposits = deposits;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(ArrayList<Withdraw> withdraws) {
        this.withdraws = withdraws;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingRate() {
        return savingRate;
    }

    public void setSavingRate(double savingRate) {
        this.savingRate = savingRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCHECKING() {
        return CHECKING;
    }

    public static String getSAVING() {
        return SAVING;
    }

    public int getOVERDRAFT() {
        return OVERDRAFT;
    }

    public double getCheckDeposit() {
        return checkDeposit;
    }

    public void setCheckDeposit(double checkDeposit) {
        this.checkDeposit = checkDeposit;
    }

    public double getSavingDeposit() {
        return savingDeposit;
    }

    public void setSavingDeposit(double savingDeposit) {
        this.savingDeposit = savingDeposit;
    }

    public double getCheckWithdraw() {
        return checkWithdraw;
    }

    public void setCheckWithdraw(double checkWithdraw) {
        this.checkWithdraw = checkWithdraw;
    }

    public double getSavingWithdraw() {
        return savingWithdraw;
    }

    public void setSavingWithdraw(double savingWithdraw) {
        this.savingWithdraw = savingWithdraw;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
