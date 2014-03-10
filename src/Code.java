import java.util.Random;

/* TODO Javadoc */
/* TODO Package. */

public class Code 
{
	private final int longueur;
    /* TODO Final ? */
	Pion[] mesPions;

	public Code(int nivLongueur)
	{
		this.longueur = nivLongueur;
		this.mesPions = new Pion[nivLongueur];
	}

    public static void codeSecretAuto(Code monCodeSecret)
	{
		for (int i=0; i<=monCodeSecret.longueur; i++)
		{
			int pick = new Random().nextInt(Couleur.values().length);
		    monCodeSecret.mesPions[i].changerCouleur(Couleur.values()[pick]);
		}
	}

	public void ajouterPion(Pion choixPion)
	{
		mesPions[choixPion.getPosition()] = choixPion;
	}
	
	public static Code testMatch(Code bonCode, Code testCode)
	{
		int k=0;
		int l=0;
		boolean conf=false;
		Code codeCorrection = new Code(5);
		while (k<5)
		{
			if(bonCode.mesPions[k]==testCode.mesPions[k])
			{
				codeCorrection.mesPions[k].changerCouleur(Couleur.VERT);
				
			}
			else
			{
				while (l<5)
				{
					if(testCode.mesPions[k]==bonCode.mesPions[l])
					{
						codeCorrection.mesPions[k].changerCouleur(Couleur.ROUGE);
						conf=true;
					}
					l++;
				}
				if(conf==false)
				{
					codeCorrection.mesPions[k].changerCouleur(Couleur.NOIR);
				}
			}
			k++;
		}
		return codeCorrection;
	}
}
