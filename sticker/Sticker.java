package sticker;

public class Sticker {
    
    protected String name;
    protected int nummer;
    protected String spezialEigenschaft;
    

    public Sticker( int nummer, String name) {
        this.name = name;
        this.nummer=nummer;
        spezialEigenschaft = "";
    }

    public Sticker(int nummer,String name, String spezial) {
        this.name = name;
        this.nummer=nummer;
        spezialEigenschaft = spezial;
    }


    public boolean istSpeziell() {
        if(spezialEigenschaft != "") return true;
        return false;
    }

    public int gibNummer() {
        return nummer;
    }

    public String gibName() {
        return name;
    }

}
