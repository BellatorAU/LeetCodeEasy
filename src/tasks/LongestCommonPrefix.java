package tasks;

import core.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix implements Task {
    private static final int TASK_ID = 14;

    @Override
    public void solve() {
        String[] input = {"flower","flow","flight"};
        String result = longestCommonPrefix(input);
        System.out.println(result);
    }

    private static String longestCommonPrefix(String[] strs) {
        char[][] chars = new char[strs.length][];
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            chars[i] = strs[i].toCharArray();
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }

        boolean flag;
        String answer = "";

        for (int i = 0; i < min; i++) {
            flag = true;
            for (int j = 1 ; j < strs.length; j++) {
                if (chars[0][i] != chars[j][i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer += chars[0][i];
            } else {
                break;
            }
        }

        return answer;
    }
}
