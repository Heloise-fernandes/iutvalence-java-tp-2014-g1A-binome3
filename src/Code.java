/* TODO Javadoc */
/* TODO Package. */

public class Code 
{
	private final int longueur;
    /* TODO Final ? */
	Pion[] mesPions;

    /* TODO Par convention en Java les noms de parametres n'ont pas de '_'. */
	public Code(int niv_longueur)
	{
		this.longueur = niv_longueur;
		this.mesPions = new Pion[niv_longueur];
	}

    /* TODO Par convention en Java les noms de méthodes n'ont pas de majuscule. */
    public void CodeSecretAuto(Code monCodeSecret)
	{
		for (int i=0; i<=monCodeSecret.longueur; i++)
		{
			monCodeSecret.mesPions[i] = random(Couleur);
			//A chercher comment utiliser la fonction random
		}
	}

	public void ajouterPion(Pion choixPion)
	{
		mesPions[choixPion.getPosition()] = choixPion;
	}

}
