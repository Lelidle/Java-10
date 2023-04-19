public class Schachbrett {
    private Quadrat[][] brett;
    private Kreis[] figuren;
    
    public Schachbrett() {
        brett = new Quadrat[8][8];
        figuren = new Kreis[8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                brett[i][j] = new Quadrat(50);
                brett[i][j].verschieben(i*50, j*50);
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        brett[i][j].farbeSetzen("schwarz");
                    } else {
                        brett[i][j].farbeSetzen("gelb");
                    }
                } else {
                    if(j % 2 == 1) {
                        brett[i][j].farbeSetzen("schwarz");
                    } else {
                        brett[i][j].farbeSetzen("gelb");
                    }
                }
            }
        }
    }
    
    
    public Quadrat[] reiheBauen(int yVerschiebung) {
        Quadrat[] brettreihe = new Quadrat[8];
        for(int i = 0; i < 8;i++) {
            brettreihe[i] = new Quadrat(50);
            if(i % 2 == 0) {
                brettreihe[i].farbeSetzen("schwarz");
            } else {
                brettreihe[i].farbeSetzen("gelb");
            }
            brettreihe[i].verschieben(50*i,yVerschiebung);
        }
        return brettreihe;
    }
    
}