package yahaya.utils.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * gestionnaire fxml de l'application
 */
public class FXMLSceneManager {
    private Scene scene;

    private FXMLLoader loader;

    public FXMLSceneManager(String path) throws Exception{
        this.loader = new FXMLLoader(this.getClass().getResource("/fxml/" + path) );
        this.loader.load();
        this.scene = new Scene((Parent) this.loader.getRoot() );
    }

    public Scene getScene(){
        return this.scene;
    }

    public Object getController(){
        return this.loader.getController();
    }
}
