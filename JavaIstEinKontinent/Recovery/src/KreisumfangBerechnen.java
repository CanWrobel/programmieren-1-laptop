public class KreisumfangBerechnen {
    public static double givemepie (double radius){
        final double PI = 3.14;
        double erg = 2 * PI * radius;
        return erg;
    }
    public static void main (String[]args){
        float kreis1 = 3.25f;
        int kreis2 = 5;
        double kreis3 = 5.3;
        System.out.println("Kreis 1 hat den Umfang: "+givemepie(kreis1)+" Kreis 2 hat den Umfang: "+givemepie(kreis2)+" Kreis 3 hat den Umfang: "+givemepie(kreis3));
    }
}
