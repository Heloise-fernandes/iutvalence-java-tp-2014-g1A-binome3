
public class Code 
{
	private final int longueur;
	Pion[] mesPions = null;
	
	public Code(int niv_longueur)
	{
		this.longueur = niv_longueur;
		this.mesPions = new Pion[niv_longueur];
	}
	
	public void CodeSecretAuto(int niv_longueur, Code monCodeSecret)
	{
		this.longueur = niv_longueur;
		for (int i=0; i<=niv_longueur; i++)
		{
		
		}
		
		
	}
	public void ajouterPion (Pion choixPion)
	{
		mesPions[choixPion.getPosition()] = choixPion;
	}

}
