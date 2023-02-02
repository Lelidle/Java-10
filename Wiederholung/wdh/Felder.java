
public class Felder
{
   
    public static void wirTesten() {
        System.out.println();
        int a = 5;
        int[] name = new int[6];
        String[] strings = new String[7];
        boolean[] bools = {true, false, true};
        name[1] = 17;
        strings[2] = "10a";
        for(int i = 0; i < name.length; i = i + 1) {
            name[i] = name[i] + 5;
        }
        for(int i = 0; i < name.length; i = i + 1) {
            System.out.println(name[i]);
        }
        //Zufallszahl zwischen 0 und 1 (1 ausgeschlossen).
        double random = Math.random();
        //Hausaufgabe: S. 204|1
    }
    
    

}
