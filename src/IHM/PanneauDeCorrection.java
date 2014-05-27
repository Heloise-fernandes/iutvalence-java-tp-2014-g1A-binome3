package IHM;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

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
	public void afficherCodeCorrection(int ligne, ArrayList<Integer> code )
	{
		for(int indice=0; indice<5; indice++)
		{
			if(code.get(indice)==0)
				this.pionCorrection[ligne][indice].setBackground(Color.BLACK);
			if(code.get(indice)==1)
				this.pionCorrection[ligne][indice].setBackground(Color.GREEN);
			if(code.get(indice)==2)
				this.pionCorrection[ligne][indice].setBackground(Color.RED);
			
		}}
}
