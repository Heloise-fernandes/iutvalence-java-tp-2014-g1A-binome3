package IHM;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TableauSolution extends JPanel
{
	private JLabel[] codeSolution;
	
	public TableauSolution(int tailleGrille, ArrayList<Color> listeCouleur, ArrayList<Integer> codeSecret)
	{
		
		this.setLayout(new GridLayout(1, tailleGrille));
		
		this.codeSolution= new JLabel[tailleGrille];
		
        
        for(int indice=0; indice<tailleGrille; indice++)
        {
        	this.codeSolution[indice]=new JLabel(" ");
        	this.add(this.codeSolution[indice]);
        	
        	this.codeSolution[indice].setBackground(listeCouleur.get(codeSecret.get(indice)));
        	this.codeSolution[indice].setOpaque(true);
        	
        	
        }
	}
}
