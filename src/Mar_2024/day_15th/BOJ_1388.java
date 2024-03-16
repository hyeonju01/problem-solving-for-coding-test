package Mar_2024.day_15th;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 *  [백준 1388] 바닥 장식
 *  https://www.acmicpc.net/problem/1388
 */

public class BOJ_1388 {

    static int N, M;
    static char[][] floor;
    static boolean[][] visited;
    static int count;

    public static void main(String[] args) throws Exception {

        /* 입력 받기 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        floor = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                floor[i][j] = row.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                  if (floor[i][j] == '-') {
                      dfsWidth('-', i, j);
                  } else {
                      dfsHeight('|', i, j);
                  }
                  count ++;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    // 가로 방향 DFS
    private static void dfsWidth (char c, int i, int j) {
        if (c != '-') {
            return;
        }
        visited[i][j] = true;
        if (j+1 >= M) {
            return;
        }
        dfsWidth(floor[i][j+1], i, j+1);
    }

    // 세로 방향 DFS
    private static void dfsHeight (char c, int i, int j) {
        if (c != '|') {
            return;
        }
        visited[i][j] = true;
        if (i + 1 >= N) {
            return;
        }
        dfsHeight(floor[i+1][j], i+1, j);
    }
}