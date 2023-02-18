package yahaya.workout.workout;

import java.net.URI;
import java.util.ArrayList;

import yahaya.utils.interfaces.Savabale;
/**
 * représente une séance 
 */
public class Workout implements Savabale{
    /**
     * liste des exercices composant la séance
     */
    private ArrayList<ExerciseSet> exercises;

    /**
     * nom de la séance
     */
    private String workoutName;

    @Override
    public boolean saveIn(URI dst) {
        
        return false;
    }

    public String getWorkoutName(){
        return this.workoutName;
    }

    public Workout setWorkoutName(String name){
        this.workoutName = name;

        return this;
    }

    public ArrayList<ExerciseSet> getExercices(){
        return this.exercises;
    }
}
