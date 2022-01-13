package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HipHop {
    public ArrayList<HipHop> hipHopArrayList = new ArrayList<>();
    String title;
    String artist;

    //constructor
    public HipHop (String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    //method to write to hiphop.txt file
    public void writeToFileHipHop() throws IOException {
        FileWriter fw = new FileWriter("hiphop.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(title + ",\r");
        bw.write(artist + "\r");
        bw.write(";\r");
        bw.close();
    }

    //method returns title and artist
    public String toString (){
        return "Title: " + title + "\tArtist: " + artist;
    }

    //method adds hiphop song to arraylist
    public void addHipHop(){
        HipHop temp = new HipHop(title, artist);
        temp.title = title;
        temp.artist = artist;
        hipHopArrayList.add(temp);
        artist.replaceAll(artist,"");
        title.replaceAll(title, "");
    }

    //method deletes hiphop song from arraylist
    public boolean deleteHipHop(){
        HipHop temp = new HipHop(title, artist);
        temp.title = title;
        temp.artist = artist;
        hipHopArrayList.remove(temp);

        if(hipHopArrayList.contains(temp)){
            return true;
        }else {
            return false;
        }
    }
    public void clearHipHopFile() throws IOException {
        PrintWriter writer = new PrintWriter("hiphop.txt");
        writer.print("");
        writer.close();
    }
}
