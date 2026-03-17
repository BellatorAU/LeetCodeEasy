package tasks;

import core.Task;

public class RemoveElement implements Task {
    private static final int TASK_ID = 27;

    @Override
    public void solve() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }
}
