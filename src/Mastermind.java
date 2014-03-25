/* TODO package. */
import java.util.Scanner;

/**
 * TODO.
 *
 * @author TODO.
 * @version TODO.
 */
public class Mastermind 
{
    public static final int NOMBRE_DE_TOUR = 15;
    public static int longueurCode;

	/** TODO. */
	public boolean niveau(int niveau)
	{
        Code leCodeSecret = new Code(longueurCode, true);
        Scanner sc = new Scanner(System.in);
        int nombreDeTours = 0;
        int nombreDePionsModifie = 0;
        int nombreDeVert = 0;
        int indiceDeCorrection = 0;
        if(niveau ==1)
        	longueurCode=5;
        else
        	longueurCode=8;
        	
        while (nombreDeTours<NOMBRE_DE_TOUR)
		{
			Code monNouveauCode= new Code(longueurCode, false);
			nombreDePionsModifie=0;
			while (nombreDePionsModifie<longueurCode)
			{
				System.out.println("\n0=Vert\t 1=Rouge\t 2=Bleu\t 3=Orange\t 4=Jaune\t 5=Blanc\t 6=Noir\t 7=Violet\t 8=Rose\t 9=Marron\t");
				System.out.println("Choisir une couleur:");
                int x = sc.nextInt();
                if(x>9 || x<0)
				{
					System.out.println("Vous etes un boulet, retournez jouer a Tetris.");
				}
				else
				{
                    /** TODO Ce genre de ligne fout la trouille ! Repensez avec des méthodes, etc… */
				    monNouveauCode.mesPions[nombreDePionsModifie].changerCouleur(Couleur.values()[x]);
				    nombreDePionsModifie++;
				}
			}
			System.out.println(monNouveauCode);

			//On regarde la validiter du code et on creer le code correction
            Code codeValidation = monNouveauCode.testMatch(leCodeSecret,longueurCode);
            System.out.println(codeValidation);
            /* TODO Algorithme général discutable et à discuter en TP. */
            indiceDeCorrection = 0;
            nombreDeVert=0;
            while(indiceDeCorrection<longueurCode)
			{
				if(codeValidation.mesPions[indiceDeCorrection].obtenirCouleur().equals(Couleur.VERT))
					nombreDeVert++;
				indiceDeCorrection++;
			}
			if(nombreDeVert==longueurCode)
				return true;
			nombreDeTours++;
		}
		return false;
	}
}
