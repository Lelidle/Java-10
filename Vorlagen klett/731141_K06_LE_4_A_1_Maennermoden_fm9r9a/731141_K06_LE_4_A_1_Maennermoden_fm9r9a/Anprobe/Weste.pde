class Weste {
  private int groesse;  
  private String farbe;
  private String stoff;
  private int xpos;
  private int ypos;

  public Weste(int g, String f, String s) {
    groesse = g;
    farbe = f;
    stoff = s;
    xpos = -200;
    ypos = -200;
  }
  
  public void positionieren(int x, int y) {
    xpos = x;
    ypos = y;
  }
  
  public void zeichnen() {
    PImage weste = loadImage("weste.png");
    image(weste, xpos, ypos);
  }
}
