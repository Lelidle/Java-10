public class Zeitarithmetik
{
    //Hinweis: Es wird nur eine Zeit gespeichert, 
    //die zweite Zeit als Übergabeparameter übergeben
    private int stunde;
    private int minute;
    private int sekunde;
    
    public Zeitarithmetik(int stunde, int minute, int sekunde) {
        this.stunde = stunde;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    
    public void addieren(int stundeNeu, int minuteNeu, int sekundeNeu) {
        stunde += stundeNeu;
        minute += minuteNeu;
        sekunde += sekundeNeu;
        
        if(sekunde >= 60) {
            minute += sekunde / 60;
            sekunde = sekunde % 60;
        }
        
        if(minute >= 60) {
            stunde += minute / 60;
            minute = minute % 60;
        }
        
        stunde = stunde % 24;
    }
}
