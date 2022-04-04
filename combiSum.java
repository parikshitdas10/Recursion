import java.util.*;

//BRUTE FORCE
//candidate can be chosen only once
//all distinct combination
//combinations should be sorted
public class combiSum {
    static void getComb(int i, int target, ArrayList<Integer> list) {
        if (target < 0) {
            return;
        }
        if (i >= n) {
            return;
        }
        if (target == 0) {
            if (!ans.contains(list))
                ans.add(new ArrayList<>(list));
            return;
        }
        // take
        list.add(arr[i]);
        getComb(i + 1, target - arr[i], list);// not changing i because we can pick same element multiple times
        // not take
        list.remove(list.size() - 1);
        getComb(i + 1, target, list);

    }

    static Scanner sc;
    static int top = -1;
    static int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
    static int n = arr.length;
    static HashSet<ArrayList<Integer>> ans = new HashSet<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        getComb(0, 8, list);
        System.out.println(ans);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}