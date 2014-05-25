package IHM;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class BoutonChangeCouleur extends JButton implements ActionListener {
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;

    public BoutonChangeCouleur() {
        this.addActionListener(this);
    }

    private void changerCouleur() {
        // XXX À terminer.
        this.setBackground(Color.BLUE);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        changerCouleur();
    }
}
