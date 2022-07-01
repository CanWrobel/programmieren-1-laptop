public class Aufgabe4_1 {
    public static double rechne(int a, int b) {
        double erg = (a + b) / 2;
        return erg;
    }
    //das return hat gefehlt
    //oder nach static kommt void aber das wäre doof

    public static void main(String[]args){
        int a=40;
        int b=77;
        double erg = rechne(a,b);
        System.out.println(erg);//
    }
}
