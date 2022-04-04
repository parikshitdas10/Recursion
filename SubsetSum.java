import java.util.*;

public class SubsetSum {
    static void getSubetSum(int i, int sum, ArrayList<Integer> list) {
        if (i >= n) {
            list.add(sum);
            return;
        }
        // take
        getSubetSum(i + 1, sum + arr[i], list);
        // not take
        getSubetSum(i + 1, sum, list);
    }

    static int[] arr = { 3, 1, 2 };
    static int n = arr.length;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        getSubetSum(0, 0, list);
        Collections.sort(list);
        System.out.println(list);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}