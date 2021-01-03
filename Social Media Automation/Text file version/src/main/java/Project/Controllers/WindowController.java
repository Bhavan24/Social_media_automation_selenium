package Project.Controllers;

import Project.SeleniumClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WindowController {

    @FXML
    void fbClick() {
        try {
            String username = null;
            String password = null;
            Scanner scanner = new Scanner(new File("src/main/java/Project/Login_details/facebook.txt"));
            while (scanner.hasNext()) {
                username = scanner.next();
                password = scanner.next();
            }
            scanner.close();
            SeleniumClass.facebook(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void gitClick() {
        try {
            String username = null;
            String password = null;
            Scanner scanner = new Scanner(new File("src/main/java/Project/Login_details/github.txt"));
            while (scanner.hasNext()) {
                username = scanner.next();
                password = scanner.next();
            }
            scanner.close();
            SeleniumClass.github(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void iitClick() {
        try {
            String username = null;
            String password = null;
            Scanner scanner = new Scanner(new File("src/main/java/Project/Login_details/iit.txt"));
            while (scanner.hasNext()) {
                username = scanner.next();
                password = scanner.next();
            }
            scanner.close();
            SeleniumClass.iit(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void instaClick() {
        try {
            String username = null;
            String password = null;
            Scanner scanner = new Scanner(new File("src/main/java/Project/Login_details/instagram.txt"));
            while (scanner.hasNext()) {
                username = scanner.next();
                password = scanner.next();
            }
            scanner.close();
            SeleniumClass.instagram(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void liClick() {
        try {
            String username = null;
            String password = null;
            Scanner scanner = new Scanner(new File("src/main/java/Project/Login_details/linkedIN.txt"));
            while (scanner.hasNext()) {
                username = scanner.next();
                password = scanner.next();
            }
            scanner.close();
            SeleniumClass.linkedIn(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void twiClick() {
        try {
            String username = null;
            String password = null;
            Scanner scanner = new Scanner(new File("src/main/java/Project/Login_details/twitter.txt"));
            while (scanner.hasNext()) {
                username = scanner.next();
                password = scanner.next();
            }
            scanner.close();
            SeleniumClass.twitter(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void settings() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/settings.fxml"));
        Stage newStage = new Stage();
        newStage.setTitle("Add Login details");
        newStage.initStyle(StageStyle.UTILITY);
        newStage.setScene(new Scene(root, 600, 300));
        newStage.show();
    }
}
