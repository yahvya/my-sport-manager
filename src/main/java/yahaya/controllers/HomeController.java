package yahaya.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import yahaya.Launcher;
import yahaya.utils.scene.Transition;

public class HomeController{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }

    @FXML
    void exitApplication(MouseEvent event) {
        Launcher.getStage().close();
    }

     @FXML
    void createWorkout(MouseEvent event) {
        Stage currentStage = Launcher.getStage();
        
        Transition.between(currentStage,currentStage.getScene(),Launcher.loadFXML(CreateWorkoutController.getFXMLPath(),false).getScene(),null);
    }

    @FXML
    void showCreationTutorial(MouseEvent event) {

    }

    @FXML
    void listWorkouts(MouseEvent event) {

    }

    public static String getFXMLPath() {
        return "home-page.fxml";
    }
}
