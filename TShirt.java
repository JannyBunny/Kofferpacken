
/**
 * Beschreiben Sie hier die Klasse TShirt.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class TShirt extends Kleidung
{
    private String aufdruck;
    /**
     * Konstruktor für Objekte der Klasse TShirt
     * @param aufdruck Aufdruck auf dem Shirt
     * @param groesse Größe des Shirts
     * @param gewicht Gewicht des Shirts
     */
    public TShirt(String aufdruck,String farbe, int groesse, float gewicht)
    {
        super(farbe,groesse,gewicht);
        this.aufdruck=aufdruck;
      }
    
    /**
     * Gibt den Aufdruck zurück
     * @return Der Aufdruck als String
     */
      
    public String gibAufdruck()
    {
        return aufdruck;
    }
    
    /**
     * Zeigt details zum Shirt an
     * 
     */
    public void anzeigen()
    {
        String anzeige="\nAufdruck: "+aufdruck+"\nGroesse: "+detailsKleidung();
        System.out.println(anzeige);
    }
        
}
