public class SummeIterativForloop {
    public static int Summe(int n){
        int erg = 0;
        for(int count = 0; count <= n ; count++){
            erg = erg + count;
        }
    return erg;
    }
    public static void main (String[]args){
        int n = 5;
        System.out.println(Summe(n));
    }
}
