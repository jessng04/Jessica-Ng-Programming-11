package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateIndie {
    //Fields
    private static String title;
    private static String artist;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Indie> indie = new ArrayList<>();

    //method to create indie songs
    public static ArrayList<Indie> createAllIndie (String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String indieLine = "";

        //finds title and artist of indie songs
        while ((line = br.readLine()) !=null){
            if (!line.equals(";")){
                indieLine += line;
            }
            else {
                parseIndie(indieLine);
                indieLine = "";
            }
        }return indie;
    }

    //method to parse indie song
    private static void parseIndie (String string){
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
        indie.add(new Indie(title, artist));
    }
}
