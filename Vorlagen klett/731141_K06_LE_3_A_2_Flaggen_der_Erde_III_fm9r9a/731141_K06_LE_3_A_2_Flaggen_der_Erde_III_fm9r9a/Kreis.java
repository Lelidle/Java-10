import java.awt.*;
import java.awt.geom.*;
// Mögliche Werte für Farben sind rot, schwarz, blau, gelb, grün, weiss oder magenta.

class Kreis {    
    int mitteX;
    int mitteY;
    int radius; 
    String farbe;
    
    Kreis(int mx, int my, int r, String f) {
        mitteX = mx;
        mitteY = my;
        radius = r;
        farbe = f;
        zeichnen();
    }
    
    void mittelpunktSetzen(int mitteXneu, int mitteYneu) {
        auswischen();
        mitteX = mitteXneu;
        mitteY = mitteYneu;        
        zeichnen();
    } 
    
    void radiusSetzen(int radiusNeu) {
        auswischen();
        radius = radiusNeu;        
        zeichnen();
    } 
    
    void verschieben(int deltaX, int deltaY) {       
        auswischen();
        mitteX = mitteX + deltaX;
        mitteY = mitteY + deltaY;
        zeichnen();
    }
    
    void farbeSetzen(String farbeNeu) {
        auswischen();
        farbe = farbeNeu;
        zeichnen();
    }
    
    // Vorgegebene Methoden:
    void zeichnen() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, farbe, new Ellipse2D.Double(mitteX - radius, mitteY - radius, radius * 2, radius * 2));
        canvas.wait(10);       
    }

    void auswischen() {       
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "weiss", new Rectangle2D.Double(0, 0, 800, 600));
    }
}
