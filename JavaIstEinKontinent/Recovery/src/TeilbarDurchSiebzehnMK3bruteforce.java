import java.util.Scanner;

public class TeilbarDurchSiebzehnMK3bruteforce {
    public static void main (String[]args){
        char ue;
        ue = 'ü';
        int zahl;
        System.out.print("Bitte eine nat" + 'ü' + "rliche Zahl eingeben: ");
        Scanner scan = new Scanner(System.in);
        zahl = scan.nextInt();
        System.out.println("Eingelesene Zahl lautet: " + zahl);


        int h;
        h = zahl;
        //System.out.println("Eingabezahl: " + h);
        int z4;
        z4 = h / 1000;
        // z4 ist die vierte Stelle
        //System.out.println(z4 + " ist die Vierte Stelle");
        int viertepurge;
        viertepurge = h - (z4 * 1000);
        int z3 = viertepurge / 100;
        // z3 ist die dritte Stelle
        //System.out.println(z3 + " ist die z3 Stelle");
        int drittepurge;
        drittepurge = viertepurge - (z3 * 100);
        int z2;
        // z2 ist die z2 Stelle
        z2 = drittepurge / 10;
        //System.out.println(z2 + " ist die z2 Stelle");
        int z1;
        z1 = drittepurge - (z2 * 10);
        //System.out.println(z1 + " ist die erste Stelle ");
        //z1 ist die erste Stelle

        //System.out.println(h + " ist die Zahl vierstellig");
        //System.out.println(viertepurge + " ist die Zahl dreistellig");
        //System.out.println(drittepurge + " ist die Zahl zweistellig");
        //System.out.println(z1 + " ist die Zahl einstellig");
        //multipliziere die letzte Ziffer der Zahl mit 5, subtrahiere die naechste Ziffer
        int z1x5mz2;
        z1x5mz2 = z1 * 5 - z2;
        //System.out.println(z1x5mz2);
        // das ergebnis selbst mal 5 minus die naechste Zahl
        int z1z2x5mz3;
        z1z2x5mz3 = z1x5mz2 * 5 + z3;
        //System.out.println(z1z2x5mz3);
        //das Ergebnis davon nochmal mal 5 minus die nächste Ziffer
        int n3x5mz4;
        n3x5mz4 = z1z2x5mz3 * 5 - z4;
        int Ergebnis = n3x5mz4;
        //System.out.println(n3x5mz4);
        boolean isDivisibleBy17 = Ergebnis % 17     == 0;
        boolean hisdivisibleby17 = h % 17 == 0;
        System.out.println("Eingabezahl :" + h);
        System.out.println("Ergebnis: " + Ergebnis);
        System.out.println("Ergebnis ist durch 17 teilbar: " + isDivisibleBy17);
        System.out.println("Eingabezahl ist durch 17 teilbar: " + hisdivisibleby17);


    }
}
