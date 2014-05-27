


package IHM;

import java.awt.Color;
import java.util.ArrayList;

public interface ControleDuCodeDeValidation 
{
	public void desactiverLigne(int ligne);
	
	public ArrayList<Integer> renvoieDesCouleurs(int ligne);
	
	public void ActiverLigne(int ligne);
	
	public ArrayList<Color> obtenirListeCouleurBouton();
}
