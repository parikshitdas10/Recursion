import java.util.*;

//candidate can be chosen only once
//all distinct combination
//combinations should be sorted
public class combiSumOpti {
    static void getComb(int i, int target, ArrayList<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < n; j++) {
            if (arr[i] > target)
                break;

            if (j > i && arr[j] == arr[j - 1])
                continue;
            list.add(arr[j]);
            getComb(j + 1, target - arr[j], list);
            list.remove(list.size() - 1);
        }

    }

    static Scanner sc;
    static int top = -1;
    static int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
    static int n = arr.length;
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

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