package Mar_2024.day_8th;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 *  [백준_22862] 가장 긴 짝수 연속한 부분 수열 (large)
 *  https://www.acmicpc.net/problem/22862
 */

public class BOJ_22862 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int s = 0, e = 0, odd = 0, answer = 0;

        while (e < N) {
            if (odd < K) {
                if (arr[e] % 2 == 1) odd++;
                e++;
                answer = Math.max(answer, e - s - odd); // 더 긴 길이값을 answer로 누적한다.
            } else {
                if (arr[e] % 2 == 0) {
                    e++;
                    answer = Math.max(answer, e - s - odd);
                } else {
                    if (arr[s] % 2 == 1) {
                        odd--;
                    }
                    s++;
                }
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}