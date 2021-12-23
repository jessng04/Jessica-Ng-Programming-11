import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    //constructor
    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: string
    //Modifies: this
    //Effects: if the account is Checking, will return withdraw statement into account: Checking
    //if the account is Saving, will return withdraw statement into account: Saving
    public String toString(){
        //your code here
        if (account.equals("Checking")){
            return "Withdraw of: $" + amount + " Date: " + date +" into account: Checking";
        }
        else {
            return "Withdraw of: $" + amount + " Date: " + date + " into account: Saving";
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
        Withdraw firstWithdraw = new Withdraw (400.0, date, "Checking");
        Withdraw secondWithdraw = new Withdraw (500.0, date, "Saving");

        //print our withdraw objects
        System.out.println("Withdraw:");
        System.out.println(firstWithdraw);
        System.out.println(secondWithdraw);
    }
}
