public class TeilerVielfaches {
    //2.1 (4 Punkte)
    public static int ggTrekursiv(int x, int y) { //zwei Zahlen rein, eine Zahl raus
        boolean xygleich = x == y;
        boolean ynull = y == 0;
        if (xygleich) return x; // diese Abbruchbedingung ist redundant
        if (ynull) return x;
            //abbruchbedingungen
        else {
            return ggTrekursiv(y, x % y);
            //wenn die Abbruchbedingungen nicht erfüllt sind, so soll JAVA diese zwei Zahlen als unser neues x und y wieder in die Methode rein schmeißen
        }
    }

    //2.2 (4 Punkte)
    public static int kgV(int x, int y) {
        int erg = x * y / ggTrekursiv(x, y);
        //man nehme die beiden Zahlen, multipliziert diese und teilt durch den ggT. wenn der ggT 1 ist, kann man sich die Division sparen
        return erg;
    }

    public static void gibZahlenpaareAus(int untereZahlengrenze, int obereZahlengrenze, int ggTsollGroesserSeinAls) {
        int y = untereZahlengrenze, x = untereZahlengrenze;
        while (y < obereZahlengrenze) {
            boolean zahlenpaarUngleich = x != y;
            boolean ggT_IstGroesserAlsVorgabe = ggTrekursiv(x, y) > ggTsollGroesserSeinAls;
            boolean duplicate = y < x;
            if (zahlenpaarUngleich && ggT_IstGroesserAlsVorgabe && duplicate) {
                System.out.println("Zahlenpaar [" + y + "] / [" + x + "] und [" + x + "] / [" + y + "] haben den ggT: [" + ggTrekursiv(x,y) + "]");
            } // geht alle Zahlen durch und gibt einem bei den gewuenschten Parametern einen Print
            //die gewuenschten Parameter: x und y nicht gleich; der ggT ist groesser als die Vorgabe; und duplikate nicht ausprinten
            x = x + 1 ;
            if (x > obereZahlengrenze){
                x = untereZahlengrenze;
                y = y + 1;
            } // kann man sich als Zahlenrad vorstellen


        }
    }
    public static void main (String[]args){

        //2.1 GgT (4 Punkte) die nächsten lines sind fuer die Aufgabenstellung
        System.out.println("Aufgabe 2.1 und 2.2 in einem: der ggT und der kgV von zwei Zahlen.\n");
        //ich moechte nicht die nackten Zahlen im Print haben. Wer will kann die Variablen frei waehlen
        int x1 = 24, y1 = 9;
        System.out.println("[" + x1 + "] / [" + y1 + "] ist der ggT: " + ggTrekursiv(x1,y1) + " - und das kgV der beiden " + kgV(x1,y1));
        int x2 = 4, y2 = 4;
        System.out.println("[" + x2 + "] / [" + y2 + "] ist der ggT: " + ggTrekursiv(x2,y2) + " - und das kgV der beiden " + kgV(x2,y2));
        int x3 = 11, y3 = 13;
        System.out.println("[" + x3 + "] / [" + y3 + "] ist der ggT: " + ggTrekursiv(x3,y3) + " - und das kgV der beiden " + kgV(x3,y3));
        int x4 = 2, y4 = 0;
        System.out.println("[" + x4 + "] / [" + y4 + "] ist der ggT: " + ggTrekursiv(x4,y4) + " - und das kgV der beiden " + kgV(x4,y4));
        int x5 = 24, y5 = 81;
        System.out.println("[" + x5 + "] / [" + y5 + "] ist der ggT: " + ggTrekursiv(x5,y5) + " - und das kgV der beiden " + kgV(x5,y5));


        int untergrenze, obergrenze, ggTsollGroesserSeinAls;
        untergrenze = 70;
        obergrenze = 100;
        ggTsollGroesserSeinAls = 13;
        System.out.println("\nEs folgt Aufgabe 2.3 mit den Zahlenpaaren. Der Zahlenbereich ist zwischen " + untergrenze + " und " + obergrenze + " wobei der ggT groesser sein soll als " + ggTsollGroesserSeinAls + "\n");
        gibZahlenpaareAus(untergrenze,obergrenze,ggTsollGroesserSeinAls);
        //der definierte Zahlenbereich ergibt sich aus der unter und obergrenze
    }



}
/* mein Codefriedhof. Vielleicht lerne ich aus den Fehlern. Alles was man hier sieht habe ich über den Haufen geschmissen
        while (!(x == y || y == 0)) {
        boolean ggT = y == 0;
        if (ggT) return x;
        else {
            return ggTrekursiv(y, x % y);
        }
    }
        return ggTrekursiv(y, x % y);
}
// wollte nicht funktionieren hat immer einen fehler ausgegeben
 */


      /*
        if (x==y) return x;
        if (y==0) return x;
        else {
            return ggTrekursiv(y,x%y);
        }*/
   /* int x = 99;
        int y = 99;
        System.out.println(ggTrekursiv(x,y));
        //die letzten 3 Lines sind zum Überprüfen meines Codes gedacht


        System.out.println(kgV(24,81));
                System.out.println(kgV(4,4));
                System.out.println(kgV(11,13));
                System.out.println(kgV(2,0));
      //ich hatte keine Lust mehr auf diese vorgabenprints

    */


