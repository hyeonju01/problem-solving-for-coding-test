package Archive.Mar_2024.day_4th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기타리스트 {
    static int N, S, M;
    static int[] V;
    static boolean [][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // N, S, M
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()); // V
        V = new int[N + 1];
        memo = new boolean[N+1][M+1];
        memo[0][S] = true; // 시작 곡 볼륨 S를 연주했음을 의미

        for (int i = 1; i <= N; i++) {
            V[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j <= M ; j++) {
                if (memo[i - 1][j]) {
                    int bigV = j + V[i];
                    int smallV = j - V[i];

                    if (bigV <= M) memo[i][bigV] = true;
                    if (smallV >= 0) memo[i][smallV] = true;
                }
            }
        }

        int answer = -1;
        for (int i = M; i >= 0 ; i--) {
            if (memo[N][i]) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);

    }

}
