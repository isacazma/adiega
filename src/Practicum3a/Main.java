package Practicum3a;

import Practicum3a.Voetbalclub;

public class Main {
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('v');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('g');

        ajx.verwerkResultaat('w');
        ajx.verwerkResultaat('w');
        ajx.verwerkResultaat('w');
        ajx.verwerkResultaat('0');


        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax punten: " + ajx.aantalPunten());
        System.out.println();
        System.out.println("Feijenoord gespeeld: " + feij.aantalGespeeld());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx.toString());
        System.out.println(feij);
    }
}