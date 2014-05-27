
/**
 * Oblet Joueur
 * @author Desmet/Fernandes
 *
 */
public class Joueur 
{	
 
	private final String nom;
	/**
	 * Constructeur d'un joueur
	 * @param n
	 */
	public Joueur( String n)
	{
		nom=n;			
	}
	
	/**
	 * Créer un nouveau tableau de pion
	 * @param vue
	 * @return tableau de pion
	 */
	public Pion[] creerUnNouveauTableauDePion(Vue vue)
	{
		int indiceTableau=0;
		int posi=1;
		Pion tableauDePion[] =new Pion[Mastermind.longueurDuCode];
		while (indiceTableau<Mastermind.longueurDuCode)
		{
			vue.afficheCreerPion(posi);
			tableauDePion[indiceTableau]=new Pion(choisirUneCouleur(vue));
			indiceTableau++;
			posi++;
		}
		return tableauDePion;
	}
	
	/**
	 * permet au joueur de choisir une couleur
	 * @param vue
	 * @return Couleur
	 */
	public Couleur  choisirUneCouleur(Vue vue)
	{
		Couleur choixCouleur=Couleur.BLANC;
		int numCouleur=vue.afficherListeCouleur();
	    if(numCouleur>9 || numCouleur<0)
		{
	    	vue.messageErreur();
		}
	    
		choixCouleur=Couleur.values()[numCouleur];
	    return choixCouleur;
	}
	
	/**
	 * Creer le code du joueur
	 * @param vue
	 * @return code
	 */
	public Code creeCodeJoueur(Vue vue)
	{
		Code codeJoueur= new Code(this.creerUnNouveauTableauDePion(vue));
		return codeJoueur;
	}


}