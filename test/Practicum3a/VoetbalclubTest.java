package Practicum3a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {


    @Test
    void voetbalnakijkenFC() {

        Voetbalclub fc = new Voetbalclub(null);
        assertEquals("FC  0  0  0  0  0", fc.toString());

    }

    @Test
    void gewonnen() {
        Voetbalclub win = new Voetbalclub("winer");
        win.verwerkResultaat('w');
        assertEquals("winer  1  1  0  0  3", win.toString());

    }

    @Test
    void verlies() {
        Voetbalclub losser = new Voetbalclub("loser");
        losser.verwerkResultaat('v');
        assertEquals("loser  1  0  0  1  0", losser.toString());

    }

    @Test
    void gelijk() {
        Voetbalclub midden = new Voetbalclub("midde");
        midden.verwerkResultaat('g');
        assertEquals("midde  1  0  1  0  1", midden.toString());

    }

    @Test
    void gelijk1() {
        Voetbalclub midden1 = new Voetbalclub("midde");
        midden1.verwerkResultaat('G');
        assertEquals("midde  0  0  0  0  0", midden1.toString());


    }

    @Test
    void respectievelijk() {
        Voetbalclub respectie = new Voetbalclub("respectieV");
        respectie.verwerkResultaat('g');
        respectie.verwerkResultaat('w');
        respectie.verwerkResultaat('v');
        assertEquals("respectieV  3  1  1  1  4", respectie.toString());

    }

    @Test
    void respectievelijk1() {
        Voetbalclub respectie1 = new Voetbalclub("respectie1");
        respectie1.verwerkResultaat('g');
        respectie1.verwerkResultaat('w');
        respectie1.verwerkResultaat('v');
        assertEquals("respectie1  3  1  1  1  4", respectie1.toString());

    }
}
