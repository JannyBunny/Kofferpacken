
/**
 * Beschreiben Sie hier die Klasse Kleidung.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class Kleidung extends Kofferinhalt
{
    private String farbe;
    private int groesse;
    
    /**
     * Konstruktor für Objekte der Klasse Kleidung
     * @param farbe Farbe
     * @param groesse Größe
     * @param gewicht Gewicht
     */
    public Kleidung(String farbe, int groesse, float gewicht)
    {
        super(gewicht);
        this.farbe=farbe;
        this.groesse=groesse;
     
    }

    /**
     * Methode gibt die Farbe zurück
     * @return Die Farbe
     * 
     */
    public String gibFarbe()
    {
        return farbe;
    }
    
    /**
     * Die Methode gibt die Größe zurück
     * @return die Größe
     */
    public int groesse()
    {
        return groesse;
    }
    
    /**
     * Die Methode gibt die Eigenschaften der Kleidung zurück.
     * @return Eigenschaften wie Farbe größe und gewicht
     *
     */
    public String detailsKleidung()
    {
        return "Farbe: " + farbe +"\nGröße: "+groesse+"\nGewicht: "+zeigeGewicht();
    }
}
