package IHM;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanneauSaisieDeCode extends JPanel implements ControleDuCodeDeValidation
{
	public BoutonChangeCouleur[][] pionSaisie;
	
	public PanneauSaisieDeCode()
	{
		this.setLayout(new GridLayout(10, 5));
		this.pionSaisie= new BoutonChangeCouleur[10][5];
		
		for (int indice=0; indice<10; indice++)
		{
			for(int index=0; index<5; index++)
			{
				pionSaisie[indice][index]=new BoutonChangeCouleur();
				this.add(this.pionSaisie[indice][index]);
				if (indice>0)
				{
					this.pionSaisie[indice][index].setEnabled(false);
				}
			}
		}
	}
	
	@Override
	public void desactiverLigne(int ligne)
	{
		for(int indice=0;indice<5;indice++)
		{
			this.pionSaisie[ligne][indice].setEnabled(false);
		}
	}
	
	public ArrayList<Color> obtenirListeCouleurBouton()
	{
		return this.pionSaisie[0][0].obtenirListeCouleur();
	}
	@Override
	public ArrayList<Integer> renvoieDesCouleurs(int ligne)
	{
		ArrayList<Integer> listeCouleur= new ArrayList<Integer>();
		for(int indice=0;indice<5;indice++)
		{
			listeCouleur.add(indice,this.pionSaisie[ligne][indice].obtenirNumCouleur());
		}
		return listeCouleur;
	}
	
	public void ActiverLigne(int ligne)
	{
		for(int indice=0;indice<5;indice++)
		{
			this.pionSaisie[ligne][indice].setEnabled(true);
		}
	}
}
