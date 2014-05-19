package IHM;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanneauSaisieDeCode extends JPanel
{
	private JButton[][] pionSaisie;
	
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
				pionSaisie[indice][index].ActionListener()
				if (indice>0)
				{
					this.pionSaisie[indice][index].setEnabled(false);
				}
				
			}
			
			
			
		}
	}
}
