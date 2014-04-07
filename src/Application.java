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
			
			
			System.out.println("\n***Choix du niveau***\n-niveau 1 : code de 5 , taper 1\n-niveau 2 : code de 6, taper 2, taper 1\n-niveau 3 : code de 7, taper 3");
			int niveau=choixNiveau.nextInt();
		
			//Demarage:
			Mastermind newGame = new Mastermind(niveau);
			if (newGame.jouer())
				System.out.println("Vous avez gagné !!");
			else
				System.out.println("Vous avez perdu !! (Tetris c'etait bien hein ?)");
			//Fin du menu
	}
}
