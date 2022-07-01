public class MeinKontoTest {
    //    public MeinKonto (float kontostand, float dispo, float ueberweisungslimit, String kontoinhaber, int kontonummer)
    public static void  main (String[]args){
        MeinKonto k1 = new MeinKonto(10,10,"Can");
        MeinKonto k2 = new MeinKonto(20,20,"Canan");


        float abheben = 500f;
        System.out.println("---Abhebeerrors---");
        try {
            k1.abheben(40);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception q){
            System.out.println("Komischer Fehler");
        }
        try {
            k1.abheben(40);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            k1.abheben(-1);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception q){
            System.out.println("Komischer Fehler");
        }
        try {
            k1.abheben(500);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception q){
            System.out.println("Komischer Fehler");
        }
        System.out.println("---Einzahlmethode errors---");
        try {
            k1.einzahlen(0);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception q){
            System.out.println("Komischer Fehler");
        }
        try {
            k1.einzahlen(-1);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception q){
            System.out.println("Komischer Fehler");
        }
        System.out.println(k1.getKontostand());
        System.out.println(k2.getKontostand());
      //  System.out.println("---Ueberweisenerrors---");
        try {
            k1.ueberweisen(k2, 10);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println(k1.getKontostand());
        System.out.println(k2.getKontostand());

    //    k1.abheben(abheben);

    }

}
