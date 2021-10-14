import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //prompt for user input
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the original word: ");
        String encryption = (scan.next());
        //defining the last letter of the word
        String lastLetter = encryption.substring(encryption.length()-1);
        //defining the rest of the word, not the last letter
        String middle = encryption.substring(0, encryption.length()-1);
        //output with last letter, rest of the word, and ay
        System.out.println("Encrypted word is: ");
        System.out.println(lastLetter + middle + "ay");

        //prompt user to enter scrambled word to change back to original. Not using the string variable encryption,
        // but by manually reversing the scramble process above
        System.out.println("To change the encrypted word back to the original, please enter the encrypted word:");
        String revert = (scan.next());
        //define the last letter that is the first in the scramble
        String firstLetter = revert.substring(0,1);
        //define the middle portion of the word
        String middleRevert = revert.substring(1, revert.length()-2);
        //output with original word
        System.out.println("Original word was: ");
        System.out.println(middleRevert + firstLetter);
    }
}
