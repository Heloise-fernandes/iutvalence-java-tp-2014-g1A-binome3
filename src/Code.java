import java.security.SecureRandom;

/**
 * objet Code
 *
 * @author Desmet/Fernandes
 *
 */
public class Code 
{
	private final Pion[] pions;

	
	/**
	 * Constructeur  de code aléatoire
	 * @param int
	 */
	public Code(int longueur) 
	{
		this.pions = new Pion[longueur];
		
		SecureRandom generateurDeNombresAleatoires = new SecureRandom();
		
		for (int numeroDuPion = 0; numeroDuPion < longueur; numeroDuPion++) 
		{
			Couleur[] couleurs = Couleur.values();
			int numeroDeCouleur = generateurDeNombresAleatoires.nextInt(couleurs.length);
			Couleur couleur = couleurs[numeroDeCouleur];
			this.pions[numeroDuPion] = new Pion(couleur);
		}
	}
	
	
	/**
	 * Constructeur  de code creer par le joueur
	 * @param tableau de pion
	 */
	public Code(Pion[] code)
	{
		this.pions = code;
	}
	
	
	public Pion[] obetenirTabCode()
	{
		return this.pions;
	}

	/**
	 * Fonction qui verifie le code et renvoie un code de correction
	 * 
	 * @param code
	 * @return code
	 */
	
	public Code testMatch(Code bonCode) 
	{
		int indiceLongueurDuCode = 0;
		Pion leCodeCorrection[]= new Pion[Mastermind.longueurDuCode];
		//initialisation du code correction
		Code codeCorrection = new Code(leCodeCorrection);
		
		while (indiceLongueurDuCode < Mastermind.longueurDuCode) 
		{
			//Si la couleur du pion du code secret et egale à celle du pion du code courent  à l'indice indiceLongueurDuCode
			if (bonCode.pions[indiceLongueurDuCode].obtenirCouleur().equals(this.pions[indiceLongueurDuCode].obtenirCouleur()))
			{
				codeCorrection.pions[indiceLongueurDuCode]=new Pion(Couleur.VERT);
			} 
			
			else 
			{
				int indiceDeLongueur2 = 0;
				boolean pionPresent = false;
				//On cherche si la couleur est presente
				while (indiceDeLongueur2 < Mastermind.longueurDuCode) 
				{
					if (this.pions[indiceLongueurDuCode].obtenirCouleur().equals(bonCode.pions[indiceDeLongueur2].obtenirCouleur())) 
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
        
        while(indiceDeCorrection<Mastermind.longueurDuCode)
		{
			if(this.pions[indiceDeCorrection].obtenirCouleur().equals(Couleur.VERT))
				nombreDeVert++;
			indiceDeCorrection++;
		}
        
		if(nombreDeVert==Mastermind.longueurDuCode)
		{
			return true;
		}
	
		return false;
	}

	@Override
	public String toString() {
		StringBuilder codeTexte = new StringBuilder(pions.length);
		for (Pion pion : this.pions) {
			codeTexte.append(pion.obtenirCouleur());
		}
		return codeTexte.toString();
	}
}
