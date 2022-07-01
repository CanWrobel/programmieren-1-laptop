public class AnzahlderStellenRekursiv {
    public static int anzahlderstellen(int n) {
        if (n == 0) return 0;
        else {
            return 1 + anzahlderstellen(n / 10);
        }

    }
    public static void main (String[]args){
        int zahl = 12345678;
        System.out.println(anzahlderstellen(zahl));
    }
}
