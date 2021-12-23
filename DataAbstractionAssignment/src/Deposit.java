import java.sql.SQLOutput;
import java.util.Date;
import java.util.function.DoublePredicate;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    //constructor
    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: string
    //Modifies: this
    //Effects: if the account is checking, will return deposit into account: checking
    //if the account is saving, will return deposit into account: saving
    public String toString(){
        //your code here
        if(account.equals("Checking")){
            return "Deposit of: $ " + amount + " Date: " + date + " into account: Checking";
        }
        else{
            return "Deposit of: $ " + amount + " Date: " + date + " into account: Saving";
        }
    }

    //Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public static void main (String[] args){
        //date object to get the date
        Date date = new Date();

        //withdraw objects
        Deposit firstDeposit = new Deposit (400.0, date, "Checking");
        Deposit secondDeposit = new Deposit ( 500.0, date, "Saving");

        //print our withdraw objects
        System.out.println("Deposit:");
        System.out.println(firstDeposit);
        System.out.println(secondDeposit);
    }
}
