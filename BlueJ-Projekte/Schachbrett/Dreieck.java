import java.awt.*;
import java.awt.geom.*;
// Mögliche Werte für Farben sind rot, schwarz, blau, gelb, grün, weiss oder magenta.

class Dreieck {    
    // Attributdeklarationen ergänzen.
    private int ax,ay,bx,by,cx,cy;
    private String farbe;
    
    // Methodendefinitionen ergänzen.
    public Dreieck(int axNeu, int ayNeu, int bxNeu, int byNeu, int cxNeu, int cyNeu){
        ax = axNeu;
        ay = ayNeu;
        bx = bxNeu;
        by = byNeu;
        cx = cxNeu;
        cy = cyNeu;
        farbe = "schwarz";
        zeichnen();
    }
    
    public void eckeASetzen(int axNeu, int ayNeu){
        auswischen();
        ax = axNeu;
        ay = ayNeu;
        zeichnen();
    }
    
    public void eckeBSetzen(int bxNeu, int byNeu) {
        auswischen();
        bx = bxNeu;
        by = byNeu;
        zeichnen();
    }
    
    public void eckeCSetzen(int cxNeu, int cyNeu) {
        auswischen();
        cx = cxNeu;
        cy = cyNeu;
        zeichnen();
    }
    
    public String farbeGeben(){
        return farbe;
    }
    
    public void farbeSetzen(String farbeNeu) {
        auswischen();
        farbe = farbeNeu;
        zeichnen();
    }
    
    public void verschieben(int deltaX, int deltaY){
        auswischen();
        ax += deltaX;
        bx += deltaX;
        cx += deltaX;
        ay += deltaY;
        by += deltaY;
        cy += deltaY;
        zeichnen();
    }
    // Vorgegebene Methoden:
    void zeichnen() {
        Canvas canvas = Canvas.getCanvas();
        int[] xpoints = { (int) ax, (int) bx ,(int) cx };
        int[] ypoints = { (int) ay,(int) by,(int) cy };
        canvas.draw(this, farbe, new Polygon(xpoints, ypoints, 3));
        canvas.wait(10);     
    }

    void auswischen() {       
        Canvas canvas = Canvas.getCanvas();
        int[] xpoints = { (int) ax, (int) bx ,(int) cx };
        int[] ypoints = { (int) ay, (int) by, (int) cy };
        canvas.draw(this, "weiss", new Polygon(xpoints, ypoints, 3));
        canvas.wait(10); 
    }
}
