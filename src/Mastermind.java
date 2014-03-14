import java.util.Scanner;

/* TODO Javadoc. */
public class Mastermind 
{

	public boolean niveau()
	{
        /* TODO Pourquoi forcer la taille ? */
        Code leCodeSecret = new Code(5);
		Code.codeSecretAuto(leCodeSecret);
		Code codeValidation = new Code(5);
		Scanner sc = new Scanner(System.in);
        int j = 0;
        int i = 0;
        int l = 0;
        /* TODO Pourquoi 15 ? Pourquoi pas une constante ? */
        while (j<15)
		{
			Code monNouveauCode= new Code(5);
			while (i<5)
			{
				System.out.println("0=Vert\n 1=Rouge\n 2=Bleu\n 3=Orange\n 4=Jaune\n 5=Blanc\n 6=Noir\n 7=Violet\n 8=Rose\n 9=Marron\n");
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
                    /* TODO Pourquoi "changerCouleur" et non "ajouterPion" ? */
				    monNouveauCode.mesPions[i].changerCouleur(Couleur.values()[x]);
				}
				i++;
			}
			System.out.println(monNouveauCode);

			//On regarde la validiter du code et on creer le code correction
            /* TODO Ce n'est pas une approche objet. */
            codeValidation=Code.testMatch(leCodeSecret,monNouveauCode);
            System.out.println(codeValidation);
            /* TODO Algorithme général discutable et à discuter en TP. */
            int k = 0;
            while(k<5)
			{
				if(codeValidation.mesPions[k].getCouleur()!=Couleur.VERT)
				{
					break;
				}
				l++;
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
