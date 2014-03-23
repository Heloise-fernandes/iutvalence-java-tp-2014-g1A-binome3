/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Application {
    /** TODO. */
	public static void main(String[] args) 
	{ 
		boolean win;
			//System.out.println("***Menu***");
			//System.out.println("Choisissez le nombre de joueur (1 ou 2) :");
			//recuperation de la reponse
			//Affichage des differents niveaux
			//Choix du niveau
			//Demarage:
			Mastermind newGame = new Mastermind();
			/* TODO Pourquoi ne pas tester directement le resultat de newGame.niveau() plutôt que de passer par une variable. */
            win=newGame.niveau();
			if (win)
                /* TODO Belle conjugaison ;-) */
				System.out.println("Vous avez gagner !!");
			else
				System.out.println("Vous avez perdu !! (Tetris c'etait bien hein ?)");
			//Fin du menu
	}
}
