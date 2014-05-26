package IHM;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BoutonOK extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	private ControleDuCodeDeValidation code;
	private ControleurDuCodeDeCorrection correction;
	private int ligne;

	public BoutonOK(int ligne, ControleDuCodeDeValidation code, ControleurDuCodeDeCorrection correction) {
		this.ligne = ligne;
		this.code = code;
		this.correction = correction;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		code.desactiverLigne(ligne);
		int[] couleurs = code.renvoieDesCouleurs(ligne);
		
	}
}
