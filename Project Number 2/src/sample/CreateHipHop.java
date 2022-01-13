package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateHipHop {
    //Fields
    private static String title;
    private static String artist;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<HipHop> hiphop = new ArrayList<>();

    //method to create hiphop songs
    public static ArrayList<HipHop> createAllHipHop (String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String hipHopLine = "";

        //finds the title and artist of hiphop songs
        while ((line = br.readLine()) !=null){
            if (!line.equals(";")){
                hipHopLine += line;
            }
            else {
                parseHipHop(hipHopLine);
                hipHopLine = "";
            }
        }return hiphop;
    }

    //method to parse hiphop song
    private static void parseHipHop (String string){
        int pos = 0;
        String title = "";
        String artist ="";

        for (int i = 0; i < string.length(); i++){
            if (string.substring(i,i+1).equals(",")){
                pos = i;
                title = string.substring(0,pos);
                artist = string.substring(pos+1);
            }
        }
        hiphop.add(new HipHop(title, artist));
    }
}
