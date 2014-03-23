/* TODO Package. */
import java.security.SecureRandom;

/** TODO
 *
 * @author TODO
 * @version TODO
 */
public class Code
{
    /* TODO Private ? Final ? Nom ? */
    /** TODO. */
	Pion[] mesPions;

	/** TODO. */
	public Code(int longueur)
	{
		this.mesPions = new Pion[longueur];
		for(int i=0;i<longueur;i++)
		{
			this.mesPions[i] = new Pion(Couleur.BLANC);
		}
	}

    /** Génération d'un code alétatoire de taille 5. */
    public Code()
	{
        /* TODO Donc on peut construire manuellement des codes plus long mais aléatoirement seulement des codes de taille 5. */
    	this.mesPions = new Pion[5];
		for (int i=0; i<5; i++)
		{
			this.mesPions[i]=new Pion(Couleur.BLANC);
			int pick = new SecureRandom().nextInt(Couleur.values().length);
		    this.mesPions[i].changerCouleur(Couleur.values()[pick]);
		}
	}

    /* TODO Algorithme perfectible. */
    /** TODO. */
	public Code testMatch(Code bonCode)
	{
		int k=0;
        /* TODO Encore une taille constante alors qu'on peut manuellement créer des codes plus longs. */
		Code codeCorrection = new Code(5);
		while (k<5)
		{
            if(bonCode.mesPions[k].getCouleur() == this.mesPions[k].getCouleur())
			{
				codeCorrection.mesPions[k].changerCouleur(Couleur.VERT);
			}
			else
			{
                int l = 0;
                boolean pionPresent = false;
                /* TODO Encore une taille constante alors qu'on peut manuellement créer des codes plus longs. */
                while (l<5)
				{
                    if(this.mesPions[k].getCouleur() == bonCode.mesPions[l].getCouleur())
					{
						codeCorrection.mesPions[k].changerCouleur(Couleur.ROUGE);
						pionPresent=true;
					}
					l++;
				}
				if(!pionPresent)
				{
					codeCorrection.mesPions[k].changerCouleur(Couleur.NOIR);
				}
			}
			k++;
		}
		return codeCorrection;
	}

    @Override
	public String toString()
	{
        /* TODO StringBuilder à discuter en TP. */
		StringBuilder codeTexte = new StringBuilder(mesPions.length);
		for (Pion pion : this.mesPions) {
			codeTexte.append(pion.getCouleur());
		}
		return codeTexte.toString();
	}
}
