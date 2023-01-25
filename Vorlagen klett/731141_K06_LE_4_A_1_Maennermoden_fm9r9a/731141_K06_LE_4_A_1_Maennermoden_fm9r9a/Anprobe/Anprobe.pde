// HINWEIS: Verwendet man die Processing-Entwicklungsumgebung,
// so fällt bei der Startklasse (hier Anprobe) der Klassenkopf weg.
// Vergleiche hierzu Punkt 7 in der Datei README_Processing.pdf. 

// class Anprobe
Hose h1, h2;
Weste w1, w2;
Sakko s1, s2;
Person jan, tim;
Anzug anzugJan, anzugTim;


public void settings() {
  size(800, 600);
}
public void setup() {
  h1 = new Hose(50, "schwarz", "Baumwolle");
  s1 = new Sakko(48, "blau", "Wolle");
  w1 = new Weste(48, "gelb", "Seide");
  h2 = new Hose(50, "schwarz", "Baumwolle");
  s2 = new Sakko(48, "blau", "Wolle");
  w2 = new Weste(48, "gelb", "Seide");
  jan = new Person(600, 50, "Jan");
  tim = new Person(200, 50, "Tim");
  // Die Implementierung für die folgenden Varianten 
  // jeweils ergänzen:
  
  /*
  (1) Beide Brüder teilen sich Sakko, Weste und Hose.
      Es handelt sich um identische Kleidungsstücke.
  */
  
  
    
  /*
  (2) Jeder der beiden Brüder kauft sich einen eigenen Anzug. 
      Die einzelnen Kleidungsstücke haben den gleichen Stoff, 
      die gleiche Farbe und die gleiche Größe. 
      Es handelt sich um gleichartige Objekte.
  */
  
  
  
  /*
  (3) Beide Brüder teilen sich ein Sakko, jeder kauft aber
      eine eigene Weste und eine eigene Hose. 
      Das Sakko ist also identisch, bei Weste und Hose handelt 
      es sich um gleichartige Objekte.
  */
  
  
  
  /*
  (4) Beide Brüder kaufen sich je nur eine eigene Hose 
      und teilen sich Sakko und Weste, 
      Sakko und Weste sind also identisch, bei den Hosen handelt 
      es sich um gleichartige Objekte.
  */
  
  
    
  textSize(50);
  textAlign(CENTER, CENTER);
}

public void draw() {
  background(255);
  strokeWeight(6);
  zeichnen();
}

public void keyPressed() {
  // Anweisungen für Jan und Tim zur Anprobe des 
  // eigenen Anzugs ergänzen.
  

  
}

public void zeichnen() {
  jan.zeichnen();
  tim.zeichnen();
  h1.zeichnen();
  h2.zeichnen();
  w1.zeichnen();
  w2.zeichnen();
  s1.zeichnen();
  s2.zeichnen();
}
