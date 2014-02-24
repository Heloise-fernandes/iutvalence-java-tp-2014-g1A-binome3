
public class Pion {
        /* TODO Meme question sur l'enum. */
		private Couleur couleur;
		private int position;
		
		public Pion (Couleur c,int p)
		{
			this.couleur = c;
			this.position = p;
		}
		
		public int getPosition()
		{
			return this.position;
		}
		public Couleur getCouleur()
		{
			return this.couleur;
		}
}
