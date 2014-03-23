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
    /** TODO. */
	public boolean niveau()
	{
        Code leCodeSecret = new Code();
        Scanner sc = new Scanner(System.in);
        /* TODO Noms de variables !!!! */
        int j = 0;
        int i = 0;
        int l = 0;
        int k = 0;
        /* TODO Pourquoi 15 ? Pourquoi pas une constante ? */
        while (j<15)
		{
			Code monNouveauCode= new Code(5);
			i=0;
			while (i<5)
			{
				System.out.println("\n0=Vert\t 1=Rouge\t 2=Bleu\t 3=Orange\t 4=Jaune\t 5=Blanc\t 6=Noir\t 7=Violet\t 8=Rose\t 9=Marron\t");
				System.out.println("Choisir une couleur:");
                /* TODO Attention aux Exceptions */
                int x = sc.nextInt();
                if(x>9)
				{
					System.out.println("Vous etes un boulet, retournez jouer a Tetris.");
					i--;
				}
				else
				{
                    /** TODO Ce genre de ligne fout la trouille ! Repensez avec des méthodes, etc… */
				    monNouveauCode.mesPions[i].changerCouleur(Couleur.values()[x]);
				}
				/* TODO Est-ce qu'il n'y a pas un problème d'index ? Est-ce que le i++ ne devrait pas être dans le else ? */
                i++;
			}
			System.out.println(monNouveauCode);

			//On regarde la validiter du code et on creer le code correction
            Code codeValidation = monNouveauCode.testMatch(leCodeSecret);
            System.out.println(codeValidation);
            /* TODO Algorithme général discutable et à discuter en TP. */
            k = 0;
            l=0;
            while(k<5)
			{
				if(codeValidation.mesPions[k].getCouleur().equals(Couleur.VERT))
				{
					l++;
				}
				k++;
			}
			if(l==5)
			{
				return true;
			}
			j++;
		}
		return false;
	}
	
}
