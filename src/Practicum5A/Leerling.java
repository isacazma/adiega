package Practicum5A;
import java.util.ArrayList;
// import nodig om een lijst te gebruiken!
import java.util.*;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling (String nm){
        naam = nm;
    }

    public String getnaam(){
        return  naam;
    }

    public double getcijfer(){
        return cijfer;
    }

    public void setcijfer(double cf){
        cijfer = cf;

    }

    public String toString(){
        return   naam + " heeft cijfer: " + cijfer;
    }
}
