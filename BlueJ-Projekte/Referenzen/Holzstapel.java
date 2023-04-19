public class Holzstapel {
    private int anzahlStämme;
    
    public Holzstapel() {
        anzahlStämme = 0;
    }
    
    public void stämmeAbliefern(int anzahl) {
        if(anzahl <= 0) {
            System.out.println("Das geht so nicht!");
            return;
        }
        anzahlStämme += anzahl;
    }
    
}