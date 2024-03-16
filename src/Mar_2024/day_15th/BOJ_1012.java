package Mar_2024.day_15th;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  [백준 1012] 유기농 배추
 *  https://www.acmicpc.net/problem/1012
 *
 */
public class BOJ_1012 {

    static int M, N, K;
    static int[][] field;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count = 0;
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]);
            N = Integer.parseInt(input[1]);
            K = Integer.parseInt(input[2]);

            field = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                field[X][Y] = 1;
            }

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (field[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k);
                        count ++;
                    }
                }
            }

            System.out.println(count);

        }

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (!visited[cx][cy] && field[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }
        }
    }
}
