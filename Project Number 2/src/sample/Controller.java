package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;


public class Controller {
    public ListView <Pop> popList;
    public TextField txtPopTitle;
    public TextField txtPopArtist;
    public Button btnAddPop;
    public Button btnSavePop;
    public Button btnLoadPop;
    public Button btnDeletePop;

    public ListView <HipHop> hipHopList;
    public Button btnSaveHipHop;
    public Button btnLoadHipHop;
    public Button btnDeleteHipHop;
    public Button btnAddHipHop;
    public TextField txtHipHopTitle;
    public TextField txtHipHopArtist;

    public ListView <Indie> indieList;
    public Button btnAddIndie;
    public Button btnSaveIndie;
    public Button btnLoadIndie;
    public Button btnDeleteIndie;
    public TextField txtIndieTitle;
    public TextField txtIndieArtist;

    //method to add pop song to the pop playlist
    public void addPop(ActionEvent actionEvent) {
        popList.getItems().add(new Pop (txtPopTitle.getText(), txtPopArtist.getText()));
        txtPopArtist.clear();
        txtPopTitle.clear();
        btnSavePop.setDisable(false);
        btnLoadPop.setDisable(false);
    }

    //method to save pop song to the pop playlist
    public void savePop(ActionEvent actionEvent) throws IOException {
        ObservableList <Pop> myList = popList.getItems();
        for (Pop p : myList){
            p.writeToFilePop();
        }
        popList.getItems().clear();
        btnSavePop.setDisable(true);
    }

    //method to view all songs in the pop playlist from text file
    public void loadPop(ActionEvent actionEvent) throws IOException {
        popList.getItems().clear();
        ArrayList<Pop> pop = CreatePop.createAllPop("pop.txt");
        for (Pop p : pop){
            popList.getItems().add(p);
        }
        btnLoadPop.setDisable(true);
    }

    //method to delete the selected song in the playlist
    public void deletePop(ActionEvent actionEvent) {
        popList.getItems().remove(popList.getSelectionModel().getSelectedItem());
    }

    //method to save hiphop song to hiphop playlist
    public void saveHipHop(ActionEvent actionEvent) throws IOException {
        ObservableList <HipHop> myList = hipHopList.getItems();
        for (HipHop h : myList){
            h.writeToFileHipHop();
        }
        hipHopList.getItems().clear();
        btnSaveHipHop.setDisable(true);
    }

    //method to view songs in hiphop playlist from text file
    public void loadHipHop(ActionEvent actionEvent) throws IOException {
        hipHopList.getItems().clear();
        ArrayList <HipHop> hipHops = CreateHipHop.createAllHipHop("hiphop.txt");
        for (HipHop h : hipHops){
            hipHopList.getItems().add(h);
        }
    }

    //method to delete selected song from hiphop playlist
    public void deleteHipHop(ActionEvent actionEvent) {
        hipHopList.getItems().remove(hipHopList.getSelectionModel().getSelectedItem());
    }

    //method to add hiphop song to hiphop playlist
    public void addHipHop(ActionEvent actionEvent) {
        hipHopList.getItems().add(new HipHop(txtHipHopTitle.getText(), txtHipHopArtist.getText()));
        txtHipHopArtist.clear();
        txtHipHopTitle.clear();
        btnSaveHipHop.setDisable(false);
    }

    //method to add indie song to indie playlist
    public void addIndie(ActionEvent actionEvent) {
        indieList.getItems().add(new Indie(txtIndieTitle.getText(), txtIndieArtist.getText()));
        txtIndieArtist.clear();
        txtIndieTitle.clear();
        btnSaveIndie.setDisable(false);
    }

    //method to save indie song to indie playlist
    public void saveIndie(ActionEvent actionEvent) throws IOException {
        ObservableList <Indie> myList = indieList.getItems();
        for (Indie h : myList){
            h.writeToFileIndie();
        }
        indieList.getItems().clear();
        btnSaveIndie.setDisable(true);
    }

    //method to view indie songs in indie playlist from text file
    public void loadIndie(ActionEvent actionEvent) throws IOException {
        indieList.getItems().clear();
        ArrayList <Indie> indies = CreateIndie.createAllIndie("indie.txt");
        for (Indie h : indies){
            indieList.getItems().add(h);
        }
    }

    //method to delete selected indie song from indie playlist
    public void deleteIndie(ActionEvent actionEvent) {
        indieList.getItems().remove(indieList.getSelectionModel().getSelectedItem());
    }
}
