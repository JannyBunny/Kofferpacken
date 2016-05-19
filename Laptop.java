
/**
 * Beschreiben Sie hier die Klasse Laptop.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class Laptop extends Elektronik
{
    private boolean ausgeschaltet;
    
    /**
     * Konstruktor für Objekte der Klasse Laptop
     */
    public Laptop(boolean ausgeschaltet, float voltzahl, float gewicht)
    {
        super(voltzahl, gewicht);
        this.ausgeschaltet=ausgeschaltet;
    }

    /**
     * Gibt den Zustand des Gerätes zurück
     * @return ausgeschaltet ob das Gerät ausgeschaltet ist.
     */
    public boolean gibAusgeschaltet()
    {
        return ausgeschaltet;
    }
    
    public void anzeigen()
    {
        String anzeige ="\nIst es ausgeschaltet? "+ausgeschaltet+zeigeElektronik();
        System.out.println(anzeige);
    }
    
}
