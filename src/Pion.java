/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Pion {
    /** Couleur. */
    private Couleur couleur;

    /** Creer un pion de la couleur specifiee. 
     * @param une couleur de type enum couleur*/
    public Pion(Couleur c) {
        this.couleur = c;
    }

    /**Retourne la couleur d'un pion
     * @return couleur*/
    public Couleur obtenirCouleur() {
        return this.couleur;
    }

    /**modifer couleur du pion
     * @param couleur*/
    public void changerCouleur(Couleur coul) {
        this.couleur = coul;
    }
}
