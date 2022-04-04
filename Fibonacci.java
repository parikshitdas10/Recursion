import java.util.*;

public class Fibonacci {
    static int getFib(int n) {
        if (n <= 1) {
            return n;
        }
        return getFib(n - 1) + getFib(n - 2);
    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        long start = System.currentTimeMillis();
        System.out.println(getFib(n));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}