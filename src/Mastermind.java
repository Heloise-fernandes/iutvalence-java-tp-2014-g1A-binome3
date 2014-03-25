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

	private static final int LONGUEUR_DU_CODE_PAR_DEFAUT = 4;
	
	 private int longueurDuCode;
	 
	 private final Code codeADeviner;
	
	 public Mastermind()
	 {
		 this.longueurDuCode = LONGUEUR_DU_CODE_PAR_DEFAUT;
	 }
	 
	 public Mastermind(int longueurCode)
	 {
		 this.longueurDuCode = longueurCode;
	 }
	

	/**Methode qui gere une partie
	 * @param int
	 * @return boolean */
	public boolean niveau(int niveau)
	{
        Scanner sc = new Scanner(System.in);
        int nombreDeTours = 0;
        int nombreDePionsModifie = 0;
        int nombreDeVert = 0;
        int indiceDeCorrection = 0;
        if(niveau ==1)
        	longueurCode=5;
        else
        	longueurCode=8;
        Code leCodeSecret = new Code(longueurCode, true);
        while (nombreDeTours<NOMBRE_DE_TOURS)
		{
			Code monNouveauCode= new Code(longueurCode, false);
			nombreDePionsModifie=0;
			while (nombreDePionsModifie<longueurCode)
			{
				System.out.println("\n0=Vert\t 1=Rouge\t 2=Bleu\t 3=Orange\t 4=Jaune\t 5=Blanc\t 6=Noir\t 7=Violet\t 8=Rose\t 9=Marron\t");
				System.out.println("Choisir une couleur a mettre en position "+(nombreDePionsModifie+1)+" :");
                int x = sc.nextInt();
                if(x>9 || x<0)
				{
					System.out.println("Vous etes un boulet, retournez jouer a Tetris.");
				}
				else
				{
                    /** TODO Ce genre de ligne fout la trouille ! Repensez avec des mÃ©thodes, etcâ€¦ */
				    monNouveauCode.pions[nombreDePionsModifie].changerCouleur(Couleur.values()[x]);
				    nombreDePionsModifie++;
				}
			}
			System.out.println(monNouveauCode);

			//On regarde la validiter du code et on creer le code correction
            Code codeValidation = monNouveauCode.testMatch(leCodeSecret,longueurCode);
            System.out.println(codeValidation);
            /* TODO Algorithme general discutable et Ã  discuter en TP. */
            indiceDeCorrection = 0;
            nombreDeVert=0;
            while(indiceDeCorrection<longueurCode)
			{
				if(codeValidation.pions[indiceDeCorrection].obtenirCouleur().equals(Couleur.VERT))
					nombreDeVert++;
				indiceDeCorrection++;
			}
			if(nombreDeVert==longueurCode)
			{
				System.out.println(leCodeSecret);
				System.out.println("Vous avez réussi en "+nombreDeTours+" coups");
				return true;
			}
			nombreDeTours++;
		}
        System.out.println(leCodeSecret);
		return false;
	}

	public void jouer() {
		// TODO Auto-generated method stub
		
	}
}
