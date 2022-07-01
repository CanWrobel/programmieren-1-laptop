public class TeilerExcess {
    public static int ggtrekursiv (int x, int y){
        if (x==y) return x;
        if (y==0) return x;
        else {
            return ggtrekursiv(y,x%y);
        }
    }
    public static void main (String[]args){
        int x = 11;
        int y = 10;
        System.out.println(ggtrekursiv(x,y));
    }

    
}
