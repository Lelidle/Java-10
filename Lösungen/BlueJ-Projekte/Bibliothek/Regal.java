public class Regal {
    private int nummer;
    //Das Array wird für Einträge des Datentyps Buch deklariert
    private Buch[] bücher;

    public Regal(int nummerNeu) {
        nummer = nummerNeu;
        //Das Array wird initialisiert mit Länge 32
        bücher = new Buch[32];
        //Wir erzeugen die Bücher, damit die ISBN-Nummern der Bücher 
        //unterschiedlich sind kann z.B. die nummer des Regals als
        //Hunderterziffer verwendet werden (das ist natürlich willkürlich
        //und könnte auch anders gelöst werden!)
        for(int i = 0; i < 32; i++) {
            //nummerNeu*100 gibt uns den "Hunderterbereich" in dem die ISBN
            //liegt, dann addieren wir i, damit alle unterschiedlich sind
            bücher[i] = new Buch(nummerNeu*100+i);
        }
    } 
    
    public Buch buchSuchen(int isbn, int mitgliedsnummer) {
        //Alle Bücher werden untersucht:
        for(int i = 0; i < 32; i++) {
            //Wir überprüfen die ISBN-Nummer, indem wir auf dem in buecher[i]
            //gespeicherten Objektreferenz den getter aufrufen.
            if(bücher[i].gibIsbn() == isbn) {
                //Als nächstes überprüfen wir, ob das Buch ausgeliehen ist 
                //mit einem weiteren Getter:
                if(bücher[i].istAusgeliehen() == true) {
                    //Falls das Buch ausgeliehen ist geben wir null und eine Fehlermeldung aus
                    System.out.println("Das Buch ist leider ausgeliehen");
                    return null;
                } else {
                    //Falls nicht, dann setzen wir alle notwendigen Attribute 
                    //und geben das Buch zurück:
                    bücher[i].wirdAusgeliehen(mitgliedsnummer);
                    return bücher[i];
                }
            } 
        }
        //Falls wir das Buch nicht finden, müssen wir null zurückgeben, aber 
        //keine Fehlermeldung, es könnte noch in einem anderen Regal sein!
        return null;
    }
}