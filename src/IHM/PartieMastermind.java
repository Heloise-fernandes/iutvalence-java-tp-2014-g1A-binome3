package IHM;





import java.security.SecureRandom;
import java.util.ArrayList;

public class PartieMastermind implements ControleDuJEu
{
	ArrayList<Integer> codeSecret;
	
	public PartieMastermind(int longueurCode)
	{
		this.codeSecret=new ArrayList<Integer>();
		SecureRandom generateurDeNombresAleatoires = new SecureRandom();
		for (int numeroDuPion = 0; numeroDuPion < longueurCode; numeroDuPion++) 
		{
			int numeroDeCouleur = generateurDeNombresAleatoires.nextInt(10);
			codeSecret.add(numeroDuPion,numeroDeCouleur);
			
		}


	}
	
	public ArrayList<Integer> testeCodeSecret(ArrayList<Integer> codeAVerifier)
	{
		ArrayList<Integer> codeCorrection= new ArrayList<Integer>();
		for(int indice=0; indice<codeAVerifier.size(); indice++)
		{
			if(this.codeSecret.get(indice)==codeAVerifier.get(indice))
				codeCorrection.add(indice,1);
			else
			{
				if (this.codeSecret.contains(codeAVerifier.get(indice)))
						codeCorrection.add(indice,2);
				else
					codeCorrection.add(indice,0);
			}
		}
		
		return codeCorrection;
	}
	public ArrayList<Integer> obetenirCodeSecret()
	{
		return this.codeSecret;
	}
	
	public boolean codeJuste(ArrayList<Integer> code)
	{
		int nbJuste=0;
		for(int indice=0; indice<code.size(); indice++)
		{
			if(code.get(indice)==1)
				nbJuste++;
		}
		if(nbJuste==code.size())
			return true;
		return false;		
	}
}

