/**
 * objet mastermind
 *
 * @author Desmet/Fernandes
 * 
 */
public class Mastermind 
{
	 public static final int NOMBRE_DE_TOURS = 10;

	 private static final int LONGUEUR_DU_CODE_PAR_DEFAUT = 4;
	 
	 public static int longueurDuCode;

	 
	 private final Code codeSecret;
	 private Joueur leJoueur;
	
	 /**
	  * Constructeur
	  *
	  * @author Desmet/Fernandes
	  * @param un entier qui correspond au niveau, une vue et un nom pour le joueur
	  */
	 public Mastermind(int niveau, Vue vue, String nom)
	 {
		 longueurDuCode = LONGUEUR_DU_CODE_PAR_DEFAUT + niveau;
		 codeSecret= new Code(longueurDuCode);
		 leJoueur=new Joueur(nom);
	 }
	 


	 /**
	  * Gestionnaire d'une partie de mastermind
	  *
	  * @author Desmet/Fernandes
	  * @param une vue
	  * @return boolean
	  * 
	  */
	 public boolean jouer(Vue vue) 
	{
		int nombreDeTours = 0;
		while (nombreDeTours<NOMBRE_DE_TOURS)
		{
			
		//demander code joueur et verifier code
			Code leCodeDuJoueur= leJoueur.creeCodeJoueur(vue);
			vue.afficherCode(leCodeDuJoueur);
			Code codeCorrectif = leCodeDuJoueur.testMatch(codeSecret);
			vue.afficherCodeCorrection(codeCorrectif);
			
			if (codeCorrectif.analyseCodeCorrection())
			{
				return true;
			}
			nombreDeTours++;
			
		}
		return false;
	}
}
