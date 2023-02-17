package yahaya.workout.workout;

import java.net.URI;
import java.time.Duration;

import javafx.scene.media.MediaPlayer;
import yahaya.utils.interfaces.Playable;
import yahaya.utils.interfaces.Savabale;

/**
 * représente un exercice
 */
public class ExerciseSet implements Savabale,Playable{
    /**
     * le nom de l'exercice
     */
    private String exerciseName;
    /**
     *  la description de l'exercice 
     */
    private String exerciseDescription;
    /**
     * la durée de l'exercice en secondes
     * @attention peut être null si nombre de répétition spécifié
     */
    private Duration exerciseDuration;
    /**
     * la video de demonstration de l'exercice
     * @attention la video peut être null
    */
    private MediaPlayer exercisePlayer;
    /**
     * le nombre de répétition
     * @attention peut être null si durée d'exercice spécifié
     */
    private int exerciceCountOfRep;

    /**
     * le nombre de tentative restante et nombre de répétition de l'exercice
     */
    protected int countOfPlayTime;

    public ExerciseSet(int countOfPlayTime){
        this.countOfPlayTime = countOfPlayTime;
    }

    @Override
    public boolean saveIn(URI dst) {
        
        return false;
    }

    @Override
    public int getCountOfPlayTime() {
        return this.countOfPlayTime;
    }

    public ExerciseSet setCountOfPlayTime(int countOfPlayTime){
        this.countOfPlayTime = countOfPlayTime;

        return this;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public ExerciseSet setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;

        return this;
    }
    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public ExerciseSet setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;

        return this;
    }

    public Duration getExerciseDuration() {
        return exerciseDuration;
    }

    public ExerciseSet setExerciseDuration(Duration exerciseDuration) {
        this.exerciseDuration = exerciseDuration;

        return this;
    }

    public MediaPlayer getExercisePlayer() {
        return exercisePlayer;
    }

    public ExerciseSet setExercisePlayer(MediaPlayer exercisePlayer) {
        this.exercisePlayer = exercisePlayer;

        return this;
    }

    public int getExerciceCountOfRep() {
        return this.exerciceCountOfRep;
    }

    public ExerciseSet setExerciceCountOfRep(int exerciceCountOfRep) {
        this.exerciceCountOfRep = exerciceCountOfRep;

        return this;
    }
}
