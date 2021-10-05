import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Getting user input
        System.out.println("Choose rock paper or scissors. 'r' for rock 'p' for paper and 's' for scissors.");
        Scanner scan = new Scanner(System.in);
        String playerChoice = (scan.next());
        //Make sure playerChoice is valid
        if (!playerChoice.equals("r") && !playerChoice.equals("p") && !playerChoice.equals("s")) {
            System.out.println("Invalid selection please play again");
        } else {
            //Randomly generated computer move
            int random = (int) (Math.random() * 3);
            //Results
            if (random == 0 && playerChoice.equals("r") || random == 1 && playerChoice.equals("p") || random == 2 && playerChoice.equals("s") ) {
                System.out.println("Draw!");
            } else if (random == 0 && playerChoice.equals("s") || random == 1 && playerChoice.equals("r") || random == 2 && playerChoice.equals("p")) {
                System.out.println("You Lose!");
            } else {
                System.out.println("You Win!");
            }
            //Printed out randomly generated computer move
            if (random == 0) {
                System.out.print("Computer Choice: rock");
            } else if (random == 1) {
                System.out.print("Computer Choice: paper");
            } else {
                System.out.print("Computer Choice: scissors");
            }
            //Printed out player choice
            if (playerChoice.equals("r")) {
                System.out.println("\t\tPlayer Choice: rock");
            } else if (playerChoice.equals("p")) {
                System.out.println("\t\tPlayer Choice: paper");
            } else {
                System.out.print("\t\tPlayer Choice: scissors");
            }

        }
    }

}


