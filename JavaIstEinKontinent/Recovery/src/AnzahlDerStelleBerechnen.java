public class AnzahlDerStelleBerechnen {
    public static int Anzahlderstellen(int eingabe){
        int count = 0;
        while (eingabe!=0){
            eingabe=eingabe/10;
            count=count+1;
        }
    return count;
    }
    public static void main (String[] args){
        int Zahl = 987654321;
        System.out.println(Anzahlderstellen(Zahl));
    }

}
