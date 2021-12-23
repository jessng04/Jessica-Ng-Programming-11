import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //date object to get the date
        Date date = new Date();

        //create customer object
        Customer customer = new Customer("Jessica", 10, 400, 500);

        //deposits and withdraws arraylists
        ArrayList<Deposit> deposits = new ArrayList<>();
        ArrayList<Withdraw> withdraws = new ArrayList<>();

        //create two deposits and add them to the arraylist
        Deposit firstDeposit = new Deposit(400, date, "Checking");
        Deposit secondDeposit = new Deposit (500, date, "Saving");
        deposits.add(firstDeposit);
        deposits.add(secondDeposit);

        //create two withdraws and add them to the arraylist
        Withdraw firstWithdraw = new Withdraw (400.0, date, "Checking");
        Withdraw secondWithdraw = new Withdraw (500.0, date, "Saving");
        withdraws.add(firstWithdraw);
        withdraws.add(secondWithdraw);

        //print deposits and withdraws objects
        System.out.println("Deposits:");
        System.out.println(firstDeposit);
        System.out.println(secondDeposit);
        System.out.println("\nWithdraws:");
        System.out.println(firstWithdraw);
        System.out.println(secondWithdraw);

        //print deposits and withdraws arraylists
        System.out.println("\nDeposit ArrayList: " + deposits);
        System.out.println("Withdraw ArrayList: " + withdraws);


    }
}

