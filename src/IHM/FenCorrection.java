package IHM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

public class FenCorrection 
{
	
	TableauSolution codeSecret;
	JLabel texte;
	
	public FenCorrection(ArrayList<Color> listeCouleur, int tailleGrille, ArrayList<Integer> codeSecret, boolean gagne)
	{
		JFrame fenetreFin = new JFrame("Fin");
				
		JLabel[] codeSolution=new JLabel[tailleGrille];
		this.codeSecret= new TableauSolution(tailleGrille,listeCouleur,codeSecret);
		fenetreFin.setSize(250, 250);
		fenetreFin.setResizable(false);
		fenetreFin.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		fenetreFin.setLayout(new BorderLayout());
		
			
			
			if(gagne)
				{texte = new JLabel("vous avez gagné");}
			else
				{texte = new JLabel("vous avez perdu");}
			
			JSplitPane panneau = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
			panneau.add(this.codeSecret);
			panneau.add(this.texte);
			panneau.setEnabled(false);
			panneau.setBorder(null);
			panneau.setDividerSize(3);
			panneau.setDividerLocation(100);
			fenetreFin.add(panneau);
		

        fenetreFin.repaint();
        fenetreFin.setVisible(true);
	}
}
