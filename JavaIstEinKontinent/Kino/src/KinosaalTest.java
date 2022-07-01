public class KinosaalTest {
    public static void main (String[]args){
        Kinosaal ks1 = new Kinosaal();
        ks1.setSaalNummer(1);
        System.out.println(ks1.getSaalNummer());
        ks1.setAnzahlSitzplaetzeSaal(35);

        Kinosaal ks2 = new Kinosaal();
        ks2.setSaalNummer(2);
        ks2.setAnzahlSitzplaetzeSaal(50);

        Kinosaal ks3 = new Kinosaal();
        ks3.setSaalNummer(3);
        ks3.setAnzahlSitzplaetzeSaal(100);

        System.out.println("SaalNr: " + ks1.getSaalNummer() + " hat " + ks1.getAnzahlSitzplaetzeSaal() + " Sitzpl.");
        System.out.println("SaalNr: " + ks2.getSaalNummer() + " hat " + ks2.getAnzahlSitzplaetzeSaal() + " Sitzpl.");
        System.out.println("SaalNr: " + ks3.getSaalNummer() + " hat " + ks3.getAnzahlSitzplaetzeSaal() + " Sitzpl.");
        System.out.println("Gesamtzahl d. Sitze: " + Kinosaal.getAnzahlSitzplaetzeKino());
        System.out.println("Anzahl der Kinosaele: " + Kinosaal.getAnzahlKinosaele());

    }
}
