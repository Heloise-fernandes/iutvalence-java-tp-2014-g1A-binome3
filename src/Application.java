import java.util.Scanner;

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
			Scanner choixNiveau = new Scanner(System.in);
			System.out.println("***Menu***");
			//System.out.println("Choisissez le nombre de joueur (1 ou 2) :");
			//recuperation de la reponse
			System.out.println("\n***Choix du niveau***\n-niveau 1 : code de 5\n-niveau 2 : code de 8");
			int niveau=choixNiveau.nextInt();
			//Demarage:
			Mastermind newGame = new Mastermind();
			if (newGame.niveau(niveau))
				System.out.println("Vous avez gagné !!");
			else
				System.out.println("Vous avez perdu !! (Tetris c'etait bien hein ?)");
			//Fin du menu
	}
}
