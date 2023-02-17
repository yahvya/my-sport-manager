package yahaya.configuration;

/**
 * liste des énumérations de configuration
 */
public class Config {
    /**
     * configuration de l'application
     */
    public enum App{
        APPNAME("Ma séance");

        public final String value;

        private App(String value){
            this.value = value;
        }
    };
}
