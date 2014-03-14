/* TODO Javadoc */
/* TODO Package. */

public class Pion {
        /* TODO Est-ce que ça change en cours de partie ? */
        private Couleur couleur;
        /* TODO Est-ce utile de retenir sa position ici ? */
		private int position;
		
		public Pion (Couleur c,int p)
		{
			this.couleur = c;
			this.position = p;
		}

        /* TODO Evitez le franglais. */
		public int getPosition()
		{
			return this.position;
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
