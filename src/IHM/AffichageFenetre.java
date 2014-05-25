package IHM;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Color;
public class AffichageFenetre implements Runnable
{
    private JPanel panneauGauche;
    private JPanel panneauCentre;
    private JPanel panneauDroit;

    @Override
    public void run() {

        JFrame fenetre = new JFrame();
        this.panneauGauche = new PanneauDeCorrection();
        this.panneauCentre = new PanneauSaisieDeCode();
        this.panneauDroit = new PanneauDeValidation();


        fenetre.setTitle("Mastermind");
		fenetre.setSize(500,500);
		
		JSplitPane splitPanerGauche= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		splitPanerGauche.add(panneauGauche);
		splitPanerGauche.add(panneauCentre);
		splitPanerGauche.setEnabled(false);
		splitPanerGauche.setBorder(null);
		splitPanerGauche.setDividerSize(1);
		
		
		JSplitPane splitPanerDroit= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		
		splitPanerDroit.add(splitPanerGauche);
		splitPanerDroit.add(panneauDroit);
		splitPanerDroit.setEnabled(false);
		splitPanerDroit.setBorder(null);
		splitPanerDroit.setDividerSize(1);
		
		splitPanerDroit.setOpaque(true);	
		splitPanerDroit.setBackground(new Color(100,200,100));		
		fenetre.add(splitPanerDroit);

		fenetre.setVisible(true);
		fenetre.repaint();
	}
}
