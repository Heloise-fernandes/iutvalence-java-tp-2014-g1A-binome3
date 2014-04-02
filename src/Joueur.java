import java.util.Scanner;

public class Joueur 
{
	
//le joueur peu creer un tableau de pions il peut choisir une couleur mais il ne possede pas d'attribut et de constructeur	
	private static final int LONGUEUR_DU_CODE_PAR_DEFAUT = 5;
	private final String nom;
	
	public Joueur( String n)
	{
		nom=n;			
	}
	
	public Pion[] creerUnNouveauTableauDePion()
	{
		int indiceTableau=0;
		Pion tableauDePion[] =new Pion[LONGUEUR_DU_CODE_PAR_DEFAUT];
		while (indiceTableau<LONGUEUR_DU_CODE_PAR_DEFAUT)
		{
			tableauDePion[indiceTableau]=new Pion(choisirUneCouleur());
			indiceTableau++;
		}
		return tableauDePion;
	}
	
	
	public Couleur  choisirUneCouleur()
	{
		Couleur choixCouleur=Couleur.BLANC;
		Scanner sc = new Scanner(System.in);
		
		//Liste des Couleurs
		System.out.println("\n0=Vert\t 1=Rouge\t 2=Bleu\t 3=Orange\t 4=Jaune\t 5=Blanc\t 6=Noir\t 7=Violet\t 8=Rose\t 9=Marron\t");
		System.out.println("Choisir une couleur a mettre en position  :");
		
		int x = sc.nextInt();
		
		//Erreur
	    if(x>9 || x<0)
		{
			System.out.println("Vous etes un boulet, retournez jouer a Tetris.");
		}
	    
		choixCouleur=Couleur.values()[x];
	    return choixCouleur;
	}
	
	public Code creeCodeJoueur()
	{
		Code codeJoueur= new Code(this.creerUnNouveauTableauDePion());
		return codeJoueur;
	}


}