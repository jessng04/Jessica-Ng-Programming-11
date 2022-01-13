package sample;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class ControllerTest {
    Pop testPopSong;
    HipHop testHipHopSong;
    Indie testIndieSong;

    @Before
    public void setUp(){
        this.testHipHopSong = new HipHop("Sky", "Playboi Carti");
        this.testIndieSong = new Indie("Softcore", "The Neighbourhood");
        this.testPopSong = new Pop("Valley Girls", "Blackbear");
    }

    //check method to add song to arraylist
    @Test
    public void testAddPop() {
        //clear list and make sure its empty
        testPopSong.popArrayList.clear();
        assertEquals(testPopSong.popArrayList.size(), 0);
        //add the song and check that it is in the arraylist
        testPopSong.addPop();
        assertEquals(testPopSong.popArrayList.size(),1);
    }

    //check method to save song to arraylist and file
    @Test
    public void testSavePop() throws IOException{
        //clear the file
        testPopSong.clearPopFile();
        //add the pop song to arraylist and file
        testPopSong.addPop();
        testPopSong.writeToFilePop();
        //make sure file and arraylist contains the song
        assertEquals(testPopSong.popArrayList.size(),1);
        assertTrue(String.valueOf(testPopSong.popArrayList.contains(testPopSong)), true);
    }

    //check method to load playlist
    @Test
    public void testLoadPop() throws IOException{
        //clear the file
        testPopSong.clearPopFile();
        //add song to the arraylist and file
        testPopSong.addPop();
        testPopSong.writeToFilePop();
        //make sure the arraylist and file contain the song
        assertEquals(testPopSong.popArrayList.size(), 1);
        assertTrue(String.valueOf(testPopSong.popArrayList.contains(testPopSong)), true);
    }

    //check method to delete a song
    @Test
    public void testDeletePop() {
        //clear the arraylist and make sure its empty
        testPopSong.popArrayList.clear();
        assertEquals(testPopSong.popArrayList.size(), 0);
        //add the pop song and check if it is in the arraylist
        testPopSong.addPop();
        assertEquals(testPopSong.popArrayList.size(), 1);
        assertTrue(String.valueOf(testPopSong.popArrayList.contains(testPopSong)), true);
        //delete the song
        testPopSong.deletePop();
        //check if the arraylist contains the song
        assertFalse(testPopSong.popArrayList.contains(testPopSong));
    }

    //check method to save hiphop song
    @Test
    public void testSaveHipHop() throws IOException{
        //clear the hiphop file
        testHipHopSong.clearHipHopFile();
        //add hiphop song to arraylist and file
        testHipHopSong.addHipHop();
        testHipHopSong.writeToFileHipHop();
        //check if arraylist contains the song
        assertEquals(testHipHopSong.hipHopArrayList.size(),1);
        assertTrue(String.valueOf(testHipHopSong.hipHopArrayList.contains(testHipHopSong)), true);
    }

    //check method to load hiphop playlist
    @Test
    public void testLoadHipHop() throws IOException{
        //clear hiphop file
        testHipHopSong.clearHipHopFile();
        //add the hiphop song to arraylist and file
        testHipHopSong.addHipHop();
        testHipHopSong.writeToFileHipHop();
        //make sure the song is in the arraylist and file
        assertEquals(testHipHopSong.hipHopArrayList.size(), 1);
        assertTrue(String.valueOf(testHipHopSong.hipHopArrayList.contains(testHipHopSong)), true);
    }

    //check method to delete hiphop song
    @Test
    public void testDeleteHipHop() {
        //clear the hiphop arraylist and make sure it is empty
        testHipHopSong.hipHopArrayList.clear();
        assertEquals(testHipHopSong.hipHopArrayList.size(), 0);
        //add the hiphop song to the arraylist and make sure it is there
        testHipHopSong.addHipHop();
        assertEquals(testHipHopSong.hipHopArrayList.size(), 1);
        assertTrue(String.valueOf(testHipHopSong.hipHopArrayList.contains(testHipHopSong)), true);
        //delete the song from the list
        testHipHopSong.deleteHipHop();
        //make sure the song is not in the arraylist anymore
        assertFalse(testHipHopSong.hipHopArrayList.contains(testHipHopSong));
    }

    //check method to add hiphop song
    @Test
    public void testAddHipHop() {
        //clear the hiphop arraylist and make sure it is empty
        testHipHopSong.hipHopArrayList.clear();
        assertEquals(testHipHopSong.hipHopArrayList.size(), 0);
        //add the hiphop song
        testHipHopSong.addHipHop();
        //make sure it is there
        assertEquals(testHipHopSong.hipHopArrayList.size(),1);
    }

    //check method to add indie song
    @Test
    public void testAddIndie() {
        //clear the indie arraylist and make sure it is empty
        testIndieSong.indieArrayList.clear();
        assertEquals(testIndieSong.indieArrayList.size(), 0);
        //add indie song to arraylist
        testIndieSong.addIndie();
        //make sure it is there
        assertEquals(testIndieSong.indieArrayList.size(),1);
    }

    //check method to save indie song
    @Test
    public void testSaveIndie() throws IOException{
        //clear the indie file
        testIndieSong.clearIndieFile();
        //add the indie song to arraylist and file
        testIndieSong.addIndie();
        testIndieSong.writeToFileIndie();
        //check if arraylist contains the song
        assertEquals(testIndieSong.indieArrayList.size(),1);
        assertTrue(String.valueOf(testIndieSong.indieArrayList.contains(testIndieSong)), true);
    }

    //check method to load indie playlist
    @Test
    public void testLoadIndie() throws IOException{
        //clear the indie file
        testIndieSong.clearIndieFile();
        //add the indie song to arraylist and file
        testIndieSong.addIndie();
        testIndieSong.writeToFileIndie();
        //make sure the song is in the arraylist
        assertEquals(testIndieSong.indieArrayList.size(), 1);
        assertTrue(String.valueOf(testIndieSong.indieArrayList.contains(testIndieSong)), true);
    }

    //check method to delete indie song
    @Test
    public void testDeleteIndie() {
        //clear indie arraylist and make sure it is empty
        testIndieSong.indieArrayList.clear();
        assertEquals(testIndieSong.indieArrayList.size(), 0);
        //add indie song to arraylist
        testIndieSong.addIndie();
        //make sure the song is in the arraylist
        assertEquals(testIndieSong.indieArrayList.size(), 1);
        assertTrue(String.valueOf(testIndieSong.indieArrayList.contains(testIndieSong)), true);
        //delete the indie song from the arraylist
        testIndieSong.deleteIndie();
        //check if the song has been removed
        assertFalse(testIndieSong.indieArrayList.contains(testIndieSong));
    }
}