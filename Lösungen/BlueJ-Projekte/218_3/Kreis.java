import java.awt.*;
import java.awt.geom.*;
// Mögliche Werte für Farben sind rot, schwarz, blau, gelb, grün, weiss oder magenta.

class Kreis {    
    // Attributdeklarationen ergänzen.
    private double mitteX;
    private double mitteY;
    private double radius;
    private String farbe;
    
    
    
    // Methodendefinitionen ergänzen.
    public Kreis(double radiusNeu){
        mitteX = 50;
        mitteY = 50;
        radius = radiusNeu;
        farbe = "rot";
        zeichnen();
    }
    
    public double mitteXGeben(){
        return mitteX;
    }
    
    public double mitteYGeben(){
        return mitteY;
    }
    
    public double radiusGeben(){
        return radius;
    }
    
    public String farbeGeben(){
        return farbe;
    }
    
    public void radiusSetzen(double radiusNeu) {
        auswischen();
        radius = radiusNeu;
        zeichnen();
    }
    
    public void mittelpunktSetzen(double mitteXNeu, double mitteYNeu) {
        auswischen();
        mitteX = mitteXNeu;
        mitteY = mitteYNeu;
        zeichnen();
    }
    
    public void farbeSetzen(String farbeNeu) {
        auswischen();
        farbe = farbeNeu;
        zeichnen();
    }
    
    public void verschieben(double deltaX, double deltaY) {
        auswischen();
        mitteX = mitteX + deltaX;
        mitteY = mitteY + deltaY;
        zeichnen();
    }
    
    // Vorgegebene Methoden:
    void zeichnen() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this,farbe, new Ellipse2D.Double(mitteX - radius, mitteY - radius, radius * 2, radius * 2));
        canvas.wait(10);       
    }

    void auswischen() {       
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "weiss", new Ellipse2D.Double(mitteX - radius, mitteY - radius, radius * 2, radius * 2));
        canvas.wait(10); 
    }
}
