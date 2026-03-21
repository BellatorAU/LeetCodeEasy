package tasks;

import core.FastScanner;
import core.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence implements Task {
    private static final int TASK_ID = 128;

    @Override
    public void solve(FastScanner in) {
        int[] nums = { 9,1,4,7,3,-1,0,5,8,-1,6 };
        int result = longestConsecutiveHashSet(nums);
        System.out.println(result);
    }

    private int longestConsecutiveHashSet(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numsSet = new HashSet<>();

        for (int num: nums) {
            numsSet.add(num);
        }

        int max = 0;
        for (int num: numsSet) {
            if (!numsSet.contains(num-1)) {
                int next = num + 1;
                int streak = 1;
                while (numsSet.contains(next)) {
                    next++;
                    streak++;
                }
                max = Math.max(max, streak);
            }
        }
        return max;
    }

    public int longestConsecutiveSort(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int counter = 1;
        int max = counter;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] == nums[i-1] + 1) {
                counter++;
            } else {
                counter = 1;
            }
            max = Math.max(max, counter);
        }
        return max;
    }
}
