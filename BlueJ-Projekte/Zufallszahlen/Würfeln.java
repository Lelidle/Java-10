
public class Würfeln
{


   public int würfeln() {
       while(true) {
           int x = (int) Math.round(Math.random()*7);
           if(x != 0 && x != 7) {
               return x;
           }
        }
   }
   
   public void würfelNMal(int n) {
       int[] ergebnisse = new int[6];
       for(int i = 0; i < n; i++) {
           ergebnisse[würfeln() - 1]++;
       }
       ausgeben(ergebnisse);
       System.out.println("Die relativen Häufigkeiten sind: ");
       for(int i = 0; i < ergebnisse.length; i++) {
           System.out.print(((double)ergebnisse[i])/n + " ");
       }
       System.out.println();
       System.out.println("Die Abweichung von 1/6 beträgt: ");
       double erwartet = 1.0/6;
       for(int i = 0; i < ergebnisse.length; i++) {
           double tatsächlich = ((double)ergebnisse[i])/n;
           double differenz = (tatsächlich-erwartet);
           System.out.println("Bei " + (i+1) + " " + differenz + " ");
       }
   }
   
   private void ausgeben(int[] array) {
       System.out.println();
       System.out.println("Das Array hat folgende Einträge: ");
       for(int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }
   
}
