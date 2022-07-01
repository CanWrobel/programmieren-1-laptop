public class SummeBerechnen {
    public static int summe(int n){
        if(n==0) return 0;
        else{
            return summe(n-1) + n;
        }
    }
    public static void main (String[]args){
        System.out.println(summe(2));
    }
}
