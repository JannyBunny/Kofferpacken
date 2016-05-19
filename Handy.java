
/**
 * Beschreiben Sie hier die Klasse Handy.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class Handy extends Elektronik
{
    private boolean aufgeladen;
    /**
     * Konstruktor für Objekte der Klasse Handy
     * @param aufgeladen ist es aufgeladen
     * @param voltzahl wieviel Volt
     * @param gewicht wie schwer
     */
    public Handy(boolean aufgeladen, float voltzahl, float gewicht)
    {
        super(voltzahl, gewicht);
        this.aufgeladen=aufgeladen;
    }
    
    /**
     * Gibt zurück ob das Gerät aufgefladen ist
     * @return aufgeladen;
     */
    public boolean gibAufgeladen()
    {
        return aufgeladen;
    }
    
    /**
     * Gibt die Details des Gerätes aus
     */
    public void anzeigen()
    {
        String anzeige ="\nIst es aufgeladen?  "+aufgeladen+zeigeElektronik();
        System.out.println(anzeige);
    }
}
