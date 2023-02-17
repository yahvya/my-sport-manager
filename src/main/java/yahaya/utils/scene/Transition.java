package yahaya.utils.scene;

import javafx.animation.TranslateTransition;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import yahaya.Launcher;
import yahaya.utils.callback.EmptyCallback;

/**
 * gestionnaire de transition entre deux scènes dans la scène principale
 */
public abstract class Transition {

    /**
     * durée de transition
     */
    private static Duration transitionDuration = Duration.millis(400) ;

    /**
     * alias qui va utiliser la fenêtre principale
     */
    public static void between(Scene from,Scene to,EmptyCallback toCallAfter){
        Transition.between(Launcher.getStage(),from,to,toCallAfter);
    }

    /**
     * crée une transition entre les deux scènes dans la fenêtre passé 
     * @param window la fenêtre
     * @param from la scène à retirer
     * @param to la nouvelle scène
     * @param toCallAfter fonction à appeller à la fin de la transition, nullable
     */
    public static void between(Stage window,Scene from,Scene to,EmptyCallback toCallAfter){
        TranslateTransition transition = new TranslateTransition(Transition.transitionDuration,from.getRoot() );

        // animation d'apparition de la page to 
        transition.setOnFinished((unused) -> {
            window.setScene(to);

            transition.setOnFinished(toCallAfter != null ? (unused2) -> toCallAfter.call() : null);

            transition.setNode(to.getRoot() );
            transition.setFromX(to.getWidth() );
            transition.setToX(0);
            transition.playFromStart();
        });

        transition.setToX(from.getWidth() * -1);
        transition.play();
    }
}
