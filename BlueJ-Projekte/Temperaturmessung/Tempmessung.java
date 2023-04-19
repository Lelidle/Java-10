public class Tempmessung
{
    private double[] temperatur = new double[365];
    
    public Tempmessung() {
        for(int i = 0; i < temperatur.length; i++) {
            temperatur[i] = Math.random() * 40;
        }
    }
    
    public int wärmsterTag() {
        int tag = 1;
        double höchsteTemp = 0;
        for(int i = 0; i < temperatur.length; i++) {
            if(temperatur[i] > höchsteTemp) {
                höchsteTemp = temperatur[i];
                tag = i + 1;
            }
        }
        return tag;
    }
    
    public double durchschnittsTemperatur() {
        double summe = 0;
        for(int i = 0; i < temperatur.length;i++) {
            summe = summe + temperatur[i];
        }
        double durchschnitt = summe / temperatur.length;
        return durchschnitt;
    }
    
    
    
    
}
