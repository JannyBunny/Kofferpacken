import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse Koffer.
 * 
 * @author Jan-René Grünhagen 
 * @version 13.05.2016
 */
public class Koffer 
 
{
    private float gesamtgewicht;
    private float eigengewicht;
    private ArrayList<Kofferinhalt> inhalt;
    /**
     * Konstruktor für Objekte der Klasse Koffer
     */
    public Koffer(float eigengewicht)
    {
        this.eigengewicht = eigengewicht;
        inhalt = new ArrayList<>();
    }
    
        public void hinzufuegen(Kofferinhalt teil)
    {
        inhalt.add(teil);
    }
    
    public void anzeigen()
    {
        for (int i=0;i<inhalt.size();i++){
            System.out.println(inhalt.get(i));
        }
    }
    
    public float gibGesamtgewicht()
    {
        for (Kofferinhalt item: inhalt) {
            gesamtgewicht+=item.gibGewicht();
        }
        gesamtgewicht+=eigengewicht;
        return gesamtgewicht;
    }
    
}
