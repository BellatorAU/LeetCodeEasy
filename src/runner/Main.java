package runner;

import core.Task;
import tasks.*;

public class Main {
    public static void main(String[] args) {
        Task task = new LongestCommonPrefix();
        task.solve();
    }
}