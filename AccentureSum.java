import java.util.*;

class AccentureSum {
    static int c = 0;

    static void f(int i, int[] arr, int target, int n, int S, Stack<Integer> ds) {
        if (i == n) {
            if (S == target) {
                System.out.println(ds);
                c++;
                return;
            } else {
                return;
            }
        }
        if (S > target)
            return;
        // pick
        S = S + arr[i];
        ds.push(arr[i]);
        f(i + 1, arr, target, n, S, ds);
        // not pick
        S -= arr[i];
        ds.pop();
        f(i + 1, arr, target, n, S, ds);
    }

    public static void main(String[] args) {
        Stack<Integer> ds = new Stack<>();
        int[] arr = { 4, 7, 8, 2, 3 };
        int target = 12;
        f(0, arr, target, arr.length, 0, ds);
        System.out.println(c);
    }
}