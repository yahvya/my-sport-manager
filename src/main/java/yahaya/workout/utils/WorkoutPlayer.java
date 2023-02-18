package yahaya.workout.utils;

import yahaya.utils.callback.EmptyCallback;
import yahaya.workout.exceptions.CurrentlyPlaying;
import yahaya.workout.workout.Workout;

/**
 * lecteur de séance
 */
public class WorkoutPlayer {

    /**
     * la séance à jouer par le lecteur
     */
    private Workout workoutToPlay;

    /**
     * désigne si la séance est entrain d'être joué
     */
    private boolean isPlaying;

    public WorkoutPlayer(){
        this(null);
    }

    public WorkoutPlayer(Workout workoutToPlay){
        this.workoutToPlay = workoutToPlay;    
        this.isPlaying = false;        
    }
    
    /**
     * 
     * @param toDoOnEnd l'action à éxécuter à la fin de la lecture, peut être null
     * @return this
     * @throws NullPointerException si la séance lié est null
     */
    public WorkoutPlayer startPlayer(EmptyCallback toDoOnEnd) throws NullPointerException{
        if(this.workoutToPlay == null) throw new NullPointerException("Any workout is currently linked with the player");

        this.isPlaying = true;

        return this;
    }

    /**
     * stoppe la lecture de la séance en cours
     * @return this
     */
    public WorkoutPlayer stopPlayer(){
        this.isPlaying = false;

        return this;
    }

    /**
     * 
     * @throws CurrentlyPlaying si la séance est actuellement en cours de lecture
     */
    public WorkoutPlayer setWorkoutToPlay(Workout workoutToPlay) throws CurrentlyPlaying{
        if(this.isPlaying) throw new CurrentlyPlaying(this);

        return this;
    }
}
