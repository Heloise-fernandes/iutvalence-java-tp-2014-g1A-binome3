/* TODO Package. */
import java.security.SecureRandom;

/**
 * TODO
 * 
 * @author TODO
 * @version TODO
 */
public class Code {
	private final Pion[] pions;

	/**
	 * Contructeur. Est-ce possible?
	 * 
	 * @param boolean, int
	 */
	public Code(int longueur) {
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
	
	public Code(Pion[] pions)
	{
		this.pions = pions;
	}

	/* TODO Algorithme perfectible. */
	/**
	 * Fonction qui verifie le code et renvoie un code de correction
	 * 
	 * @param code
	 *            , int
	 * @return code
	 */
	public Code testMatch(Code bonCode, int longueur) {
		int indiceLongueurDuCode = 0;
		Code codeCorrection = new Code(longueur, false);
		while (indiceLongueurDuCode < longueur) {
			if (bonCode.pions[indiceLongueurDuCode].obtenirCouleur() == this.pions[indiceLongueurDuCode]
					.obtenirCouleur()) {
				codeCorrection.pions[indiceLongueurDuCode]
						.changerCouleur(Couleur.VERT);
			} else {
				int indiceDeLongueur2 = 0;
				boolean pionPresent = false;
				while (indiceDeLongueur2 < longueur) {
					if (this.pions[indiceLongueurDuCode].obtenirCouleur() == bonCode.pions[indiceDeLongueur2]
							.obtenirCouleur()) {
						codeCorrection.pions[indiceLongueurDuCode]
								.changerCouleur(Couleur.ROUGE);
						pionPresent = true;
					}
					indiceDeLongueur2++;
				}
				if (!pionPresent) {
					codeCorrection.pions[indiceLongueurDuCode]
							.changerCouleur(Couleur.NOIR);
				}
			}
			indiceLongueurDuCode++;
		}
		return codeCorrection;
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
