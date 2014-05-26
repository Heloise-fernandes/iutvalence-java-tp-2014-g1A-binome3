package IHM;
import java.awt.Color;
import java.awt.GridLayout;

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
	
	@Override
	public int[] renvoieDesCouleurs(int ligne)
	{
		int[] listeCouleur= new int[5];
		for(int indice=0;indice<5;indice++)
		{
			listeCouleur[indice]=this.pionSaisie[ligne][indice].obtenirNumCouleur();
		}
		return listeCouleur;
	}
	
	
}
