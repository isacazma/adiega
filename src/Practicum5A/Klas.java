package Practicum5A;
import java.util.ArrayList;
import java.util.*;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> Leerlingen;
    public Klas(String kC) {
        klasCode = kC;
        Leerlingen = new ArrayList<Leerling>();
    }
    public String getklas() {
        return klasCode;
    }
    public void voegLeerlingToe(Leerling l) {
        Leerlingen.add(l);
    }
    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling d: Leerlingen) {
            if (nm.equals(d.getnaam())){
                d.setcijfer(nweCijfer);}
        }
    }
    public ArrayList<Leerling> getLeerlingen() {
        return Leerlingen;
    }
    public int aantalLeerlingen() {
        return Leerlingen.size();
    }
    public String toString() {
        String s= "In klas " + getklas() + " zitten de volgende leerlingen:";
        for (Leerling l : Leerlingen) {
            s=   s  + "\n" +l  ;
        }
        return  s + "\n";
    }
}