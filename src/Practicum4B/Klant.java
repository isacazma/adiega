package Practicum4B;



public class Klant {
    private String naam ;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }
    public void setKorting(double kor) {
        kortingsPercentage = kor;
    }

    public double getKorting(){ return kortingsPercentage ; }

    public String toString(){

        if (naam == null) {
            naam = "niet aanwezig";
            kortingsPercentage = 0;
        }
        if (naam == " ") {
            naam = "niet aanwezig";
            kortingsPercentage = 0;
        }

        String kal = " u naam is "+ naam + " en u korting is " + kortingsPercentage;
        return kal ;
    }
}

