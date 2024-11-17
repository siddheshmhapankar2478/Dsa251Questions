package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q4_Subsets {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ans = subsets(nums);
        System.out.println("Subsets = " + ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        recursiveSubsets(0, nums, list, ans);
        return ans;
    }

    public static void recursiveSubsets(int i, int[] nums, List<Integer> list, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        recursiveSubsets(i + 1, nums, list, ans);
        list.add(nums[i]);
        recursiveSubsets(i + 1, nums, list, ans);
        list.remove(list.size() - 1);
    }
}
