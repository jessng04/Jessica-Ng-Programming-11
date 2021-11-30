import java.util.Scanner;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++){
            //use switch statement to take in each vowel and check against string s
            switch(s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
            }
        }
        return vowelCount;
    }
    //Code your problem number two here
    static int problemTwo(String s){
        int bobCount = 0;

        //tests substrings of 3 for "bob"
        for (int i = 0; i <= s.length() - 3; i++){
            String substring = s.substring(i, i+3);
            if (substring.equals("bob"))
                bobCount++;
        }
        return bobCount;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //make the alphabet a string
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String tester;
        String longest = s.substring(0, 1);
        int firstLetter = 0;
        int secondLetter = 0;
        int acceptableCount = 0;

        //check if characters are in order using i, i+1
        //if there is an alphabetical substring, then it stores in tester
        //if the tester is biggest, it updates to longer
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 0; j < 26; j++) {
                if (s.charAt(i) == alphabet.charAt(j)) {
                    firstLetter = j;
                }
                if (s.charAt(i + 1) == alphabet.charAt(j)) {
                    secondLetter = j;
                }
            }
            if (firstLetter <= secondLetter) {
                tester = s.substring(i - acceptableCount, i + 2);
                if (tester.length() > longest.length()) longest = tester;
                acceptableCount++;
            } else {
                acceptableCount = 0;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */

        //shows the string and outputs
        System.out.print("The string: ");
        String s = "djhskahdsoasuyfgrhedjwiksaobobjildskbobahkjl";
        System.out.println(s);
        System.out.println("\nNumber of vowels: " + problemOne(s));
        System.out.println("Number of times bob occurs is: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order is: " + problemThree(s));
    }
}