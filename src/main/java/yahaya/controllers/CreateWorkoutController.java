package yahaya.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import yahaya.Launcher;
import yahaya.utils.scene.Transition;

public class CreateWorkoutController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="goBackButton"
    private Button goBackButton; // Value injected by FXMLLoader

    @FXML // fx:id="userInput"
    private TextField userInput; // Value injected by FXMLLoader

    @FXML
    void goBackToHome(MouseEvent event){
        Stage currentStage = Launcher.getStage();

        Transition.between(currentStage,currentStage.getScene(),Launcher.loadFXML(HomeController.getFXMLPath(),false).getScene(),null );
    }

    @FXML
    void showCreationTutorial(MouseEvent event) {

    }

    @FXML
    void showFormNextElement(MouseEvent event) {

    }

    @FXML
    void showFormPreviousElement(MouseEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert goBackButton != null : "fx:id=\"goBackButton\" was not injected: check your FXML file 'create-workout.fxml'.";
        assert userInput != null : "fx:id=\"userInput\" was not injected: check your FXML file 'create-workout.fxml'.";

    }

    public static String getFXMLPath() {
        return "create-workout-page.fxml";
    }
}
