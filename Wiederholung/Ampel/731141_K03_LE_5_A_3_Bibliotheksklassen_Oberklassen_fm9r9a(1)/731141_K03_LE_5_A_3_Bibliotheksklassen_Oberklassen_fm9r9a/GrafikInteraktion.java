public class GrafikInteraktion extends processing.core.PApplet {
   float mitteX;
   float mitteY;
   String farbe;
   
   void starten() {                     // Diese Methode muss von dir aufgerufen werden.
      main("GrafikInteraktion");        // Diese geerbte Methode sorgt dafür, dass das Programm startet.
   }
   
   public void settings() {             // Diese Methode wird nach starten() automatisch einmal ausgeführt.
      size(800, 600);                   // Methode zur Festlegung der Fenstergröße.
   }
   
   public void setup() {                // Diese Methode wird nach settings() automatisch einmal ausgeführt.
      background(50, 50, 50);           // Hintergrund mit Farbe (50, 50, 50), also dunkelgrau im rgb-Forma,t ausfüllen.
      fill(255, 255, 255);              // Festlegung der Füllfarbe (weiß) für alle nachfolgend gezeichneten Figuren. 
      mitteX = 15;
      mitteY = 300;
      // stroke(255, 255 ,0);           // Festlegung der Linienfarbe (gelb) für alle nachfolgend gezeichneten Figuren.
      strokeWeight(5);                  // Festlegung der Linienstärke für alle nachfolgenden Zeichnungen.
   }
   
   // Die Methode draw() wird nach setup() (standardmäßig) 60-mal pro Sekunde automatisch ausgeführt.
   // Sie wird nur dann zeitweise unterbrochen, wenn ein Event durch den Anwender ausgelöst wird.
   public void draw() {             
      // background(50, 50, 50);
      ellipse(mitteX, mitteY, 30, 30);  // Zeichnet einen Kreis mit Mittelpunkt (mitteX ,mitteY) und Durchmesser 30.
      // mitteX = mitteX + 1;
   }
   
   // Die Event-Methode mousePressed() wird einmalig ausgeführt, sobald der Anwender die Maustaste drückt.
   // Die aktuelle Mausposition wird automatisch als Attributwerte von mouseX und mouseY gespeichert.
   // Anschließend wird der Programmfluss innerhalb der Methode draw() fortgesetzt.
   public void mousePressed() {
      background(50, 50, 50);
      mitteX = mouseX;
      mitteY = mouseY;
   }
   
   // Die Event-Methode keyPressed() wird einmalig ausgeführt, sobald der Anwender eine Taste drückt.
   // Das aktuelle Tastensymbol wird AUTOMATISCH als Attributwert von key gespeichert.
   // Anschließend wird der Programmfluss innerhalb der Methode draw() fortgesetzt.
   public void keyPressed() {
      if (key == 'r') {
          fill(255, 0, 0);             // Legt die Zeichenfüllfarbe Rot fest.
      }
      else if (key == 'g') {
          fill(0, 250, 0);             // Legt die Zeichenfüllfarbe Grün fest.
      }
      else if (key == 'b') {
          fill(0, 0, 250);             // Legt die Zeichenfüllfarbe Blau fest.
      }
      else if (key == 'm') {
          fill(250, 0, 250);           // Legt die Zeichenfüllfarbe Magenta fest.
      }
      else {
          fill(255, 255, 255);         // Legt die Zeichenfüllfarbe Schwarz fest.
      }
   }
}