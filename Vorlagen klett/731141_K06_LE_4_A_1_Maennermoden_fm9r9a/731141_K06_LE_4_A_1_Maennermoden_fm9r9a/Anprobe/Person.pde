class Person {
  int xpos;
  int ypos;
  String name;
  
  public Person(int x, int y, String n) {
    xpos = x;
    ypos = y;
    name = n;
  }
  public void anziehen(Anzug a) {    
    a.positionieren(xpos, ypos);
  }
  
  public void zeichnen() {
    fill(0, 0, 0);
    text(name, xpos, 560);
    line(xpos, 60, xpos, 260);
    line(xpos - 70, 90, xpos + 70, 90);
    line(xpos - 70, 90, xpos - 70 ,300);
    line(xpos + 70, 90, xpos + 70, 300);
    line(xpos - 30, 260, xpos + 30, 260);
    line(xpos - 30, 260, xpos - 30, 500);
    line(xpos + 30, 260, xpos + 30, 500);
    ellipse(xpos, 28, 50, 50);
  }
}
