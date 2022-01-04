package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button btnFirstRoll;
    public Label lblFirstRoll;
    public Button btnHigher;
    public Button btnLower;
    public Button btnSecondRoll;
    public Label lblSecondRoll;
    public Label lblOutcome;
    public Label lblTotalPoints;
    public Button btnPlayAgain;
    public Label lblChoice;
    public int points = 0;
    public Button btnResults;
    public int rollOne;
    public int rollTwo;

    public Integer addPoints() {
        lblTotalPoints.setText(Integer.toString(points++));
        return points;
    }
    public Integer subtractPoints() {
        lblTotalPoints.setText(Integer.toString(points--));
        return points;
    }

    public void firstRoll(ActionEvent actionEvent) {
        lblFirstRoll.setText(Double.toString((int) (Math.random() * (7 - 1) + 1)));
        btnFirstRoll.setDisable(true);
        btnHigher.setDisable(false);
        btnLower.setDisable(false);
    }

    public void higher(ActionEvent actionEvent) {
        lblChoice.setText("Higher");
        btnLower.setDisable(true);
        btnHigher.setDisable(true);
        btnHigher.isDisabled();
        btnSecondRoll.setDisable(false);
    }

    public void lower(ActionEvent actionEvent) {
        lblChoice.setText("Lower");
        btnLower.setDisable(true);
        btnHigher.setDisable(true);
        btnLower.isDisabled();
        btnSecondRoll.setDisable(false);
    }

    public void secondRoll(ActionEvent actionEvent) {
        lblSecondRoll.setText(Double.toString((int) (Math.random() * (7 - 1) + 1)));

        btnSecondRoll.setDisable(true);
        btnResults.setDisable(false);

    }

    public void results(ActionEvent actionEvent) {

        if ((btnHigher.isDisabled()) && (rollTwo > rollOne)) {
            lblTotalPoints.setText(addPoints().toString());
            lblOutcome.setText("Win");
        } else if ((btnHigher.isDisabled()) && (rollTwo <= rollOne)) {
            lblTotalPoints.setText(subtractPoints().toString());
            lblOutcome.setText("Lose");
        } else if ((btnLower.isDisabled()) && (rollTwo < rollOne)) {
            lblTotalPoints.setText(addPoints().toString());
            lblOutcome.setText("Win");
        } else if ((btnLower.isDisabled()) && (rollTwo >= rollOne)) {
            lblTotalPoints.setText(subtractPoints().toString());
            lblOutcome.setText("Lose");
        }

        btnResults.setDisable(true);
        btnPlayAgain.setDisable(false);
    }

    public void playAgain(ActionEvent actionEvent) {
        lblFirstRoll.setText("0");
        lblSecondRoll.setText("0");
        lblChoice.setText("");
        lblOutcome.setText("");

        btnFirstRoll.setDisable(false);
        btnPlayAgain.setDisable(true);
    }

}
