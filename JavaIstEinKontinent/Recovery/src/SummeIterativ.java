public class SummeIterativ {
    public static int summe(int n){
        int count = 0;
        int erg = 0;
        while (count<=n){
            erg = erg + count;
            count=count+1;

        }
        return erg;
    }

    public static void main (String[]args){
        int n = 5;
        System.out.println(summe(n));
    }
}
