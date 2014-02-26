/* TODO Javadoc */
/* TODO Package. */

public class Pion {
        private Couleur couleur;
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
}
