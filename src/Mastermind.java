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
	 public static final int NOMBRE_DE_TOURS = 10;

	 private static final int LONGUEUR_DU_CODE_PAR_DEFAUT = 4;
	 
	 public static int longueurDuCode;

	 
	 private final Code codeSecret;
	 private Joueur leJoueur;
	
	 public Mastermind(int niveau)
	 {
		 Scanner nomDuJoueur = new Scanner(System.in);
		 
		 longueurDuCode = LONGUEUR_DU_CODE_PAR_DEFAUT + niveau;
		 codeSecret= new Code(longueurDuCode);
		 
		 System.out.println("Choisir nom du joueur");
		 String nomJoueur = nomDuJoueur.nextLine();
		 leJoueur= new Joueur("nomJoueur");
	 }
	 


	public boolean jouer() 
	{
		int nombreDeTours = 0;
		while (nombreDeTours<NOMBRE_DE_TOURS)
		{
			
		//demander code joueur et verifier code
			Code leCodeDuJoueur= leJoueur.creeCodeJoueur();
			System.out.println( "**********************************************************************\n");
			System.out.println( leCodeDuJoueur );
			Code codeCorrectif = leCodeDuJoueur.testMatch(codeSecret);
			System.out.println(codeCorrectif);
			System.out.println( "**********************************************************************\n"); 
			
			if (codeCorrectif.analyseCodeCorrection())
			{
				return true;
			}
			nombreDeTours++;
			
		}
		return false;
	}
}
