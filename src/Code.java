
public class Code 
{
	private final int longueur;
	Pion[] mesPions = null;
	
	public Code(int niv_longueur)
	{
		this.longueur = niv_longueur;
		this.mesPions = new Pion[niv_longueur];
	}
	
	public void CodeSecretAuto(Code monCodeSecret)
	{
		for (int i=0; i<=monCodeSecret.longueur; i++)
		{
			monCodeSecret.mesPions[i] = random(Couleur);
			//A chercher comment utiliser la fonction random
		}
		
		
	}
	public void ajouterPion (Pion choixPion)
	{
		mesPions[choixPion.getPosition()] = choixPion;
	}

}
