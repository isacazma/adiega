package Practicum3a;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm) {
        naam = nm;
        if (naam == null || naam.equals("")) {
            naam = "FC";
        }

    }


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
        return aantalGelijk + aantalGewonnen * 3;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public String toString() {

        return naam + "  " + aantalGespeeld() + "  " + aantalGewonnen + "  " + aantalGelijk + "  " + aantalVerloren + "  " + aantalPunten();


    }


}
