/**
 * Created by Praktika on 22.12.2016.
 */
public class exercise87 {
    public static void main(String[] args) {
        int n = 8;
        int[] a ={1, 2, 4, 8};
        System.out.println(arePrimeFactors(a, n));
    }

    public static boolean arePrimeFactors(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if ((n % a[i] != 0) && (n % i == 0)) {
                return false;
            }
        }return true;
    }
}

