package core;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class FastScanner {
    private final BufferedReader br;
    private StringTokenizer st;

    public FastScanner(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is));
    }

    private String nextToken() {
        while (st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    public String next() {
        return nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() {
        return Long.parseLong(nextToken());
    }

    public String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 1. int массив (размер известен)
    public int[] readIntArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }

    // 2. String массив (размер известен)
    public String[] readStringArray(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = next();
        }
        return arr;
    }

    // 3. int массив из строки (вся строка)
    public int[] readIntArrayLine() {
        String line = nextLine();
        if (line == null || line.isEmpty()) return new int[0];

        String[] parts = line.trim().split("\\s+");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }

    // 4. String массив из строки
    public String[] readStringArrayLine() {
        String line = nextLine();
        if (line == null || line.isEmpty()) return new String[0];

        return line.trim().split("\\s+");
    }

    // 5. формат LeetCode: [1,2,3]
    public int[] readIntArrayLeetCode() {
        String line = nextLine();
        if (line == null || line.isEmpty()) return new int[0];

        line = line.replaceAll("[\\[\\]\\s]", "");
        if (line.isEmpty()) return new int[0];

        String[] parts = line.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }
}