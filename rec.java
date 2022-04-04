import java.util.*;

public class rec {
    static void f() {
        if (count == 4)
            return;
        System.out.println(count);
        count++;
        f();
    }

    static int count = 0;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        f();
    }
}