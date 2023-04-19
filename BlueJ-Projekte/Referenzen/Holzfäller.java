public class Holzfäller {
    private Holzstapel stapel;
    private int anzahlStämme;
    
    public Holzfäller(Holzstapel stapel) {
        anzahlStämme = 0;
        this.stapel = stapel;
    }
    
    public void holzHacken() {
        anzahlStämme++;
    }
    
    public void holzAbliefern() {
        stapel.stämmeAbliefern(anzahlStämme);
        anzahlStämme = 0;
    }
}