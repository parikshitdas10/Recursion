import java.util.*;

public class combinationSum {
    static void getComb(int i, int sum, ArrayList<Integer> list) {
        if (sum < 0) {
            return;
        }
        if (i >= n) {
            return;
        }
        if (sum == 0) {
            System.out.println(list);
            return;
        }
        // take
        list.add(arr[i]);
        top++;
        getComb(i, sum - arr[i], list);// not changing i because we can pick same element multiple times
        // not take
        list.remove(top);
        top--;
        getComb(i + 1, sum, list);

    }

    static Scanner sc;
    static int top = -1;
    static int n = 4;
    static int[] arr = { 2, 3, 6, 7 };

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        getComb(0, 7, list);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}