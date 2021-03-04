package Practicum3B;

public class Cirkel {
    private int radius;
    private int xpositie;
    private int ypositie;

    public Cirkel(int rd,int x , int y) {
        radius = rd;
        xpositie = x;
        ypositie = y;

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }
        public String toString(){

        return "cirkel" + " " + "(" + xpositie +","+ " " +ypositie + ")"+ " "+"met radius:" +" " + radius;
    }
}


//Radius moet groter dan 0 zijn!
//cirkel (0, 0) met radius: 10
//null