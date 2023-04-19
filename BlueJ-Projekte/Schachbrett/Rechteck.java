import java.awt.*;
import java.awt.geom.*;
// Mögliche Werte für Farben sind rot, schwarz, blau, gelb, grün, weiss oder magenta.

class Rechteck {
    // Attributdeklarationen ergänzen.
    private int linksObenX;
    private int linksObenY;
    private int laenge;
    private int breite;
    private String farbe;
    
    // Methodendefinitionen ergänzen.
    public Rechteck(int laenge, int breite){
        linksObenX = 10;
        linksObenY = 10;
        this.laenge = laenge;
        this.breite = breite;
        farbe = "rot";
        zeichnen();
    }
    
    
    public int linksObenXgeben(){
        return linksObenX;
    }
    
    public int linksObenYGeben(){
        return linksObenY;
    }
    
    public int laengeGeben(){
        return laenge;
    }
    
    public int breiteGeben(){
        return breite;
    }
    
    public String farbeGeben(){
        return farbe;
    }
    
    public void laengeSetzen(int laengeNeu){
        auswischen();
        laenge = laengeNeu;
        zeichnen();
    }
    
    public void breiteSetzen(int breiteNeu){
        auswischen();
        breite = breiteNeu;
        zeichnen();
    }
    
    public void positionSetzen(int linksObenXNeu, int linksObenYNeu){
        auswischen();
        linksObenX = linksObenXNeu;
        linksObenY = linksObenYNeu;
        zeichnen();
    }
    
    public void farbeSetzen(String farbeNeu) {
        auswischen();
        farbe = farbeNeu;
        zeichnen();
    }
    
    public void verschieben(int deltaX, int deltaY) {
        auswischen();
        linksObenX = linksObenX + deltaX;
        linksObenY = linksObenY + deltaY;
        zeichnen();
    }
    // Vorgegebene Methoden:
    void zeichnen() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this,farbe, new Rectangle2D.Double(linksObenX, 
        linksObenY, laenge, breite));
        canvas.wait(10);       
    }

    void auswischen() {       
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "weiss", new Rectangle2D.Double(linksObenX, 
        linksObenY, laenge ,breite));
        canvas.wait(10); 
    }
}
