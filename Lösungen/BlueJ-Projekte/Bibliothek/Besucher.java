public class Besucher {
    private int mitgliedsnummer; 
    //Wir deklarieren ein Array vom Typ Buch 
    private Buch[] ausgelieheneBücher;
    private String name;
    //Eine Referenz auf ein Bibiotheksobjekt wird deklariert:
    private Bibliothek bib;
    //die Anzahl der bisher ausgeliehenen Bücher als Hilfsattribut:
    private int anzahlAusgeliehen;

    public Besucher(String nameNeu, int mitgliedsnummerNeu, Bibliothek bibNeu) {
        name = nameNeu;
        mitgliedsnummer = mitgliedsnummerNeu;
        //Wir initialisieren das Array, d.h. wir teilen Java mit,
        //dass wir ein Array der Länge 6 haben möchten, dass mit Referenzen
        //zu Büchern gefüllt werden kann. Das Array ist aber noch "leer"!
        ausgelieheneBücher = new Buch[6];
        bib = bibNeu;
        //Am Anfang sind 0 Bücher ausgeliehen:
        anzahlAusgeliehen = 0;
    }

    public void ausleihen(int isbn) {
        //Wir leihen uns ein Buch aus der Bibiothek, indem wir die (noch zu definierende)
        //Methode ausleihen auf dem Bibliotheks-Objekt aufrufen: 
        Buch geliehenesBuch = bib.ausleihen(isbn, mitgliedsnummer);
        //und speichern es in unserem Array, an einer noch freien Stelle.
        //praktischerweise ist die Anzahl der bisher ausgeliehenen Bücher
        //eine passende Stelle!
        ausgelieheneBücher[anzahlAusgeliehen] = geliehenesBuch;
        //Dann müssen wir noch die Variable hochzählen:
        anzahlAusgeliehen++;
    }
}