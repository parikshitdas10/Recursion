
// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.
//BRUTE FORCE
import java.util.*;

public class Subsets {
    static void getSubset(int i, int n, ArrayList<Integer> list, int[] nums) {
        if (i >= n) {
            if (!set.contains(list)) {
                set.add(new ArrayList<>(list));
            }
            return;
        }
        // take
        list.add(nums[i]);
        getSubset(i + 1, n, list, nums);
        // not take
        list.remove(list.size() - 1);
        getSubset(i + 1, n, list, nums);

    }

    static Scanner sc;
    static HashSet<ArrayList<Integer>> set = new HashSet<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();

        int[] nums = { 1, 2, 2 };
        int n = nums.length;
        getSubset(0, n, list, nums);
        System.out.println(set);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}