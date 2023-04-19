public class Perlenkette {
    
    private Kreis[] perlen;
    // a)
    public Perlenkette() {
        perlen = new Kreis[12];
        for(int i = 0; i < perlen.length;i++) {
            perlen[i] = new Kreis(10);
            perlen[i].verschieben(2*10*i, 0);
        }
    }
    // b)
    public Perlenkette(int anzahl) {
        perlen = new Kreis[anzahl];
        for(int i = 0; i < perlen.length;i++) {
            perlen[i] = new Kreis(10);
            perlen[i].verschieben(2*10*i, 0);
        }
    }
    //c)
    //Um auf die erste Perle zuzugreifen, muss 0 eingegeben werden!
    public void farbeSetzen(int nummer, String farbe) {
        if(nummer < 0 || nummer >= perlen.length) {
            System.out.println("Diese Perle gibt es nicht!");
            return;
        }
        perlen[nummer].farbeSetzen(farbe);
    }
    
    public void radiusSetzen(int nummer, double radius) {
        if(nummer < 0 || nummer >= perlen.length) {
            System.out.println("Diese Perle gibt es nicht!");
            return;
        
        }
        double alterRadius = perlen[nummer].radiusGeben();
        perlen[nummer].radiusSetzen(radius);
        perlen[nummer].verschieben(radius-alterRadius,0);
        for(int i = nummer + 1; i < perlen.length; i++) {
            perlen[i].verschieben(2*(radius-alterRadius),0);
        }
    }
    
    public void positionSetzen(double mitteX0, double mitteY0) {
        perlen[0].mittelpunktSetzen(mitteX0, mitteY0);
        for(int i = 1; i < perlen.length; i++) {
            perlen[i].mittelpunktSetzen(
            perlen[i-1].mitteXGeben() + perlen[i-1].radiusGeben() + perlen[i].radiusGeben(),
            mitteY0
            );
        }

       // double xVerschiebung = mitteX0 - perlen[0].mitteXGeben();
        //double yVerschiebung = mitteY0 - perlen[0].mitteYGeben();
        //for(int i = 0; i < perlen.length; i++) {
        //    perlen[i].verschieben(xVerschiebung, yVerschiebung);
        //}
    }
}