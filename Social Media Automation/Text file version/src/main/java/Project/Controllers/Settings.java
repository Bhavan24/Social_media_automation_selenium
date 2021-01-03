package Project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Formatter;

public class Settings {
    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Tooltip tip;

    private static void writeToFile(String email, String password, String fileName) {
        try {
            Formatter formatter = new Formatter("src/main/java/Project/Login_details/" + fileName + ".txt");
            formatter.format("%s %s", email, password);
            formatter.close();
            new Alert(Alert.AlertType.INFORMATION, "Details added successfully!").showAndWait();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void fbSet(ActionEvent event) {

        writeToFile(txtUserName.getText(), txtPassword.getText(), "facebook");

        Stage previousStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    void gitSet(ActionEvent event) {

        writeToFile(txtUserName.getText(), txtPassword.getText(), "github");

        Stage previousStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    void iitSet(ActionEvent event) {

        writeToFile(txtUserName.getText(), txtPassword.getText(), "iit");

        Stage previousStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    void instaSet(ActionEvent event) {

        writeToFile(txtUserName.getText(), txtPassword.getText(), "instagram");

        Stage previousStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    void liSet(ActionEvent event) {

        writeToFile(txtUserName.getText(), txtPassword.getText(), "linkedIN");

        Stage previousStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    void twiSet(ActionEvent event) {

        writeToFile(txtUserName.getText(), txtPassword.getText(), "twitter");

        Stage previousStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        previousStage.close();
    }

    @FXML
    void show(){
        tip.setText(txtPassword.getText());
        tip.isActivated();
    }
}
