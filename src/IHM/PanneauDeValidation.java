package IHM;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanneauDeValidation extends JPanel 
{
	public JButton[] boutonValidation;
	
	public PanneauDeValidation(ControleDuCodeDeValidation code, ControleurDuCodeDeCorrection correction)
	{
		this.setLayout(new GridLayout(10, 1));
		this.boutonValidation= new JButton[10];
		for (int indice=0; indice<10; indice++)
		{
			boutonValidation[indice]=new BoutonOK(indice, code, correction);
			this.add(this.boutonValidation[indice]);
			if (indice>0)
			{
				this.boutonValidation[indice].setEnabled(false);
			}
		}	
	}
	
	
}