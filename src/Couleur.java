/**
 * enumeration Couleur
 *
 * @author Desmet/Fernandes
 *
 */
public enum Couleur {
    VERT("VERT "),
    ROUGE("ROUGE "),
    BLEU("BLEU "),
    ORANGE("ORANGE "),
    JAUNE("JAUNE "),
    BLANC("BLANC "),
    NOIR("NOIR "),
    VIOLET("VIOLET "),
    ROSE("ROSE "),
    MARRON("MARRON ");

    /** Representation texte de la couleur*/
    private final String representation;
    
    /**
     * Constructeur d'une couleur
     * @param representation
     */
    Couleur(String representation) 
    {
        this.representation = representation;
    }

    /** affiche la representation texte de la couleur lorsque l'on demande d'afficher la couleur*/
    @Override
    public String toString() 
    {
        return representation;
    }
    
    

}
