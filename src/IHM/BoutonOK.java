package IHM;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BoutonOK extends JButton implements ActionListener 
{
	
	private ControleDuCodeDeValidation code;
	private ControleurDuCodeDeCorrection correction;
	private ControleDuJEu mastermindCode;
	private int ligne;
	private BoutonOK boutonSuivant;

	public BoutonOK(int ligne, ControleDuCodeDeValidation code, ControleurDuCodeDeCorrection correction,ControleDuJEu codeJeu , String nom) 
	{
		
		super(nom);
		this.ligne = ligne;
		this.code = code;
		this.correction = correction;
		this.mastermindCode=codeJeu;

		
		this.addActionListener(this);
	}
	
	public void ajouterValeurBoutonSuiv(BoutonOK bouton)
	{
		this.boutonSuivant=bouton;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		ArrayList<Integer> codeCorrection= new ArrayList<Integer>();
		code.desactiverLigne(ligne);
		this.setEnabled(false);
		if((ligne+1<10)&&(this.boutonSuivant!=null))
		{
			code.ActiverLigne(ligne+1);
			this.boutonSuivant.setEnabled(true); 
			ArrayList<Integer> couleurs = code.renvoieDesCouleurs(ligne);
			codeCorrection=this.mastermindCode.testeCodeSecret(couleurs);
			correction.afficherCodeCorrection(ligne, codeCorrection);
			
			if (mastermindCode.codeJuste(codeCorrection))
			{
				FenCorrection fenFinGang�= new FenCorrection(this.code.obtenirListeCouleurBouton(),codeCorrection.size(), this.mastermindCode.obetenirCodeSecret(), true);
			}
		}
		if(this.boutonSuivant==null)
		{
			ArrayList<Integer> couleurs = code.renvoieDesCouleurs(ligne);
			codeCorrection=this.mastermindCode.testeCodeSecret(couleurs);
			if (!mastermindCode.codeJuste(codeCorrection)) 
				{FenCorrection fenFinPerdu= new FenCorrection(this.code.obtenirListeCouleurBouton(),codeCorrection.size(), this.mastermindCode.obetenirCodeSecret(), false);}
			else
				{FenCorrection fenFin= new FenCorrection(this.code.obtenirListeCouleurBouton(),codeCorrection.size(), this.mastermindCode.obetenirCodeSecret(),true);}
				
		}
	}
}
