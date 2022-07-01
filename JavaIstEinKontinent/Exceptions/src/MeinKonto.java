public class MeinKonto {
    private float kontostand;
    private float dispo;
    private float ueberweisungslimit;
    private String kontoinhaber;
    private int kontonummer;

    public MeinKonto(float kontostand, float dispo, String kontoinhaber) {
        this.kontostand = kontostand;
        this.dispo = dispo;
        this.kontoinhaber = kontoinhaber;
    }

    public float getKontostand (){
        return kontostand;
    }
    public void abheben (float abhebungsbetrag) throws IllegalArgumentException {
            if (abhebungsbetrag < 0)
                throw new IllegalArgumentException("Sie koennen kein minus Geld abheben.\t\tAbhebungsbetrag " + abhebungsbetrag);
            if (abhebungsbetrag > (kontostand + (Math.sqrt(dispo*dispo))))
                throw new IllegalArgumentException("Kann nicht abheben, da Dispo ausgereizt.\tAbhebungsbetrag " + abhebungsbetrag);
            if (abhebungsbetrag == 0)
                throw new IllegalArgumentException("Du kannst nicht null Geld abheben.\t\t\tAbhebungsbetrag " + abhebungsbetrag);

        kontostand = kontostand - abhebungsbetrag;

    }
    public void einzahlen (float einzahlbetrag) throws IllegalArgumentException {
            if (einzahlbetrag < 0 )
                throw new IllegalArgumentException("Einzahlbetrag darf nicht negativ sein.\t\t\tEinzahlbetrag " + einzahlbetrag);
            if (einzahlbetrag == 0)
                throw new IllegalArgumentException("Einzahlbetrag ist null. Das geht doch nicht.\tEinzahlbetrag " + einzahlbetrag);
        kontostand = kontostand + einzahlbetrag;

    }
    public void ueberweisen (MeinKonto b, float ueberweisungsbetrag) throws IllegalArgumentException {
            if (ueberweisungsbetrag < 0)
                throw new IllegalArgumentException("Ueberweisungsbetrag ist negativ und darf so nicht sein");
            if ((kontostand + (Math.sqrt(dispo*dispo))) < ueberweisungsbetrag )
                throw new IllegalArgumentException("Ueberweisung sprengt Dispo");
            kontostand = this.kontostand - ueberweisungsbetrag;
            b.kontostand = b.kontostand + ueberweisungsbetrag;

       // kontostand = kontostand - ueberweisungsbetrag;

    }

}
