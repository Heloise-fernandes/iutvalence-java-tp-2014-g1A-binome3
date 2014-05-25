package IHM;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PanneauDeCorrection extends JPanel {
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;
    private JLabel[][] pionCorrection;

    public PanneauDeCorrection() {
        this.setLayout(new GridLayout(10, 5));
        this.pionCorrection = new JLabel[10][5];

        for (int indice = 0; indice < 10; indice++) {
            for (int index = 0; index < 5; index++) {
                this.pionCorrection[indice][index] = new JLabel("         ");
                this.add(this.pionCorrection[indice][index]);
                this.pionCorrection[indice][index].setOpaque(true);
            }
        }
    }
}
