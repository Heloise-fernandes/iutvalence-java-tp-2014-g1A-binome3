/* TODO Package. */
import java.security.SecureRandom;

/** TODO
 *
 * @author TODO
 * @version TODO
 */
public class Code
{
	public Pion[] mesPions;

	public Code(int longueur,boolean aleat)
	{
		if(!aleat)
		{
			this.mesPions = new Pion[longueur];
			for(int i=0;i<longueur;i++)
			{
				this.mesPions[i] = new Pion(Couleur.BLANC);
			}
		}
		else
		{
			this.mesPions = new Pion[longueur];
			for (int i=0; i<longueur; i++)
			{
				this.mesPions[i]=new Pion(Couleur.BLANC);
				int pick = new SecureRandom().nextInt(Couleur.values().length);
			    this.mesPions[i].changerCouleur(Couleur.values()[pick]);
			}
		}
	}
    /* TODO Algorithme perfectible. */
    /** TODO. */
	public Code testMatch(Code bonCode,int longueur)
	{
		int k=0;
		Code codeCorrection = new Code(longueur,false);
		while (k<longueur)
		{
            if(bonCode.mesPions[k].obtenirCouleur() == this.mesPions[k].obtenirCouleur())
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
                    if(this.mesPions[k].obtenirCouleur() == bonCode.mesPions[l].obtenirCouleur())
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
			codeTexte.append(pion.obtenirCouleur());
		}
		return codeTexte.toString();
	}
}
