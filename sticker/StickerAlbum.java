package sticker;

public class StickerAlbum {
    
    private String name;
    private Sticker[] album;
    private double geldAusgegeben;
    private int anzahlZusätzliche;
    private double aktuelleGeldmenge;
    private double preisProPackung;
    private StickerVerkäufer verkäufer;

    public StickerAlbum(int kartenzahl) {
        name = "PokemonAlbum";
        album = new Sticker[kartenzahl];
        aktuelleGeldmenge = 50;
        preisProPackung = 5.99;
        verkäufer = new StickerVerkäufer();
    }

    public void stickerKaufen(double geldmenge) {
        if(geldmenge > aktuelleGeldmenge) {
            System.out.println("Das kannst du dir gerade nicht leisten!");
            return;
        }
        int anzahl = (int) Math.floor(geldmenge/preisProPackung);
        aktuelleGeldmenge -= anzahl*preisProPackung;
        geldAusgegeben += anzahl*preisProPackung;
        for(int i = 0; i < anzahl; i++) {
            Sticker[] sticker = verkäufer.packungKaufen();
            for(Sticker s : sticker) {
                int position = s.gibNummer();
                if(album[position] == null) {
                    album[position] = s;
                } else {
                    anzahlZusätzliche++;
                }
            }
        }
    }

    public void berechneFüllstand(){
        int anzahl = 0;
        for(int i = 0; i < album.length; i++) {
            if(album[i] instanceof Sticker) {
                anzahl++;
            }
        }
        System.out.println("Der aktuelle Zustand von " + name);
        System.out.println("Es sind " + anzahl + " von insgesamt " + album.length + " Stickern im Album.");
        System.out.println("Es wurden " + geldAusgegeben + " Euro ausgegeben.");
        System.out.println("Es kamen " + anzahlZusätzliche + " Sticker doppelt vor");
        System.out.println("Es sind " + berechneAnzahlSpeziell() + " Sticker golden!");
    }

    public int berechneAnzahlSpeziell() {
        int anzahl = 0;
        for(int i = 151; i < 168; i++) {
            if(album[i] instanceof Sticker) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public void einzahlen(double guthaben) {
        aktuelleGeldmenge += guthaben;
    }

    public void druckeAlbum() {
        for(int i = 0; i < album.length; i++) {
            if(album[i] != null) {
                System.out.println(album[i].gibInfos());
            }
        }
    }

}
