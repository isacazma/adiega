package Practicum6a;

import java.time.LocalDate;
public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;
    public Game (String nm, int rJ, double nwpr){
        naam=nm;
        releaseJaar=rJ;
        nieuwprijs=nwpr;
    }
    public String getNaam(){
        return naam;
    }
    public double huidigeWaarde() {
        int delta= LocalDate.now().getYear()-releaseJaar;
        double factor=Math.pow(0.70, delta);
        double e = nieuwprijs * factor;
        return e;
         }

    public boolean equals(Object andereObject) {
        boolean op = false;
        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;
            if (this.naam.equals(andereGame.naam) &&
                    this.releaseJaar== andereGame.releaseJaar) {
                op = true;
            }
        }
        return op;
    }
    public String toString() {
        String s = naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €";
        s += ( String.format("%.2f",nieuwprijs) + " nu voor: €" + ( String.format("%.2f",huidigeWaarde())));
        return s;
    }
}
