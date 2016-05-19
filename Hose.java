
/**
 * Beschreiben Sie hier die Klasse Hose.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class Hose extends Kleidung
{
    private String art;
    /**
     * Konstruktor für Objekte der Klasse Hose
     * @param art die Art
     * @param farbe die Farbe
     * @param groesse die Groesse
     * @param gewicht das Gewicht
     */
    public Hose(String art, String farbe ,int groesse, float gewicht)
    {
        super(farbe, groesse, gewicht);
        this.art=art;
    }

    /**
     * Gibt die Art zurück
     * @return Gibt die Art zurück
     */
    public String gibArt()
    {
        return art;
    }

      
    /**
     * Gibt die details an
     */
    public void anzeigen()
    {
        String anzeige = "\nArt: "+art +detailsKleidung();
        System.out.println(anzeige);
    }
  
}
