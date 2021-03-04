package Practicum4B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {


    @Test
    void geenautonr1() {
        AutoHuur huurtje = new AutoHuur();
        Klant Klantje = new Klant("Harry potter");
        huurtje = new AutoHuur();
        Klantje.setKorting(10.0);
        huurtje.setHuurder(Klantje);
        assertEquals("er is geen auto bekend\n" +
                        " u naam is Harry potter en u korting is 10.0\n" +
                        "aantal dagen: 0 en dat kost 0.0",
                huurtje.toString());
    }

    @Test
    void geenklant() {
        AutoHuur huurtje = new AutoHuur();
        Auto Autootje = new Auto("Peugeot 207", 50);
        huurtje.setGehuurdeAuto(Autootje);
        huurtje.setAantalDagen(4);
        assertEquals("autotype: de auto isPeugeot 207 de prijs per dag is 50.0\n" +
                        "er is geen huurder bekend\n" +
                        "aantal dagen: 4 en dat kost 0.0",
                huurtje.toString());

    }

    @Test
    void geenhuurenauto() {
        AutoHuur huurtje = new AutoHuur();
        assertEquals("er is geen auto bekend\n" +
                        "er is geen huurder bekend\n" +
                        "aantal dagen: 0 en dat kost 0.0",
                huurtje.toString());
    }


}