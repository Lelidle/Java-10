public class Pseudocode
{
    boolean volljährig;
    
    public void methodeA(int a, int b) {
        int anzahl = 0;
        while(a < b) {
            b = b - a;
            anzahl++;
        }
        System.out.println("Rest: " + b);
    }
    
    public void methodeB(int n) {
        String Note = "";
        if( n == 1) {
            Note = "sehr gut";
        } else if(n == 2) {
            Note = "gut";
        } else if (n == 3) {
            Note = "befriedigend";
        } else if (n == 4) {
            Note = "ausreichend";
        } else if (n == 5) {
            Note = "mangelhaft";
        } else if (n == 6) {
            Note = "ungenügend";
        }
        System.out.println(Note);
    }
    
    public void methodeC(int alter) {
        if(alter > 0) {
            volljährig = true;
        } else {
            volljährig = false;
        }
    }
    
    public void methodeD(double x) {
        double y = 0;
        if(x >= 0) {
            y = Math.sqrt(x);
        }
        System.out.println(y);
    }
}
