class Anzug {
  private Hose hose;  
  private Weste weste;
  private Sakko sakko;

  public Anzug(Hose h, Weste w, Sakko s) {
    hose = h;
    weste = w;
    sakko = s;
  }
  
  public void positionieren(int x, int y) {
    hose.positionieren(x - 60, y + 160);
    weste.positionieren(x + 95 - 160, y + 10);
    sakko.positionieren(x + 62 - 160, y + 2);
  }
}
