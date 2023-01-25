class ColorPiekser {
  private int xpos;
  private int ypos;
  private int[] farbe;   
  private Target tar;
  public ColorPiekser(Target t) {
    // Position und Farbe zufällig festlegen
    // Ergänzung:
    
      
    
    tar = t;
  }
  public void pieksen() {
    if (dist(xpos, ypos, tar.xposGeben(), tar.yposGeben()) < 50) {
      tar.farbeSetzen(farbe);
    }
  }
  
  public void bewegen() {
    // Anweisung für zufällige Bewegung ergänzen.
    // Die neuen Positionskoordinaten sollen dabei
    // innerhalb des Zeichenfensters liegen.
    // Ergänzung:
        
    
    
  }
  
  public void zeichnen() {
    fill(farbe[0], farbe[1], farbe[2]);
    rect(xpos, ypos, 10, 10);
    tar.zeichnen();
  }
}
