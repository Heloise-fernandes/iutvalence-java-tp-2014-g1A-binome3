import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
public class AffichageFenetre implements Runnable
{
	@Override
	public void run()
	{
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Mastermind");
		fenetre.setSize(500,500);
		JTable correction = new JTable(10,5);
		fenetre.add(correction,BorderLayout.LINE_START);
		JTable codeTest = new JTable(10,5);
		fenetre.add(codeTest,BorderLayout.CENTER);
		JTable confirmation = new JTable(10,1);
		fenetre.add(confirmation,BorderLayout.LINE_END);
		for(int i=0; i<=confirmation.getRowCount(); i++)
		{
			JButton boutonOK = new JButton();
			confirmation.
		}
		
		
		fenetre.setVisible(true);
	}
}
