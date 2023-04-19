public class Menü {
    private String name;
    private int tag;
    private Vorspeise vorspeise;
    private Hauptspeise hauptspeise;
    private Nachspeise nachspeise;
    
    public Menü(String name, Vorspeise vorspeise, Hauptspeise hauptspeise, Nachspeise nachspeise) {
        this.vorspeise = vorspeise;
        this.hauptspeise = hauptspeise;
        this.nachspeise = nachspeise;
        this.name = name;
    }
    
    public void vorspeiseEssen() {
        if(vorspeise != null) {
            System.out.println("lecker -  " + vorspeise.gibName());
            vorspeise = null;
        } else {
            System.out.println("Die Vorspeise wurde schon gegessen!");
        }
    }
    
    public void hauptspeiseEssen() {
        if(vorspeise != null) {
            System.out.println("lecker - " + hauptspeise.gibName());
            hauptspeise = null;
        } else {
            System.out.println("Die Hauptspeise wurde schon gegessen!");
        }
    }
    
    public void nachspeiseEssen() {
        if(vorspeise != null) {
            System.out.println("lecker - " + nachspeise.gibName());
            nachspeise = null;
        } else {
            System.out.println("Die Nachspeise wurde schon gegessen!");
        }
    }
}