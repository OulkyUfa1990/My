package redefinition;
public class five_method {
    public static int min(int i, int i2){
        int k;
        if (i<i2){
            k=i;
        } else k=i2;
        return k;
    }
    static long min(long l, long l2){
        long k;
        if (l<l2){
            k=l;
        }else {
            k=l2;
        }
        return k;
    }
    static double min(double d, double d2){
        double k=0;

            if (d<d2){
                k=d;
            }else {
                k=d2;
            }
        return k;
    }
    public static void main(String[]arq){
        System.out.println("Min Int     - " + min(2,3));
        System.out.println("Min long    - " + min(1L,2L));
        System.out.println("Min double  - " + min(1.14234234,2.13));
    }
}
