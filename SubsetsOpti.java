
// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.
//BRUTE FORCE
import java.util.*;

public class SubsetsOpti {

    static void getSubset(int i, int n, ArrayList<Integer> list, int[] nums) {
        ans.add(new ArrayList<>(list));
        for (int j = i; j < n; j++) {
            if (j > i && nums[j] == nums[j - 1])
                continue;
            list.add(nums[j]);
            getSubset(j + 1, n, list, nums);
            list.remove(list.size() - 1);

        }

    }

    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();

        int[] nums = { 1, 2, 2 };
        Arrays.sort(nums);
        int n = nums.length;
        getSubset(0, n, list, nums);
        System.out.println(ans);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}