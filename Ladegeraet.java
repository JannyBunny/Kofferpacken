
/**
 * Beschreiben Sie hier die Klasse Ladegeraet.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class Ladegeraet extends Elektronik
{
    public String typ;
    /**
     * Konstruktor für Objekte der Klasse Ladegeraet
     * @param typ Der typ des Ladegerätes
     * @param voltzahl die voltzahl
     * @param gewicht das gewicht
     */
    public Ladegeraet(String typ, float voltzahl, float gewicht)
    {
        super(voltzahl, gewicht);
        this.typ=typ;
        
    }
    
    /**
     * Gibt den Typ zurück
     * @return Der typ des Ladegerätes
     */
    public String gibTyp()
    {
        return typ;
    }
    
    public void anzeigen()
    {
        String anzeige="\nFür welches Gerät ist es? "+typ+zeigeElektronik();
        System.out.println(anzeige);
    }

}
