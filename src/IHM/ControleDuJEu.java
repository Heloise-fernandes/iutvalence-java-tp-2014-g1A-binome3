package IHM;

import java.util.ArrayList;

public interface ControleDuJEu 
{
	public ArrayList<Integer> testeCodeSecret(ArrayList<Integer> codeAVerifier);
	
	public boolean codeJuste(ArrayList<Integer> code);
	
	public ArrayList<Integer> obetenirCodeSecret();
}
