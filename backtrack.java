import java.util.*;

public class backtrack {
    static void f(int i, int N) {
        if (i < 1)
            return;
        f(i - 1, N);
        System.out.println(i);
    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        f(N, N);
    }
}
// rec tree:
// f(3<3)->f(2,3)->f(1,3)->f(0,3) return