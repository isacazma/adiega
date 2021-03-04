package Practicum6a;


import java.util.ArrayList;
public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;
    private ArrayList<Game> nogNietInBezit;

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
        mijnGames = new ArrayList<Game>();



    }

    public double getBudget() {
        return budget;
    }


    public boolean koop(Game t) {
        if (!mijnGames.contains(t) && budget >= t.huidigeWaarde()) {
            mijnGames.add(t);
            budget = budget - t.huidigeWaarde();
            return true;
        } else {
            return false;
        }
    }

    public boolean verkoop(Game t, Persoon koper) {
        if (mijnGames.contains(t) && koper.koop(t)) {
            mijnGames.remove(t);
            budget = budget + t.huidigeWaarde();
            System.out.println(koper);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teKoop) {
        nogNietInBezit = new ArrayList<Game>();
        for (Game a : teKoop) {
            for (Game i : mijnGames) {
                if (!a.equals(i) && !nogNietInBezit.contains(a)) {
                    nogNietInBezit.add(a);
                }
            }

        }
        return nogNietInBezit; }


    public String toString() {
        String dc = naam + " heeft een budget van €" + ( String.format("%.2f", getBudget())) + " en bezit de volgende games:" ;
        for (Game D : mijnGames) {
            dc =   dc  + "\n" + D  ;
        }
        return dc;
                //naam + "  heeft een budget van " + getButget() + " en bezit de volgende games:" + mijnGames ;
    }
}