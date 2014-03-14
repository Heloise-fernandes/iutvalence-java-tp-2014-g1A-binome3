/* TODO Javadoc */
/* TODO Package. */

import java.util.Random;

public class Code
{
    /* TODO Est-ce utile de retenir les deux informations ? Ne peut-on pas inférer la première par la seconde ? */
	private final int longueur;
    /* TODO Final ? */
	Pion[] mesPions;

	public Code(int nivLongueur)
	{
		this.longueur = nivLongueur;
		this.mesPions = new Pion[nivLongueur];
	}

    /* TODO Est-ce que ce n'est pas une autre forme de constructeur ? */
    public static void codeSecretAuto(Code monCodeSecret)
	{
		for (int i=0; i<=monCodeSecret.longueur; i++)
		{
            /* TODO On préférera SecureRandom à Random. */
			int pick = new Random().nextInt(Couleur.values().length);
		    monCodeSecret.mesPions[i].changerCouleur(Couleur.values()[pick]);
		}
	}

    /* TODO Vous n'utilisez jamais cette méthode. */
	public void ajouterPion(Pion choixPion)
	{
		mesPions[choixPion.getPosition()] = choixPion;
	}

    /* TODO Pourquoi static ? */
    /* TODO Pourquoi deux paramètres ? */
    /* TODO Etes-vous sur que ça marche ? */
    /* TODO Algo à retravailler. */
	public static Code testMatch(Code bonCode, Code testCode)
	{
		int k=0;
		int l=0;
		boolean conf=false;
        /* TODO Pourquoi forcer la taille à 5 ? */
		Code codeCorrection = new Code(5);
		while (k<5)
		{
            /* TODO Vous ne devriez pas comparer des objets avec '==' mais avec la méthode equals. */
			if(bonCode.mesPions[k]==testCode.mesPions[k])
			{
				codeCorrection.mesPions[k].changerCouleur(Couleur.VERT);
				
			}
			else
			{
				while (l<5)
				{
                    /* TODO Vous ne devriez pas comparer des objets avec '==' mais avec la méthode equals. */
                    if(testCode.mesPions[k]==bonCode.mesPions[l])
					{
						codeCorrection.mesPions[k].changerCouleur(Couleur.ROUGE);
						conf=true;
					}
					l++;
				}
                /* TODO Pourquoi pas simplement "!conf" ? */
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
