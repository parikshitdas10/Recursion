import java.util.*;

public class sumN {
    static void sum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sum(i - 1, sum + i);
    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        sum(N, 0);
    }
}