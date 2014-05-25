package IHM;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PanneauDeValidation extends JPanel
{
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;
	private JButton[] boutonValidation;
	
	public PanneauDeValidation()
	{
		setLayout(new GridLayout(10, 1));
		boutonValidation= new JButton[10];
		for (int indice=0; indice<10; indice++)
		{
			boutonValidation[indice]=new JButton("OK");
			add(this.boutonValidation[indice]);
			if (indice>0)
			{
				boutonValidation[indice].setEnabled(false);
			}
			
			
		}
		
	}
}
