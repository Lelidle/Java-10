
public class Element
{
    private double massezahl;
    private int ordnungszahl;
    private String symbol;
    private String name;
    private int zeile;
    private int spalte;
    
    public Element(double massezahlNeu,int ordnungszahlNeu, String symbolNeu, 
    String nameNeu, int zeileNeu, int spalteNeu) {
        massezahl = massezahlNeu;
        ordnungszahl = ordnungszahlNeu;
        symbol = symbolNeu;
        name = nameNeu;
        zeile = zeileNeu;
        spalte = spalteNeu;
    }
}
