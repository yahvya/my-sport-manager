package yahaya;

import javafx.application.Application;

/**
 * classe principale
 */
public class App
{
    public static void main( String[] args )
    {
        try{
            Application.launch(Launcher.class,args);
        }
        catch(Exception e){}
    }
}
