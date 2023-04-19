public class Auto
{
   private int anzahlDerRäder;
   private String marke;
   private boolean istKaputt;
   private Motor motor; 
   
   public Auto(String markeNeu) {
       anzahlDerRäder = 4;
       marke = markeNeu;
       istKaputt = false;
       motor = new Motor();
   }
   
   public void fahren() {
       System.out.println("Das Auto macht:");
       if(istKaputt == false) {
           motor.fahren();
        } else {
          motor.geräuschKaputt();
        }
   }
   public void unfall() {
       istKaputt = true;
   }
   public Auto(int anzahlDerRäder, 
   String markeNeu, boolean istKaputtNeu) {
       this.anzahlDerRäder = anzahlDerRäder;
       marke = markeNeu;
       istKaputt = istKaputtNeu;
   }
}
