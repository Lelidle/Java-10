public class Bibliothek {
    private String name;
    //Das Array wird für Einträge des Datentyps Regal deklariert
    private Regal[] regale;

    //Wir gehen hier davon aus, dass nur eine Bibliothek verwendet werden soll.
    public Bibliothek() {
        name = "Neumarkter Stadtbibiothek";
        //Das Array wird initialisiert mit Länge 64
        regale = new Regal[64];
        //Das Array wird gefüllt:
        for(int i = 0; i < 64; i++) {
            //Der Einfachheit halber bekommt jedes Regal die Nummer, die 
            //auch den Platz im Array beschreibt, das muss aber nicht so sein!
            regale[i] = new Regal(i);
        }
    }
    
    public Buch ausleihen(int isbn, int mitgliedsnummer) {
        //Es müssen alle 64 Regale durchsucht werden:
        for(int i = 0; i < 64; i++) {
            //Wir versuchen das Buch im Regal zu finden und in der Variable
            //buchGefunden zwischenzuspeichern. Dabei geben wir die Mitgliedsnummer
            //als Übergabeparameter mit, damit das Regal im Buch eintragen kann,
            //wer es ausgeliehen hat.
            //Hinweis: Die buchSuchen-Methode gibt es natürlich noch nicht!
            Buch buch = regale[i].buchSuchen(isbn, mitgliedsnummer);
            //Es kann sein, dass das Buch in diesem Regal nicht war, d.h. wir 
            //überprüfen, ob das buch wirklich existiert oder nur eine
            //Nullreferenz ist (!= bedeute ungleich!):
            if(buch != null) {
                //in diesem Fall existiert das Buch und wir geben es an den Besucher:
                return buch;
            }
        }
        //Haben wir die gesamte Wiederholung durchlaufen und kein Buch gefunden,
        //müssen wir null zurückgeben, am Besten mit einer Fehlermeldung:
        System.out.println("Leider wurde kein passendes Buch gefunden");
        return null;
    }
}