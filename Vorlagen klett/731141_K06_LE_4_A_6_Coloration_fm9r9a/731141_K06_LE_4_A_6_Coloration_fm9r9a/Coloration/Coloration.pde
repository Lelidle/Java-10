private ColorPiekser[] piekser;

public void settings() {
  size(600, 600);
}

public void setup() {  
  Target tar = new Target();
  piekser = new ColorPiekser[10];
  for (int i = 0; i < 10; i++) {
    // (1)
    // piekser[i]=new ColorPiekser(tar);
    // (2)
    piekser[i] = new ColorPiekser(new Target());
  }  
}

public void draw() { 
  background(0, 0, 0);
  for (int i = 0; i < 10; i++) {
    piekser[i].bewegen();
    piekser[i].pieksen();
    piekser[i].zeichnen();
  }   
}
