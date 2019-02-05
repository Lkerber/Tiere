
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    private Main() {}
    
    
    public static void main()
    {
        Tier ente = new Ente();
        Tier baer = new Bär();
        System.out.println("\n*** Main beginnt:");
        ente.gibLaut();
        baer.gibLaut();
        System.out.println("*** Main endet.");
    }
}
