package yahaya.data;

import javafx.application.Platform;
import yahaya.utils.callback.EmptyCallback;

/**
 * class aidant à la gestion des resources de l'application
 */
public class ResourceManager {

    /**
     * charge les données nécéssaires à l'exécution
     * @param toCallAfterLoading action à exécuter à la fin du chargement
     * @param toCallOnFailure action à éxécuter en cas d'échec
     * @return this
     */
    public ResourceManager loadDatas(EmptyCallback toCallAfterLoading,EmptyCallback toCallOnFailure){
        // lancement du thread de chargement des données
        try{
            new Thread(){
                @Override
                public void run(){
                    // données à chargé
                    try{Thread.sleep(2000);}catch(Exception e){}
                    if(toCallAfterLoading != null) Platform.runLater(() -> toCallAfterLoading.call() );
                }
            }.start();
        }
        catch(Exception e){
            if(toCallOnFailure != null) toCallOnFailure.call();
        }

        return this;
    }
}
