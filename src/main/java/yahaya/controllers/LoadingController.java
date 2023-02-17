package yahaya.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import yahaya.Launcher;

/**
 * controlleur de la page de chargement
 */
public class LoadingController{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="loadingCircle"
    private Circle loadingCircle; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert loadingCircle != null : "fx:id=\"loadingCircle\" was not injected: check your FXML file 'loading-page.fxml'.";

        RotateTransition rotateAnimation = new RotateTransition(Duration.INDEFINITE,this.loadingCircle);
        
        rotateAnimation.setDuration(Duration.millis(500) );
        rotateAnimation.setCycleCount(Animation.INDEFINITE);
        rotateAnimation.setByAngle(360);
        rotateAnimation.play();

        Stage window = Launcher.getStage();

        window.initStyle(StageStyle.UNDECORATED);
        window.setResizable(false);
    }

    public static String getFXMLPath() {
        return "loading-page.fxml";
    }
}
