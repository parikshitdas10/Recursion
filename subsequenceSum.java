import java.util.*;

public class subsequenceSum {
    static void getSub(int i, ArrayList<Integer> list, int sum) {
        if (sum > k) {
            return;
        }
        if (i >= n) {
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }
        // take
        list.add(arr[i]);
        top++;
        getSub(i + 1, list, sum + arr[i]);

        // not take
        list.remove(top);
        top--;
        getSub(i + 1, list, sum);
    }

    static int[] arr = { 1, 2, 1 };
    static int n = arr.length;
    static int k = 2;
    static int top = -1;
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        getSub(0, list, 0);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}