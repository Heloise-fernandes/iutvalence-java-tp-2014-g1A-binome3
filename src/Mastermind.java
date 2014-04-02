/* TODO package. */
import java.util.Scanner;

/**
 * TODO.
 *
 * @author TODO.
 * @version TODO.
 */
/* Il faut reflechir a ce qui constitue une partie de mastermind (atribut methode)
 * Il faut aussi penser à une classe joueur: Comment intervient un joueur dans la partie?*/
public class Mastermind 
{
	 public static final int NOMBRE_DE_TOURS = 15;

	 private static final int LONGUEUR_DU_CODE_PAR_DEFAUT = 5;
	

	 
	 private final Code codeSecret;
	 private Joueur leJoueur;
	
	 public Mastermind()
	 {
		 codeSecret= new Code(LONGUEUR_DU_CODE_PAR_DEFAUT);
		 leJoueur= new Joueur("bob");
	 }
	 


	public boolean jouer() 
	{
		int nombreDeTours = 0;
		while (nombreDeTours<NOMBRE_DE_TOURS)
		{
			
		//demander code joueur et verifier code
			System.out.println(leJoueur.creeCodeJoueur());
			Code codeCorrectif = leJoueur.creeCodeJoueur().testMatch(codeSecret, LONGUEUR_DU_CODE_PAR_DEFAUT);
			
			if (codeCorrectif.analyseCodeCorrection())
			{
				return true;
			}
			
	
		}
		return false;
	}
}
