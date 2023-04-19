public class Nahrung {
     
    private String name;
    private double preis;
    
    public Nahrung(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }
        
    public String gibName() {
        return name;
    }
    
    public double gibPreis() {
        return preis;
    }
    
    public void preiserhoehen(double erhoehung) {
        preis += erhoehung;
    }
}