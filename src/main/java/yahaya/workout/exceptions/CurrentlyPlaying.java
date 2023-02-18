package yahaya.workout.exceptions;

import yahaya.workout.utils.WorkoutPlayer;

/**
 * représente un lecteur déjà utilisé pour une séance entrain d'être jouée
 */
public class CurrentlyPlaying extends Exception{
    private WorkoutPlayer workoutPlayer;

    public CurrentlyPlaying(WorkoutPlayer workoutPlayer){
        super("A workout is currently played by this workout player");

        this.workoutPlayer = workoutPlayer;
    }

    public WorkoutPlayer getWorkoutPlayer(){
        return this.workoutPlayer;
    }
}
