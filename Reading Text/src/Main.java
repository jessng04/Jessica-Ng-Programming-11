import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //method to search for the index position of the word the user inputs
    public static int findIndex (String word) throws IOException{
        //FileReader and BufferedReader to read each line of the ProgrammingHistory file
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);

        //String of each line in the ProgrammingHistory file
        String line;

        //initial index position
        int index = 0 ;

        //while loop to read each line
        while ((line = br.readLine()) != null){
            //prints line that is read
            System.out.println("Just read: " + line);
            //searches for the word from user input
            if (line.contains(word)){
                //reads the entire line to find the word
                for (index = line.indexOf(word); index >= 0; index = line.indexOf(word, index +1)){
                    System.out.println("Found word: " + word + ", At index: " + index);
                }
            }
        }
        return index;
    }
    public static void main (String [] args) throws IOException {
        //prompt for user input
        System.out.println("Enter a word to search for in Programming History file: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //Prints index positions for the word in the ProgrammingHistory file
        System.out.println("Found word: " + word + ", At index: " + findIndex(word));

        //Creates an ArrayList to store each line of the file
        ArrayList <String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        //reads each lines in the ProgrammingHistory file
        while ((line = br.readLine()) != null){
            lines.add(line);
        }
        br.close();

        //filewriter and bufferedwriter to write each line of the ProgrammingHistory file to the out file
        FileWriter fw = new FileWriter ("out.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write ("Writing to the out file from ProgrammingHistory file: \r");

        for (String s : lines){
            bw.write (s + "\r");
        }
        bw.close();

    }
}
