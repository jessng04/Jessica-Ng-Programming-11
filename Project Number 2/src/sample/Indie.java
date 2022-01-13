package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Indie {
    public ArrayList<Indie> indieArrayList = new ArrayList<>();
    String title;
    String artist;

    //constructor
    public Indie(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    //method to write to indie.txt file
    public void writeToFileIndie() throws IOException {
        FileWriter fw = new FileWriter("indie.txt", true);
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

    //method adds indie song to arraylist
    public void addIndie(){
        Indie temp = new Indie (title, artist);
        temp.title = title;
        temp.artist = artist;
        indieArrayList.add(temp);
        artist.replaceAll(artist,"");
        title.replaceAll(title, "");
    }

    //method deletes indie song from arraylist
    public boolean deleteIndie(){
        Indie temp = new Indie (title, artist);
        temp.title = title;
        temp.artist = artist;
        indieArrayList.remove(temp);

        if(indieArrayList.contains(temp)){
            return true;
        }else {
            return false;
        }
    }
    public void clearIndieFile() throws IOException {
        PrintWriter writer = new PrintWriter("indie.txt");
        writer.print("");
        writer.close();
    }
}
