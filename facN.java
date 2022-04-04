import java.util.*;

public class facN {
    static int f(int N) {
        if (N == 1) {
            return 1;
        }
        return N * f(N - 1);
    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(f(N));
    }
}