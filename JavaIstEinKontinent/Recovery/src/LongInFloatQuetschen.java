public class LongInFloatQuetschen {
    public static void main (String[]args){
        long leng = Long.MAX_VALUE;
        System.out.println(leng);
        float fleet = leng;
        System.out.println("Längster long in float gequetscht: "+fleet);
        leng = (long)(fleet);
        System.out.println("Dieser zurück in Long : "+leng);
        System.out.println(leng);


    }
}
