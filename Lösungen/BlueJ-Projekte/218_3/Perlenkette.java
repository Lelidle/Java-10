public class Perlenkette {
    
    private Kreis[] perlen;
    
    //a)
    public Perlenkette() {
        //Das Array wird initialisiert
        perlen = new Kreis[12];
        //Das Array wird durchlaufen...
        for(int i = 0; i < perlen.length; i++) {
            //und an jeder Stelle des Arrays wird ein neuer Kreis gespeichert
            //Der Konstruktor eines Kreises nimmt als Eingabeparameter den Radius
            perlen[i] = new Kreis(10);
            //Jetzt müssen die Perlen noch abhängig von ihrer Position in der Kette
            //verschoben werden, dazu wird die "verschieben"-Methode der einzelnen 
            //Kreise verwendet
            perlen[i].verschieben(2*10*i,0);
            //die i-te Kugel muss dabei um i mal den Durchmesser einer Kugel verschoben werden
        }
    }
    
    //b)
    public Perlenkette(int anzahl) {
        //Die relevante Änderung, das Array wird so groß wie gewünscht erzeugt
        //Nicht gefordert in der Aufgabenstellung, aber sinnvoll: 
        //eine Überprüfung, ob die Eingabe sinnvoll ist! 
        //Wenn die Anzahl kleiner oder gleich 0 ist...
        if(anzahl <= 0) {
            //... wird die Anzahl auf 5 festgelegt-
            anzahl = 5;
        }
        perlen = new Kreis[anzahl];
        for(int i = 0; i < perlen.length;i++) {
            perlen[i] = new Kreis(10);
            perlen[i].verschieben(2*10*i, 0);
        }
}
    
    //c)
    public void farbeSetzen(int nummer, String farbe) {
        //zunächst wird geprüft, ob die eingegeben Zahl innerhalb der Feldgrenzen liegt
        if(nummer < 0 || nummer >= perlen.length) {
            System.out.println("Diese Perle gibt es nicht!");
            //falls nicht wird eine Meldung ausgegeben und beendet!
            return;
        }
        //Andernfalls wird die Perle (der Kreis) an der Stelle "nummer" mit Hilfe der
        //Kreis-Methode farbeSetzen (deswegen Punktnotation!) auf die übergebene
        //Farbe gesetzt
        perlen[nummer].farbeSetzen(farbe);
    }
    
    public void radiusSetzen(int nummer, double radius) {
        if(radius <= 0) {
            System.out.println("Der Radius ist zu klein!");
            return;
        }
        //Wir speichern den alten Radius der Kugel in einer Variable (also einer Art) 
        //"Zwischenspeicher" ab, dazu verwenden wir die radiusGeben()-Methode des Kreises
        double alterRadius = perlen[nummer].radiusGeben();
        //Dann verschieben wir zuerst die vergrößerte (verkleinerte) Perle:
        perlen[nummer].verschieben(radius-alterRadius, 0);
        //Wir verwenden hier die Differenz, da der Kreis nicht seinen neuen Radius weiterwandern muss,
        //sondern nur den Wert, um den er größer bzw. kleiner geworden ist. 
        //Danach müssen noch alle anderen Perlen angepasst werden, außer wir haben die 
        //letzte Perle vergrößert (Spezialfall!):
        if(nummer == perlen.length - 1) {
            //In diesem Fall sind wir fertig und können abbrechen
            return;
        }
        //Andernfalls verschieben wir ab der Perle "nummer + 1", wollen wir also z.B.
        //die fünfte Perle von 10 verschieben, müssen die Perlen 6 bis 10 verschoben werden.
        for(int i = nummer + 1; i <perlen.length; i++) {
            //Es muss wieder um die Differenz verschoben werden, aber diesmal zweimal
            //(da der Kreis ja auf beiden Seiten um die Differenz geschrumpft bzw
            //gewachsen ist!)
            perlen[i].verschieben(2*(radius-alterRadius),0);
        }
    }
    
    //e)
    public void positionSetzen(double mitteX0, double mitteY0) {
        //Die erste Perle in der Reihe wird an die neue Position gesetzt
        perlen[0].mittelpunktSetzen(mitteX0, mitteY0);
        //Ab der zweiten Perle muss nachgezogen werden!
        for(int i = 1; i < perlen.length; i++) {
            //Für die jeweils i-te Perle (also perlen[i]) setzen wir den neuen Mittelpunkt, indem wir uns von der 
            //vorangehenden Perle (also perlen[i-1]) Informationen holen.
            //x-Richtung: Wir starten beim Mittelpunkt der vorangehenden Perle (mitteXGeben()) 
            //und laufen dann den Radius der vorangehenden Perle und dann den Radius
            //der aktuellen Perle
            //y-Richtung: Wir bleiben auf derselben Höhe, verwenden also einfach mitteY0
            //Für eine bessere Übersichtlichkeit ist der Methodenaufruf hier auf 
            //mehrere Zeilen verteilt
            perlen[i].mittelpunktSetzen(
                perlen[i-1].mitteXGeben() 
                + perlen[i-1].radiusGeben()
                + perlen[i].radiusGeben(),
                mitteY0
            );
        }
    }

    public void anordnungSetzen(char art) {
        //Fr die horizontale Anordnung...
        if(art == 'h') {
            //wird aber der zweiten perle verschoben
            for(int i = 1; i <perlen.length;i++) {
                //und zwar genauso wie in der vorangegabenen Methode!
                //Der einzige Unterschied: die y-Position der vorangehenden Perle
                //ist kein Eingabeparameter mehr, sondern muss geholt werden
                    perlen[i].mittelpunktSetzen(
                    perlen[i-1].mitteXGeben() 
                    + perlen[i-1].radiusGeben() 
                    + perlen[i].radiusGeben(),
                    perlen[i-1].mitteYGeben()
                );
            }
        } else if(art == 'v') {
            //Für die vertikale Anordnung wird in y-Richtung, statt in x-Richtung verschoben
            //ansonsten ist alles analog
            for(int i = 1; i <perlen.length;i++) {
                perlen[i].mittelpunktSetzen(
                    perlen[i-1].mitteXGeben(),
                    perlen[i-1].mitteYGeben() 
                    + perlen[i-1].radiusGeben()
                    + perlen[i].radiusGeben()
                );
            }
        } else if(art == 'd') {
            //Für die Diagonale muss natürlich in beide Richtungen verschoben werden
            for(int i = 1; i <perlen.length;i++) {
                //Die eigentliche Verschiebung ist eigentlich ein mathematisches Problem
                //In diesem Fall brauchen wir natürlich wieder beide Radien, für eine
                //bessere Übersichtlichkeit speichern wir sie zwischen:
                double radiusAlt = perlen[i-1].radiusGeben();
                double radiusNeu = perlen[i].radiusGeben();
                //Überlegt man sich die Verschiebung geometrisch, so stellt man fest, 
                //dass eine Verschiebung um "Wurzel 2 geteilt durch 2" nötig wäre.
                //Für unsere Zwecke ist aber eine Näherung von 0,7 völlig ausreichend
                perlen[i].mittelpunktSetzen(
                    perlen[i-1].mitteXGeben() + 0.7*(radiusAlt + radiusNeu),
                    perlen[i-1].mitteYGeben() + 0.7*(radiusAlt + radiusNeu)
                );
            }
        } else {
            //Falls keine der Anordnungen passt wird einfach nichts gemacht!
            System.out.println("Die Anordnung ist nicht möglich");
        }
    }
    
}