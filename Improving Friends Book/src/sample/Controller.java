package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetPhone;
    public Button btnDeleteFriend;
    public Label lblName;
    public Label lblAge;
    public Label lblPhone;
    public ListView<Friend> friendList = new ListView<>();
    public static ArrayList <Friend> testList = new ArrayList<>();
    public static ArrayList <String> nameList = new ArrayList<>();
    public static String getTextName;
    public Button btnSave;
    public Button btnLoad;

    //method to add a friend to the list
    public void addFriend(ActionEvent actionEvent){
        getTextName = textGetName.getText();

        String name = textGetName.getText();
        String age = textGetAge.getText();
        String phoneNumber = textGetPhone.getText();
        Friend temp =  new Friend(name,age, phoneNumber);

        //checks for duplicates
        if (!nameList.contains(getTextName)){
            nameList.add(getTextName);
            testList.add(temp);
            friendList.getItems().add(new Friend(textGetName.getText(), textGetAge.getText(), textGetPhone.getText()));

        }

        //clear text fields after input
        textGetName.clear();
        textGetAge.clear();
        textGetPhone.clear();

    }

    //method to display the selected friends' properties
    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblPhone.setText(temp.getPhoneNumber());
        lblName.setText(temp.name);
        lblAge.setText((temp.getAge()));
        btnDeleteFriend.setDisable(false);

    }

    //method to save friend to friendList
    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = friendList.getItems();
        for (Friend x: myList){
            testList.add(x);
        }
        for (Friend x:myList){
            x.writeToFile();
        }
        friendList.getItems().clear();
        lblPhone.setText("");
        lblName.setText("");
        lblAge.setText("");
        btnSave.setDisable(true);

    }

    //Method to load friend into friends.txt file
    public void loadFriends(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList <Friend> friends = CreateFriend.allFriends("friends.txt");
        for (Friend x: friends){
            friendList.getItems().add(x);
        }
        btnLoad.setDisable(true);
    }
}
