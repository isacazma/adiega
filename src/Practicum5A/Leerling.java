package Practicum5A;


public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling (String nm){
        naam = nm;
    }

    public String getnaam(){
        return  naam;
    }



    public void setcijfer(double cf){
        cijfer = cf;

    }

    public String toString(){
        return   naam + " heeft cijfer: " + cijfer;
    }
}
