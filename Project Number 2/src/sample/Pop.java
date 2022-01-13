package sample;

import java.io.*;
import java.util.ArrayList;

public class Pop {
    public ArrayList<Pop> popArrayList = new ArrayList<>();
    String title;
    String artist;

    //constructor
    public Pop(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    //method to write to pop.txt file
    public void writeToFilePop() throws IOException{
        FileWriter fw = new FileWriter("pop.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(title + ",\r");
        bw.write(artist + "\r");
        bw.write(";\r");
        bw.close();
    }

    //method to return title and artist
    public String toString (){
        return "Title: " + title + "\tArtist: " + artist;
    }

    //method to add pop song to pop arraylist
    public void addPop(){
        Pop temp = new Pop(title, artist);
        temp.title = title;
        temp.artist = artist;
        popArrayList.add(temp);
        artist.replaceAll(artist,"");
        title.replaceAll(title, "");
    }

    //method to remove pop song from arraylist
    public boolean deletePop(){
        Pop temp = new Pop(title, artist);
        temp.title = title;
        temp.artist = artist;
        popArrayList.remove(temp);

        if(popArrayList.contains(temp)){
            return true;
        }else {
            return false;
        }
    }
    public void clearPopFile() throws IOException {
        PrintWriter writer = new PrintWriter("pop.txt");
        writer.print("");
        writer.close();
    }

}
