package yahaya.utils.interfaces;

import java.io.Serializable;
import java.net.URI;
/**
 * cette interface représente tout objet pouvant être sauvegardé
 */
public interface Savabale extends Serializable{

    /**
     * crée un fichier contenant l'objet
     * @param dst le chemin de destination du fichier
     * @return si la sauvegarde a réussi
     */
    public boolean saveIn(URI dst);
}
