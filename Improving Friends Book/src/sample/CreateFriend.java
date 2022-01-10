package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static String age;
    private static String phoneNumber;

    //Create FileReader, BufferedReader, and ArrayList to read objects in friends.txt file and add to ArrayList
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();


    //Method to add all Friend objects from the ListView into text file
    public static ArrayList allFriends(String fileName) throws IOException {
        //FileReader and BufferedReader to read Friend objects
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        //String friendString is each Friend object
        String friendString = "";

        //Reads each line that is not empty and add Friend object to friends.txt
        while ((line = br.readLine()) != null) {
            //Add each string input into the line until it reaches the ;
            if (!line.equals(";")) {
                friendString += line;
            }
            else {
                //Parse the string and turn it into a Friend object
                parseFriend(friendString);
                friendString = "";
            }
        }
        //Return the friends ArrayList
        return friends;
    }


    //Parse Friend object and add to friends ArrayList
    private static void parseFriend(String string) {
        int pos = 0;
        //Get input
        String name = "";
        String age = "";
        String phoneNumber = "";

        //Loop through each position in the friendString
        for (int i = 0; i < string.length(); i++) {
            //Fields are separated by commas
            if (string.charAt(i) == ',') {
                pos = i;
                name = string.substring(0, pos);
                phoneNumber = string.substring(pos + 1);
            }
        }
        //Add the Friend to the friends ArrayList
        friends.add(new Friend(name, age, phoneNumber));
    }
}
