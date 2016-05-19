
/**
 * Beschreiben Sie hier die Klasse Elektronik.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class Elektronik extends Kofferinhalt
{
    private float voltzahl;
    /**
     * Konstruktor für Objekte der Klasse Elektronik
     */
    public Elektronik(float voltzahl, float gewicht)
    {
        super(gewicht);
        this.voltzahl=voltzahl;        
    }
    
    /**
     * Die Methode gibt die Voltzahl zurück
     * @return die Voltzahl
     */
    public float gibVolt()
    {
        return voltzahl;
    }
    
    /**
     * Gibt die Infos zurück
     * @return voltzahl
     * @return zeigeGewicht
     */
    public String zeigeElektronik()
    {
        return "\nVoltzahl: "+voltzahl +"\n Gewicht: "+zeigeGewicht();
    }
}
