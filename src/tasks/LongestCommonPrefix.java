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
        String result = longestCommonPrefixVerticalScanning(input);
        System.out.println(result);
    }

    private static String longestCommonPrefixVerticalScanning(String[] strs) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(i);
            for (int j = 1 ; j < strs.length; j++) {
                if (i == strs[j].length() || current != strs[j].charAt(i)) {
                    return answer.toString();
                }
            }
            answer.append(current);
        }

        return answer.toString();
    }
}
