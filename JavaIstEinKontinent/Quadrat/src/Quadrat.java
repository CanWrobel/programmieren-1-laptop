public class Quadrat {
    private double breite;

    public Quadrat(double breite){
        //ich konstruiere das Quadrat
        if (breite > 0) {
            this.breite = breite;
        }else {
            this.breite = 0;
        }
    }
    public double getBreite(){
        return breite;
    }
    public void setBreite(int breiteset){
        if (breiteset >0) {
            this.breite = breiteset;
        } else {
            this.breite = 0;
        }
    }
    public void skaliereQuadrat(double skalar){
        //skaliert das Quadrat
        this.breite = breite * skalar;
    }
    public double getFlaeche (){
        //die flaeche eines Quadrats als laenge im quadrat
        double flaeche;
        flaeche = breite * breite;
        return flaeche;
    }
    public double berechneDiagonale(){
        //hallo Pythagoras
        double diagonale;
        diagonale = Math.sqrt(breite * breite + breite*breite);
        return diagonale;
    }
    public boolean vergleicheQuadrate(Quadrat q){
        //vergleicht den aufrufer mit der gefütterten Variablen im DT "Quadrat"
        boolean gleich;
        gleich = this.berechneDiagonale() == q.berechneDiagonale();
        return gleich;
    }
    public static String canVergleicheQuadrate(Quadrat q1, Quadrat q2){
        boolean gleich = q1.breite == q2.breite ;
        if (gleich) {
            return " Die Quadrate sind gleich";

        } else {
            return " Die Quadrate sind nicht gleich";
        }
    }


}
