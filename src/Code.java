/* TODO Javadoc */
/* TODO Package. */

import java.security.SecureRandom;

public class Code
{
	Pion[] mesPions;
	/*Constructeur du code normal*/
	public Code(int nivLongueur)
	{
		this.mesPions = new Pion[nivLongueur];
		for(int i=0;i<nivLongueur;i++)
		{
			this.mesPions[i] = new Pion(Couleur.BLANC);
		}
	}
/*Constructeur du code secret*/
    public Code()
	{
    	this.mesPions = new Pion[5];
		for (int i=0; i<5; i++)
		{
			this.mesPions[i]=new Pion(Couleur.BLANC);
			int pick = new SecureRandom().nextInt(Couleur.values().length);
		    this.mesPions[i].changerCouleur(Couleur.values()[pick]);
		}
	}
    /* TODO Etes-vous sur que ca marche ? */
    /* TODO Algo a  retravailler. */
	public Code testMatch(Code bonCode)
	{
		int k=0;
		int l=0;
		boolean conf=false;
		Code codeCorrection = new Code(5);
		while (k<5)
		{
			conf=false;
			l=0;
			if(bonCode.mesPions[k].getCouleur().equals(this.mesPions[k].getCouleur()))
			{
				codeCorrection.mesPions[k].changerCouleur(Couleur.VERT);
				conf=true;
				
			}
			else
			{
				while (l<5)
				{
                    if(this.mesPions[k].getCouleur().equals(bonCode.mesPions[l].getCouleur()))
					{
						codeCorrection.mesPions[k].changerCouleur(Couleur.ROUGE);
						conf=true;
					}
					l++;
				}
				if(!conf)
				{
					codeCorrection.mesPions[k].changerCouleur(Couleur.NOIR);
				}
			}
			k++;
		}
		return codeCorrection;
	}
	public String toString()
	{
		String codeTexte=" ";
		for (Pion pion : this.mesPions) {
			codeTexte += pion.getCouleur();
		}
		return codeTexte;
	}
}
