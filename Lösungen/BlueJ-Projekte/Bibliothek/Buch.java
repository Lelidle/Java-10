public class Buch {
    private int isbn;
    private int ausgeliehenAn;
    private boolean ausgeliehen;

    public Buch(int isbnNeu) {
        //Die isbn muss zwingend bei der Eingabe eingegeben werden
        isbn = isbnNeu;
        //Am Anfang ist das Buch aber natürlich nicht ausgeliehen
        //Man könnte statt -1 auch 0 nehmen, wenn man die Mitgliedsnummern
        //bei 1 beginnen lässt.
        ausgeliehenAn = -1;
        ausgeliehen = false;
    }
    
    //Die zwei getter:
    public int gibIsbn() {
        return isbn;
    }
    
    public boolean istAusgeliehen() {
        return ausgeliehen;
    }
    
    //wenn das Buch ausgeliehen wird, wird die Mitgliedsnummer hinterlegt
    //und das Attribut auf true gesetzt
    public void wirdAusgeliehen(int mitgliedsnummer) {
        ausgeliehenAn = mitgliedsnummer;
        ausgeliehen = true;
    }
    
}