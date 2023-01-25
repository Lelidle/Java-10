class Sakko {
  private int groesse;  
  private String farbe;
  private String stoff;
  private int xpos;
  private int ypos;

  public Sakko(int g, String f, String s) {
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
    PImage sakko = loadImage("sakko.png");  
    image(sakko, xpos, ypos);
  }
}
