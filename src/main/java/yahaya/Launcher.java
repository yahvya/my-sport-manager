package yahaya;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import yahaya.configuration.Config;
import yahaya.controllers.HomeController;
import yahaya.controllers.LoadingController;
import yahaya.data.ResourceManager;
import yahaya.utils.scene.Transition;
import yahaya.utils.util.FXMLSceneManager;

public class Launcher extends Application{
    /**
     * map des scene liés aux controlleurs, clés références par le chemin de leur fxml
     */
    public static HashMap<String,FXMLSceneManager> controllersMap = new HashMap<String,FXMLSceneManager>();

    /**
     * fenêtre principale de l'application
     */
    private static Stage stage;

    /**
     * gestionnaire de resources de l'application
     */
    private static ResourceManager resourcesManager;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Launcher.stage = primaryStage;
        Launcher.resourcesManager = new ResourceManager();

        Scene scene = Launcher.loadFXML(LoadingController.getFXMLPath(),false).getScene();

        primaryStage.setScene(scene);
        primaryStage.setTitle(Config.App.APPNAME.value);
        primaryStage.getIcons().add(new Image(this.getClass().getResource("/images/favicon.png").toString() ) );
        primaryStage.centerOnScreen();
        primaryStage.show();

        // lancement du chargement des données avec affichage de la page d'accueil après chargement

        Launcher.resourcesManager.loadDatas(() -> Transition.between(scene,Launcher.loadFXML(HomeController.getFXMLPath(),false).getScene(), null),null);
    }

    /**
     * récupère le gestionnaire du fxml passé ou en crée si premier appel
     * @param fxmlPath chemin du fichier fxml
     * @param reload défini si le gestionnaire doit être rechargé ou non
     * @return le gestionnaire
     */
    public static FXMLSceneManager loadFXML(String fxmlPath,boolean reload){
        FXMLSceneManager loader = Launcher.controllersMap.get(fxmlPath);

        if(loader == null || reload == true){
            try{
                loader = new FXMLSceneManager(fxmlPath);

                Launcher.controllersMap.put(fxmlPath,loader);
            }
            catch(Exception e){}
        }

        return loader;
    }

    public static Stage getStage(){
        return Launcher.stage;
    }

    public static ResourceManager getResourceManager(){
        return Launcher.resourcesManager;
    }
}
