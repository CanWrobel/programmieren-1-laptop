public class GanzzahligeDivisionMitFloatWerten {
    public static int integerDivision (float a, float b){
        int erg = (int)(a/b);
        return erg;
    }

    public static void main (String[]args){
        int a = 25;
        int b = 10;
        System.out.print(integerDivision(a,b));

    }
}
