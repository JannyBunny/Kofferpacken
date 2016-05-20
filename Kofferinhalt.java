/**
 * Beschreiben Sie hier die Klasse Kofferinhalt.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class  Kofferinhalt

{
    private float gewicht;
    /**
     * Konstruktor für Objekte der Klasse Kofferinhalt
     * @param gewicht Das Gewicht
     */
    public Kofferinhalt(float gewicht)
    {
        this.gewicht = gewicht;
    }
    
    /**
     * Gibt das Gewicht zurück
     * @return das Gewicht
     */
    public float gibGewicht()
    {
        return gewicht;
    }

    /**
     * Gibt details zum Inhalt zurück
     * @return anzeige die anzeige;
     */
    public String zeigeGewicht()
    {
        String anzeige = "\n Das Stück wiegt: "+gewicht+" Gramm.";
        return anzeige;
    }

}
