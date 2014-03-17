/* TODO Javadoc */
/* TODO Package. */

public enum Couleur {
    VERT("VERT "),
    ROUGE("ROUGE "),
    BLEU("BLEU "),
    ORANGE("ORANGE "),
    JAUNE("JAUNE "),
    BLANC("BLANC "),
    NOIR("NOIR "),
    VIOLET("VIOLET "),
    ROSE("ROSE "),
    MARRON("MARRON ");
    
   private final String representation;

   private Couleur(String representation) {
	   this.representation = representation;
   }
   
   @Override
   public String toString(){
	   return representation;
   }
}
