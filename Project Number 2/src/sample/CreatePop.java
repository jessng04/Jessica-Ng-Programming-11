package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreatePop {
    //fields
    private static String title;
    private static String artist;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Pop> pop = new ArrayList<>();

    //method to create pop songs
    public static ArrayList<Pop> createAllPop (String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String popLine = "";

        //finding title and artist of pop song
        while ((line = br.readLine()) !=null){
            if (!line.equals(";")){
                popLine += line;
            }
            else {
                parsePop(popLine);
                popLine = "";
            }
        }return pop;
    }

    //method to parse pop song
    private static void parsePop (String string){
        int pos = 0;
        String title = "";
        String artist ="";

        for (int i = 0; i < string.length(); i++){
            if (string.substring(i,i+1).equals(",")){
                pos = i;
                title = string.substring(0, pos);
                artist = string.substring(pos+1);
            }
        }
        pop.add(new Pop(title, artist));
    }

}
