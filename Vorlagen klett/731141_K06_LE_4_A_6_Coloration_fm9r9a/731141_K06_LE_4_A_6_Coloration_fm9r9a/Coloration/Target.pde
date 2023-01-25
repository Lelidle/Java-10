class Target {
  private int xpos;
  private int ypos;
  private int[] farbe;
  
  public Target() {
    xpos = round(random(100, 500));
    ypos = round(random(100, 500));
    farbe = new int[3];
    farbe[0] = 30;
    farbe[1] = 30;
    farbe[2] = 30;
  }
  
  public void zeichnen() {
    fill(farbe[0], farbe[1], farbe[2]);
    ellipse(xpos, ypos, 100, 100);
  }
  
  public void farbeSetzen(int[] f) {
    // Ergänzen.
  }
  
  public int xposGeben() {
    // Ergänzen.
  }
  
  public int yposGeben() {
    // Ergänzen.
  }
}
