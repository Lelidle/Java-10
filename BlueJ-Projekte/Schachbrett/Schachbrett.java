public class Schachbrett {
    
    private Rechteck[][] schachbrett;
    
    public Schachbrett() {
        schachbrett = new Rechteck[8];
        for(int i = 0; i < schachbrett.length; i++) {
            schachbrett[i] = new Rechteck(50,50);
            schachbrett[i].verschieben(i*50,0);
            if(i % 2 == 0) {
                schachbrett[i].farbeSetzen("schwarz");
            } else {
                schachbrett[i].farbeSetzen("rot");
            }
        }
    }
}