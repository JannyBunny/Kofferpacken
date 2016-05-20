

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse Testklasse.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Testklasse
{
    private Koffer koffer1;
    private Kofferinhalt kofferin1;
    private TShirt tShirt1;
    private Hose hose1;
    private Laptop laptop1;
    private Handy handy1;
    private Ladegeraet ladegera1;
    private Ladegeraet ladegera2;

    /**
     * Konstruktor fuer die Test-Klasse Testklasse
     */
    public Testklasse()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        koffer1 = new Koffer(2000);
       // kofferin1 = new Kofferinhalt(500);
        tShirt1 = new TShirt("Drache", "Schwarz", 45, 400);
        hose1 = new Hose("Kurz", "blau", 38, 300);
        laptop1 = new Laptop(true, 14, 2500);
        handy1 = new Handy(true, 5, 300);
        ladegera1 = new Ladegeraet("Laptop", 14, 1000);
        ladegera2 = new Ladegeraet("Handy", 5, 100);
        koffer1.hinzufuegen(tShirt1);
        koffer1.hinzufuegen(hose1);
        koffer1.hinzufuegen(handy1);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
