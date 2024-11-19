package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q5_Subsets_Equals_K {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 6, 6, 9, 7 };
        int target = 12;
        List<List<Integer>> ans = subsetsK(nums, target);
        System.out.println(ans);

    }

    public static List<List<Integer>> subsetsK(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int count = recursiveSubsetsKCount(0, nums, target, 0, list);
        System.out.println("count= " + count);
        return ans;
    }

    public static void recursiveSubsetsKMethod1(int i, int[] nums, int target, List<Integer> list,
            List<List<Integer>> ans) {
        if (i == nums.length) {
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += list.get(j);
            }
            if (sum == target)
                ans.add(new ArrayList<>(list));
            return;
        }
        recursiveSubsetsKMethod1(i + 1, nums, target, list, ans);
        list.add(nums[i]);
        recursiveSubsetsKMethod1(i + 1, nums, target, list, ans);
        list.remove(list.size() - 1);
    }

    public static void recursiveSubsetsKMethod2(int i, int[] nums, int target, int sum, List<Integer> list,
            List<List<Integer>> ans) {
        if (i == nums.length) {
            if (sum == target)
                ans.add(new ArrayList<>(list));
            return;
        }
        recursiveSubsetsKMethod2(i + 1, nums, target, sum, list, ans);
        sum = sum + nums[i];
        list.add(nums[i]);
        recursiveSubsetsKMethod2(i + 1, nums, target, sum, list, ans);
        sum = sum - nums[i];
        list.remove(list.size() - 1);
    }

    // Print only one answer
    public static boolean recursiveSubsetsK(int i, int[] nums, int target, int sum, List<Integer> list,
            List<List<Integer>> ans) {
        if (i == nums.length) {
            if (sum == target) {
                ans.add(new ArrayList<>(list));
                return true;
            }
            return false;
        }
        if (recursiveSubsetsK(i + 1, nums, target, sum, list, ans))
            return true;
        sum = sum + nums[i];
        list.add(nums[i]);
        if (recursiveSubsetsK(i + 1, nums, target, sum, list, ans))
            return true;
        sum = sum - nums[i];
        list.remove(list.size() - 1);
        return false;
    }

    // Print count of subsets which satisfy
    public static int recursiveSubsetsKCount(int i, int[] nums, int target, int sum, List<Integer> list) {
        if (i == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        int left = recursiveSubsetsKCount(i + 1, nums, target, sum, list);
        sum = sum + nums[i];
        list.add(nums[i]);
        int right = recursiveSubsetsKCount(i + 1, nums, target, sum, list);
        sum = sum - nums[i];
        list.remove(list.size() - 1);
        return left + right;
    }

}
