import IHM.AffichageFenetre;

import javax.swing.SwingUtilities;

/**
 * Controleur de l'application
 *
 * @author Desmet/Fernandes
 * @version 3.0.0
 */
public class Application {
    /** main du programme */
    public static void main(String[] args) {
        if ((args.length == 1) && "--gui".equals(args[0])) { /* NON-NLS */
            SwingUtilities.invokeLater(new AffichageFenetre());
        }
        else {
            Vue vue = new Vue();
            int niveauChoisi = vue.choixNiveau();
            String nom = vue.choisirJoueur();
            Mastermind newGame = new Mastermind(niveauChoisi, vue, nom);
            vue.gagner(newGame.jouer(vue));
        }
    }
}
