package IHM;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BoutonChangeCouleur extends JButton implements ActionListener
{
	public BoutonChangeCouleur()
	{
		this.addActionListener(this);
	}
	
	public void changerCouleur(ActionListener e)
	{
		this.setBackground(Color.BLUE);
	}
}
