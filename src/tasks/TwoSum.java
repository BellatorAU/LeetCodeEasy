package tasks;

import core.FastScanner;
import core.Task;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum implements Task {
    private static final int TASK_ID = 1;

    @Override
    public void solve(FastScanner in) {
        int[] input = {3,3};
        int target = 6;
        int [] result = twoSumHashMapOneLoop(input, target);
        System.out.println(Arrays.toString(result));
    }

    private int[] twoSumHashMapOneLoop(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i +1 ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    private int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int diff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};
            }
        }
        return new int[2];
    }
}
