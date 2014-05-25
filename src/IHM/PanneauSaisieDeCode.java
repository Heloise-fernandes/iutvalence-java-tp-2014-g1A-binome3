package IHM;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PanneauSaisieDeCode extends JPanel {
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;
    private final JButton[][] pionSaisie;

    public PanneauSaisieDeCode() {
        setLayout(new GridLayout(10, 5));
        pionSaisie = new BoutonChangeCouleur[10][5];

        for (int indice = 0; indice < 10; indice++) {
            for (int index = 0; index < 5; index++) {
                pionSaisie[indice][index] = new BoutonChangeCouleur();
                add(pionSaisie[indice][index]);
                if (indice > 0) {
                    pionSaisie[indice][index].setEnabled(false);
                }
            }
        }
    }
}
