/**
 * Abstrakte Klasse Tier - beschreiben Sie hier die Klasse
 * 
 * @author L. Kerber
 * @version 0.1 
 */
public abstract class Tier
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String tierart;

    public Tier(String Tierart)
    { this.tierart = tierart;
    };
    
    /**
     * gibLaut schreibt einen Text in die Konsole
     * 
     */
    public abstract void gibLaut();

}
