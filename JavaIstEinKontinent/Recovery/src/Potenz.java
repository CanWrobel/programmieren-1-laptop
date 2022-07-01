public class Potenz {
    public static int potenz(int a, int n){
        if(n==0) return 1;
        else{
            return potenz(a,n-1) * a;
        }
    }
    public static void main(String[]args){
        int basis=10;
        int POtenz=3;
        System.out.println(potenz(basis,POtenz));
    }
}
