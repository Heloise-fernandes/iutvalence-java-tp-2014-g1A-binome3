import java.util.Scanner;

/* TODO Javadoc. */
public class Mastermind 
{

	public boolean niveau()
	{
        Code leCodeSecret = new Code(5);
		Code.codeSecretAuto(leCodeSecret);
		Code codeValidation = new Code(5);
		Scanner sc = new Scanner(System.in);
        int j = 0;
        int i = 0;
        int l = 0;
        while (j<15)
		{
			Code monNouveauCode= new Code(5);
			while (i<5)
			{
				System.out.println("0=Vert\n 1=Rouge\n 2=Bleu\n 3=Orange\n 4=Jaune\n 5=Blanc\n 6=Noir\n 7=Violet\n 8=Rose\n 9=Marron\n");
				System.out.println("Choisir une couleur:");
                int x = sc.nextInt();
                if(x>9)
				{
					System.out.println("Vous etes un boulet, retournez jouer a Tetris.");
					i--;
				}
				else
				{
				    monNouveauCode.mesPions[i].changerCouleur(Couleur.values()[x]);
				}
				i++;
			}
			System.out.println(monNouveauCode);
			
			//On regarde la validiter du code et on creer le code correction
			codeValidation=Code.testMatch(leCodeSecret,monNouveauCode);
            int k = 0;
            System.out.println(codeValidation);
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
