package redefinition;
public class five_max {
    public static int max(int i, int j){
        int k;
        if (i<j){
            k=i;
        }else k=j;
        return k;
    }
    public static long max(long l, long l1){
        long k;
        if (l<l1){
            k=l;
        }else k=l1;
        return k;
    }
    public static double max(double i, double j){
        double k;
        if (i<j){
            k=i;
        }else k=j;
        return k;
    }
    public static void main(String[]arq){
        System.out.println("max int = " +max(2,3));
        System.out.println("max long = " +max(2l,3l));
        System.out.println("max double = " +max(2.1,3.1));
    }
}
