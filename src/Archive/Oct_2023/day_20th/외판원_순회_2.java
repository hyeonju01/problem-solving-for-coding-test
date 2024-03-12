package Archive.Oct_2023.day_20th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 외판원_순회_2 {

    static int N;
    static int[][] expenseMap;
    static boolean[] visited;
    static long result_min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        expenseMap = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                expenseMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            visited = new boolean[N];
            visited[i] = true;
            dfs(i, i, 0);
        }

        System.out.println(result_min);

    }

    private static void dfs(int start, int now, long cost) {

        if (allVisited()) {
            if (expenseMap[now][start] != 0) {
                result_min = Math.min(result_min, cost+expenseMap[now][0]);
            }
            return;
        }

        for (int i = 1; i < N; i++) {
            if (!visited[i] && expenseMap[now][i] != 0) {
                visited[i] = true;
                dfs(start, i, cost+expenseMap[now][i]);
                visited[i] = false;
            }
        }
    }

    private static boolean allVisited() {
        for (int i = 0; i < N; i++) {
            if (!visited[i]) { // 방문하지 않았을 경우
                return false;
            }
        }
        return true;
    }
}