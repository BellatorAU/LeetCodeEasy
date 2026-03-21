package tasks;

import core.FastScanner;
import core.Task;

public class RemoveDuplicatesFromSortedArray implements Task {
    private static final int TASK_ID = 26;

    @Override
    public void solve(FastScanner in) {
        int[] nums = {1,1,2};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    private int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[counter] != nums[i]) {
                counter++;
                nums[counter] = nums[i];
            }
        }

        return counter + 1;
    }
}
