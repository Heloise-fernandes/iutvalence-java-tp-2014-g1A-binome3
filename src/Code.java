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
		int indiceLongueurDuCode=0;
		Code codeCorrection = new Code(longueur,false);
		while (indiceLongueurDuCode<longueur)
		{
            if(bonCode.mesPions[indiceLongueurDuCode].obtenirCouleur() == this.mesPions[indiceLongueurDuCode].obtenirCouleur())
			{
				codeCorrection.mesPions[indiceLongueurDuCode].changerCouleur(Couleur.VERT);
			}
			else
			{
                int indiceDeLongueur2 = 0;
                boolean pionPresent = false;
                while (indiceDeLongueur2<longueur)
				{
                    if(this.mesPions[indiceLongueurDuCode].obtenirCouleur() == bonCode.mesPions[indiceDeLongueur2].obtenirCouleur())
					{
						codeCorrection.mesPions[indiceLongueurDuCode].changerCouleur(Couleur.ROUGE);
						pionPresent=true;
					}
					indiceDeLongueur2++;
				}
				if(!pionPresent)
				{
					codeCorrection.mesPions[indiceLongueurDuCode].changerCouleur(Couleur.NOIR);
				}
			}
			indiceLongueurDuCode++;
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
