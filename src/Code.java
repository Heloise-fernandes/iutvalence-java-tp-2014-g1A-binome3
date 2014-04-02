/* TODO Package. */
import java.security.SecureRandom;


/**
 * TODO
 * 
 * @author TODO
 * @version TODO
 */
public class Code 
{
	private static final int LONGUEUR_DU_CODE_PAR_DEFAUT = 5;
	private final Pion[] pions;

	/**
	 * Constructeur  de code al�atoire
	 * @param boolean, int
	 */
	public Code(int longueur) 
	{
		this.pions = new Pion[longueur];
		
		SecureRandom generateurDeNombresAleatoires = new SecureRandom();
		
		for (int numeroDuPion = 0; numeroDuPion < longueur; numeroDuPion++) 
		{
			int nombreDeCouleurs = Couleur.values().length;
			int numeroDeCouleur = generateurDeNombresAleatoires.nextInt(nombreDeCouleurs);
			Couleur couleur = Couleur.values()[numeroDeCouleur];
			this.pions[numeroDuPion] = new Pion(couleur);
		}
	}
	
	/**
	 * Constructeur  de code creer par le joueur
	 * @param boolean, int
	 */
	public Code(Pion[] code)
	{
		this.pions = code;
	}
	
		
	/* TODO Algorithme perfectible. */
	/**
	 * Fonction qui verifie le code et renvoie un code de correction
	 * 
	 * @param code
	 *            , int
	 * @return code
	 */
	
	public Code testMatch(Code bonCode, int longueur) 
	{
		int indiceLongueurDuCode = 0;
		Pion leCodeCorrection[]= new Pion[longueur];
		//initialisation du code correction
		Code codeCorrection = new Code(leCodeCorrection);
		
		while (indiceLongueurDuCode < longueur) 
		{
			//Si la couleur du pion du code secret et egale � celle du pion du code courent  � l'indice indiceLongueurDuCode
			if (bonCode.pions[indiceLongueurDuCode].obtenirCouleur() == this.pions[indiceLongueurDuCode].obtenirCouleur()) 
			{
				codeCorrection.pions[indiceLongueurDuCode]=new Pion(Couleur.VERT);
			} 
			
			else 
			{
				int indiceDeLongueur2 = 0;
				boolean pionPresent = false;
				//On cherche si la couleur est presente
				while (indiceDeLongueur2 < longueur) 
				{
					if (this.pions[indiceLongueurDuCode].obtenirCouleur() == bonCode.pions[indiceDeLongueur2].obtenirCouleur()) 
					{
						codeCorrection.pions[indiceLongueurDuCode]= new Pion(Couleur.ROUGE);
						pionPresent = true;
					}
					indiceDeLongueur2++;
				}
				
				if (!pionPresent) {
					codeCorrection.pions[indiceLongueurDuCode]= new Pion(Couleur.NOIR);
				}
			}
			indiceLongueurDuCode++;
		}
		return codeCorrection;
	}
	
	public boolean analyseCodeCorrection()
	{
		int indiceDeCorrection = 0;
        int nombreDeVert=0;
        
        while(indiceDeCorrection<LONGUEUR_DU_CODE_PAR_DEFAUT)
		{
			if(this.pions[indiceDeCorrection].obtenirCouleur().equals(Couleur.VERT))
				nombreDeVert++;
			indiceDeCorrection++;
		}
        
		if(nombreDeVert==LONGUEUR_DU_CODE_PAR_DEFAUT)
		{
			return true;
		}
	
		return false;
	}

	@Override
	public String toString() {
		/* TODO StringBuilder à discuter en TP. */
		StringBuilder codeTexte = new StringBuilder(pions.length);
		for (Pion pion : this.pions) {
			codeTexte.append(pion.obtenirCouleur());
		}
		return codeTexte.toString();
	}
}
