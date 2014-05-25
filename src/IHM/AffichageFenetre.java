package IHM;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;

public class AffichageFenetre implements Runnable {
    @Override
    public void run() {
        JFrame fenetre = new JFrame("Mastermind");
        fenetre.setSize(500, 500);
        fenetre.setResizable(false);

        Container global = fenetre.getContentPane();
        global.setLayout(new BorderLayout());
        global.add(new PanneauDeCorrection(), BorderLayout.WEST);
        global.add(new PanneauDeValidation(), BorderLayout.EAST);
        global.add(new PanneauSaisieDeCode(), BorderLayout.CENTER);

        fenetre.setVisible(true);
        fenetre.repaint();
    }
}
