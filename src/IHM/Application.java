package IHM;
import javax.swing.SwingUtilities;

/**
 * Controleur de l'application
 *
 * @author Desmet/Fernandes
 *
 */
public class Application {
    /** main du programme */
	public static void main(String[] args) 
	{ 
			SwingUtilities.invokeLater(new AffichageFenetre());
			/*Vue vue=new Vue();
			int niveauChoisi=vue.choixNiveau();
			String nom=vue.choisirJoueur();
			Mastermind newGame = new Mastermind(niveauChoisi,vue,nom);
			vue.gagner(newGame.jouer(vue));*/
	}
}
