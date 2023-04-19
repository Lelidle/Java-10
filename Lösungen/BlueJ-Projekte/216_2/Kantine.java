public class Kantine {
    
    public Kantine() {
        Hauptspeise hauptspeise1 = new Hauptspeise("Schnitzel", 9.6);
        Hauptspeise hauptspeise2 = new Hauptspeise("Schnitzel", 9.6);
        Vorspeise vorspeise1 = new Vorspeise("Suppe", 5.2);
        Vorspeise vorspeise2 = new Vorspeise("Suppe", 5.2);
        Nachspeise nachspeise1 = new Nachspeise("Apfelstrudel", 6.10);
        Nachspeise nachspeise2 = new Nachspeise("Apfelstrudel", 6.10);
        Menü menü1 = new Menü("Super Menü", vorspeise1, hauptspeise1, nachspeise1);
        Menü menü2 = menü1;
        Menü menü3 = new Menü("Super Menü", vorspeise2, hauptspeise2, nachspeise2);
    }
}