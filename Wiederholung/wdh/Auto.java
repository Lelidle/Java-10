public class Auto
{
   private int anzahlDerRäder;
   private String marke;
   private boolean istKaputt;
   
   public Auto(String markeNeu) {
       anzahlDerRäder = 4;
       marke = markeNeu;
       istKaputt = false;
   }
   
   public Auto(int anzahlDerRäder, 
   String markeNeu, boolean istKaputtNeu) {
       this.anzahlDerRäder = anzahlDerRäder;
       marke = markeNeu;
       istKaputt = istKaputtNeu;
   }
}
