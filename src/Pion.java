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

    /** Creer un pion de la couleur specifiee. */
    public Pion(Couleur c) {
        this.couleur = c;
    }

    public Couleur obtenirCouleur() {
        return this.couleur;
    }

    public void changerCouleur(Couleur coul) {
        this.couleur = coul;
    }
}
