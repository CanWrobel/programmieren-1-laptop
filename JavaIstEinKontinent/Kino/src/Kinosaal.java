public class Kinosaal {
    private int saalNummer; //instanzvariablen auf private setzen
    private int anzahlSitzplaetzeSaal;

    private static int  anzahlSitzplaetzeKino = 0;
    private static int anzahlKinosaele;

    public void setSaalNummer (int saalNummer){
        anzahlKinosaele++;
        this.saalNummer = saalNummer;

    }
    public void setAnzahlSitzplaetzeSaal (int anzahlSitzplaetzeSaal){
        anzahlSitzplaetzeKino = anzahlSitzplaetzeKino + anzahlSitzplaetzeSaal;
        this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;

    }
    public int getSaalNummer() {
        return saalNummer;
    }
    public int getAnzahlSitzplaetzeSaal() {
        return anzahlSitzplaetzeSaal;
    }
    public static int getAnzahlSitzplaetzeKino(){
        return anzahlSitzplaetzeKino;
    }
    public static int getAnzahlKinosaele(){
        return anzahlKinosaele;
    }
}
