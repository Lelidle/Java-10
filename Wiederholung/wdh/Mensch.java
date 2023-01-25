
public class Mensch
{
   
    private int alter;
    private String name;
    private double groesse;

    public Mensch()
    {
        alter = 20;
        name = "John Doe";
        groesse = 1.57;
    }
    
    public void wachsen(double wachstumsWert) {
        groesse = groesse + wachstumsWert;
    }
    
    public int gibAlter() {
        return alter;
    }
}
