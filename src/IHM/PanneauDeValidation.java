package IHM;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanneauDeValidation extends JPanel implements ControleurBoutonValidation
{
	public BoutonOK[] boutonValidation;
	
	public PanneauDeValidation(ControleDuCodeDeValidation code, ControleurDuCodeDeCorrection correction,ControleDuJEu codeJeu)
	{
		this.setLayout(new GridLayout(10, 1));
		
		this.boutonValidation= new BoutonOK[10];
		for (int indice=0; indice<10; indice++)
		{
			boutonValidation[indice]=new BoutonOK(indice, code, correction,codeJeu, "OK");
			this.add(this.boutonValidation[indice]);
			if (indice>0)
			{
				this.boutonValidation[indice].setEnabled(false);
			}
		}
		for(int indice=0; indice<10; indice++)
		{
			if(indice==9)
				boutonValidation[indice].ajouterValeurBoutonSuiv(null);
			else
				boutonValidation[indice].ajouterValeurBoutonSuiv(boutonValidation[indice+1]);
		}
	}
	
	public void desactiverbouton(int ligne)
	{
		this.boutonValidation[ligne].setEnabled(false);
		if(ligne+1<10)
		{
			this.boutonValidation[ligne].setEnabled(true);
		}
	}
	
	
}