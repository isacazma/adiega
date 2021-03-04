package Practicum4B;

public class AutoHuur {

        private int aantalDagen;
        private Auto gehuurdeAuto;
        private Klant huurder;
        public AutoHuur() {}

        public void setAantalDagen(int aD) {aantalDagen = aD;}

        public int getAantalDagen() {return aantalDagen;}

        public void setGehuurdeAuto(Auto gA) {gehuurdeAuto = gA;}

        public Auto getGehuurdeAuto() { return gehuurdeAuto ;}

        public void setHuurder(Klant h) {huurder = h;}

        public Klant getHuurder() {return huurder;}

    public double totaalPrijs(){
        double totaal ;
        if (gehuurdeAuto == null){
            totaal = 0;}
        else if (huurder == null){
            totaal = 0 ; }
        else{
            double totaalkorting = aantalDagen * gehuurdeAuto.getPrijsPerDag()/ 100 * huurder.getKorting();
            totaal = aantalDagen * gehuurdeAuto.getPrijsPerDag() - totaalkorting;}
        return totaal;}


        public String toString() {
            String out = "autotype: " + gehuurdeAuto;
            if (gehuurdeAuto == null)
                out = "er is geen auto bekend";
            if (huurder != null)
                out = out + "\n" + huurder;
            else
                out = out + "\ner is geen huurder bekend";
            out = out + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            return out;
        }
    }


