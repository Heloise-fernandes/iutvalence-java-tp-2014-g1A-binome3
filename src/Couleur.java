/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
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

    /** TODO. */
    private final String representation;

    Couleur(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }
}
