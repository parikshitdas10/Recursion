import java.util.*;

//using less space,(no freq/map array)
public class PermutationOpti {
    static void recurPermut(int i, int n, int[] arr, List<Integer> ans) {
        if (i == n) {
            for (int k = 0; k < n; k++) {
                ans.add(arr[k]);
            }
            list.add(new ArrayList<>(ans));
            ans.clear();
            return;
        }
        int temp;
        for (int j = i; j < n; j++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            recurPermut(i + 1, n, arr, ans);
            arr[j] = arr[i];
            arr[i] = temp;

        }

    }

    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> ans = new ArrayList<>();
        int[] arr = { 1, 2, 3 };
        int n = arr.length;
        recurPermut(0, n, arr, ans);
        System.out.println(list);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}