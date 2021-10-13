import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //win and lose variables for scoring
        int win = 0;
        int lose = 0;

        //prompt and initial score of 0
        System.out.println("Choose rock paper or scissors. 'r' for rock 'p' for paper and 's' for scissors. To exit choose 'x'");
        System.out.println("**************************************************");
        System.out.print("Wins: 0");
        System.out.println("\tLosses: 0");
        Scanner scan = new Scanner(System.in);

        //start of for loop
        for (int i=0; i < 10000; i++){
            System.out.println("Players Choice: ");
            //player input
            String playerChoice = (scan.next());
            //if player wants to quit the game
            if (playerChoice.equals("x")) {
                System.out.println("Thank you for playing!");
                break;
            }
            //game outcomes
            if (playerChoice.equals("r")||playerChoice.equals("p")||playerChoice.equals("s")) {
                //randomly generated computer move
                int random = (int) (Math.random() * 3);
                //results
                if (random == 0 && playerChoice.equals("r") || random == 1 && playerChoice.equals("p") || random == 2 && playerChoice.equals("s")) {
                    System.out.println("Draw!");
                } else if (random == 0 && playerChoice.equals("s") || random == 1 && playerChoice.equals("r") || random == 2 && playerChoice.equals("p")) {
                    System.out.println("You Lose!");
                    lose++;//adds one to losses score
                } else {
                    System.out.println("You Win!");
                    win++;//adds one to wins score
                }
                //printed out randomly generated computer move
                if (random == 0) {
                    System.out.print("Computer Choice: rock");
                } else if (random == 1) {
                    System.out.print("Computer Choice: paper");
                } else {
                    System.out.print("Computer Choice: scissors");
                }
                //printed out player choice
                if (playerChoice.equals("r")) {
                    System.out.println("\t\tPlayer Choice: rock");
                } else if (playerChoice.equals("p")) {
                    System.out.println("\t\tPlayer Choice: paper");
                } else {
                    System.out.println("\t\tPlayer Choice: scissors");
                }
                //printed out score
                System.out.println("**************************************************");
                System.out.println("Wins: " + win + "\tLosses: " + lose);
            }else{
                //prompt in case of invalid input
                System.out.println("Invalid selection please play again.");
                break;
            }
        }//end of loop
    }
}





