package IHM;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;

public class AffichageFenetre implements Runnable 
{
	private ControleDuJEu jeu;
	
	public AffichageFenetre(ControleDuJEu master)
	{
		this.jeu=master;
		
	}
    @Override
    public void run() 
    {
        JFrame fenetre = new JFrame("Mastermind");
        fenetre.setSize(500, 500);
        fenetre.setResizable(false);

        Container global = fenetre.getContentPane();
        
        global.setLayout(new BorderLayout());
       
        ControleurDuCodeDeCorrection panneauCorrection = new PanneauDeCorrection();
        global.add((JPanel) panneauCorrection , BorderLayout.WEST);
        
        ControleDuCodeDeValidation panel = new PanneauSaisieDeCode();
        global.add((JPanel) panel, BorderLayout.CENTER);
        
        global.add(new PanneauDeValidation(panel, panneauCorrection, jeu), BorderLayout.EAST);
        

        fenetre.setVisible(true);
        fenetre.repaint();
    }
    
    
}