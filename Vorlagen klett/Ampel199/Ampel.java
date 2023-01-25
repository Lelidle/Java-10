public class Ampel extends processing.core.PApplet {

    // Attributdeklaration ergänzen; Teilaufgabe a).
    
    
    
    public Ampel() {
        // Attributwert zuweisen; Teilaufgabe a).
        
        
        
    }

    public void starten() { // Die Methode muss der Anwender von außen starten.
        main("Ampel");  
    }

    public void settings() { // Wird vor Programmbeginn ausgeführt.
        size(200, 500); 
    } 

    public void setup() { // Wird zu Beginn einmal ausgeführt.
        stroke(0, 0 ,0);
        strokeWeight(5);
    }

    public void draw() { // Wird laufend (60-mal pro Sekunde) ausgeführt.
        background(200, 200, 200);
        // Methodenaufruf zum Zeichnen der Ampel ergänzen; Teilaufgabe a).
        
        
        
    }

    public void mouseClicked() { // Wird nach einem Mausklick ausgeführt.
        // Methodenaufruf zum Wechseln des Zustands ergänzen; Teilaufgabe b).
        
        
        
    }
    
    // Methodendefinition ampelZeichnen ergänzen; Teilaufgabe a).
    
    
    
    // Methodendefinition zustandWechseln ergänzen; Teilaufgabe b).
        
    
    
}