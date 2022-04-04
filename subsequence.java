import java.util.*;

public class subsequence {
    static void getSub(int i, ArrayList<Integer> sub) {
        if (i >= n) {
            System.out.println(sub);
            return;
        }
        sub.add(arr[i]);
        top++;
        getSub(i + 1, sub);// take
        sub.remove(top);// removes the added element
        top--;
        getSub(i + 1, sub);// not take
    }

    static int[] arr = { 3, 1, 2 };
    static int n = 3;
    static int top = -1;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> sub = new ArrayList<>();
        getSub(0, sub);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}