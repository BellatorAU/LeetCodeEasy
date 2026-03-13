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
        String result = longestCommonPrefixUsingIndexOf(input);
        System.out.println(result);
    }

    private static String longestCommonPrefixUsingIndexOf(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    private static String longestCommonPrefixHorizontalScanning(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!prefix.isEmpty()) {
                if (strs[i].length() < prefix.length() || !prefix.equals(strs[i].substring(0, prefix.length()))) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                } else break;
            }
        }

        return prefix;
    }

    private static String longestCommonPrefixVerticalScanning(String[] strs) {
        if (strs == null || strs.length == 0) return "";

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
