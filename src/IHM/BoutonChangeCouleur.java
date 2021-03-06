package IHM;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BoutonChangeCouleur extends JButton implements ActionListener
{
	private ArrayList<Color> listeCouleur;
	
	private int numCouleurBouton;
	
	public BoutonChangeCouleur()
	{
		this.numCouleurBouton=0;
		
		this.listeCouleur=new ArrayList<Color>();
		this.listeCouleur.add(Color.GREEN);
		this.listeCouleur.add(Color.RED);
		this.listeCouleur.add(Color.BLUE);
		this.listeCouleur.add(Color.ORANGE);
		this.listeCouleur.add(Color.YELLOW);
		this.listeCouleur.add(Color.WHITE);
		this.listeCouleur.add(Color.BLACK);
		this.listeCouleur.add(Color.DARK_GRAY);
		this.listeCouleur.add(Color.PINK);
		this.listeCouleur.add(Color.CYAN);
		
		this.setBackground(this.listeCouleur.get(numCouleurBouton));
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent event )
	{
		this.numCouleurBouton++;
		if (numCouleurBouton==10)
			{this.setBackground(listeCouleur.get(0));
			this.numCouleurBouton=0;
			}
		this.setBackground(listeCouleur.get(numCouleurBouton));
		
		
	}
	
	public int obtenirNumCouleur()
	{
		return this.numCouleurBouton;
	}
	
	public ArrayList<Color> obtenirListeCouleur()
	{
		return this.listeCouleur;
	}
}
