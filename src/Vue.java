import java.util.Scanner;


public class Vue 
{
	private Scanner scannerJeu;
	
	/**
	 * Constructeur d'une vue
	 */
	public Vue()
	{
		scannerJeu=new Scanner(System.in);
	}
	
	/**
	 * Permet de choisir un niveau
	 * @return int
	 */
	public int  choixNiveau()
	{
	    
		System.out.println("\n***Choix du niveau***\n-niveau 1 : code de 5 , taper 1\n-niveau 2 : code de 6, taper 2\n-niveau 3 : code de 7, taper 3");
		int niveau=scannerJeu.nextInt();
		return niveau;
	}
	
	/**
	 * Permet de savoir si le joueur à perdu ou gagner
	 * @param boolean
	 */
	public void gagner(boolean jouer) 
	{
		if (jouer)
			System.out.println("Vous avez gagné !!");
		else
			System.out.println("Vous avez perdu !! (Tetris c'etait bien hein ?)");
	}
	
	/**
	 * Affiche le code du joueur
	 * @param code
	 */
	public void afficherCode(Code codeJ) 
	{
		System.out.println( "**********************************************************************\n");
		System.out.println( codeJ );
	}
	
	/**
	 * Affiche le code de correction
	 * @param codeCorrectif
	 */
	public void afficherCodeCorrection(Code codeCorrectif) 
	{
		System.out.println(codeCorrectif);
		System.out.println( "**********************************************************************\n"); 
	}
	
	/**
	 * Permet de choisir le nom du joueur
	 * @return String
	 */
	public String choisirJoueur() 
	{
		 System.out.println("Choisir nom du joueur:");
		 String nomJoueur;
		 do
	     {
			 nomJoueur = scannerJeu.nextLine();
	     }
		 while(nomJoueur == null || nomJoueur.isEmpty());
		 return nomJoueur;
	}
	
	/**
	 * Permet de savoir quel pion le joueur va creer
	 * @param int
	 */
	public void afficheCreerPion(int posi) 
	{
		System.out.println("Choisir une couleur a mettre en position  :"+ posi);
	}
	
	/**
	 * Permet de choisir une couleur
	 * @return int
	 */
	public int afficherListeCouleur() 
	{
		System.out.println("------------------------------------------------------------------------------------------------------"); 
		System.out.println("\n0=Vert\t 1=Rouge\t 2=Bleu\t 3=Orange\t 4=Jaune\t 5=Blanc\t 6=Noir\t 7=Violet\t 8=Rose\t 9=Marron\t");
		System.out.println("------------------------------------------------------------------------------------------------------"); 
		int numeroCouleur = scannerJeu.nextInt();
		return numeroCouleur;
	}

	/**
	 * Affiche un message d'erreur
	 */
	public void messageErreur() 
	{
		System.out.println("Vous etes un boulet, retournez jouer a Tetris.");
	}
	
}
