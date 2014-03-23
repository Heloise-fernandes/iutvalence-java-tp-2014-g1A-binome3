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

    /** Créer un pion de la couleur spécifiée. */
    public Pion(Couleur c) {
        this.couleur = c;
    }

    /* TODO Eviter le franglais. */
    public Couleur getCouleur() {
        return this.couleur;
    }

    public void changerCouleur(Couleur coul) {
        this.couleur = coul;
    }
}
