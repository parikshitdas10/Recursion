import java.util.*;

public class Permutation {
    static void recurPermute(ArrayList<Integer> arr, boolean[] freq, int[] nums) {
        if (arr.size() == nums.length) {
            System.out.println(arr);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (freq[i] == false) {
                freq[i] = true;
                arr.add(nums[i]);
                recurPermute(arr, freq, nums);
                arr.remove(arr.size() - 1);
                freq[i] = false;
            }
        }
    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        boolean[] freq = new boolean[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        recurPermute(arr, freq, nums);

    }
}
