package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetPhone;
    public Button btnDeleteFriend;
    public Label lblName;
    public Label lblAge;
    public Label lblPhone;
    public ListView <Friend> friendList = new ListView<>();

    //method to add a friend to the list
    public void addFriend(ActionEvent actionEvent) {
        String name = textGetName.getText();
        int age = Integer.parseInt(textGetAge.getText());
        int phoneNumber = Integer.parseInt(textGetPhone.getText());
        Friend temp =  new Friend(name,age, phoneNumber);
        friendList.getItems().add(temp);

        //clear text fields after input
        textGetName.clear();
        textGetAge.clear();
        textGetPhone.clear();

    }

    //method to display the selected friends' properties
    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblPhone.setText(Integer.toString(temp.getPhoneNumber()));
        lblName.setText(temp.name);
        lblAge.setText(Integer.toString(temp.getAge()));

        btnDeleteFriend.setDisable(false);

    }

    //method to delete friend
    public void deleteFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(temp);

        //clear the properties labels
        lblAge.setText("");
        lblName.setText("");
        lblPhone.setText("");

    }
}
