package runner;

import core.FastScanner;
import core.Task;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskRunner {
        private static final String PACKAGE_NAME = "tasks.";

    public static void main(String[] args) {
        String className = args.length > 0 ? args[0] : "TwoSum";
        String fullClassName = PACKAGE_NAME + className;

        try {
            Task task = (Task) Class.forName(fullClassName)
                    .getDeclaredConstructor()
                    .newInstance();
            FastScanner in = new FastScanner(System.in);
            task.solve(in);
        } catch (ReflectiveOperationException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}