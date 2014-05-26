package IHM;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanneauDeCorrection extends JPanel implements ControleurDuCodeDeCorrection
{
	
	private JLabel[][] pionCorrection;
	
	public PanneauDeCorrection()
	{
		this.setLayout(new GridLayout(10, 5));
		
		this.pionCorrection= new JLabel[10][5];
		for (int indice=0; indice<10; indice++)
		{
			for(int index=0; index<5; index++)
			{
				this.pionCorrection[indice][index]=new JLabel("         ");
				this.add(this.pionCorrection[indice][index]);
				this.pionCorrection[indice][index].setOpaque(true);		
			}
		}

	}
	
	@Override
	public void afficherCodeCorrection(int ligne )
	{
		for(int indice=0; indice<5; indice++)
		{
			this.pionCorrection[ligne][indice].setBackground(Color.BLACK);
		}}
}
