public class Autofahrt extends processing.core.PApplet {
    float xpos; // Notwendig für Teilaufgabe a).
    float ypos;
    float geschwindigkeit; // Notwendig für Teilaufgabe c).
    boolean autoFaehrt; // Notwendig für Teilaufgabe b).
    
    public void starten() { 
        main("Autofahrt");  
    }

    public void settings() { 
        size(900, 400); 
    } 

    public void setup() { 
        xpos = 200;
        ypos = 300;
        geschwindigkeit = 3;
        autoFaehrt = true;
    } 

    // Methodendefintion strasseZeichnen ergänzen; Teilaufgabe a).
    
    

    // Methodendefinition autoZeichnen ergänzen; Teilaufgabe a).
    
    
    
    public void draw() { 
        background(120, 200, 5);
        // Methodenaufruf zum Zeichnen von Straße und Auto ergänzen; Teilaufgabe a).
        
        
        
        // Bedingte Anweisung ergänzen  //Teilaufgabe b)
        // Anweisungen für die Bewegnung des Autos ergänzen; Teilaufgabe b).
                        
            
            
        // Anweisung zur Geschwindigkeitsänderung ergänzen; Teilaufgabe c) .
            
            
                   
    }
   public void keyPressed() {  
       // Anweisung zum Halten und Fahren des Autos ergänzen; Teilaufgabe b).
       
       
       
   }
}
