import java.util.*;

public class countSubsequenceSum {
    static int getSub(int i, int sum) {
        if (sum > k) {
            return 0;
        }
        if (i >= n) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        // take
        int l = getSub(i + 1, sum + arr[i]);

        // not take
        int r = getSub(i + 1, sum);
        return l + r;
    }

    static int[] arr = { 1, 2, 1 };
    static int n = arr.length;
    static int k = 2;
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(getSub(0, 0));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}