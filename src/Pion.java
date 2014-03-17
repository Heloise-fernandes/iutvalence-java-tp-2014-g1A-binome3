/* TODO Javadoc */
/* TODO Package. */

public class Pion {
        /* TODO Est-ce que ça change en cours de partie ? Oui*/
        private Couleur couleur;
		
		public Pion (Couleur c)
		{
			this.couleur = c;
		}
		
		public Couleur getCouleur()
		{
			return this.couleur;
		}
		public void changerCouleur(Couleur newCouleur)
		{
			this.couleur=newCouleur;
		}
}
