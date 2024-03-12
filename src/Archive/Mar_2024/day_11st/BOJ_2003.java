package Archive.Mar_2024.day_11st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  [백준_2003] 수들의 합 2
 *  https://www.acmicpc.net/problem/2003
 */

public class BOJ_2003 {

    public static void main(String[] args) throws IOException {
        int s = 0, e = 0;
        int answer = 0;
        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 10,000
        int M = Integer.parseInt(st.nextToken()); // 300,000,000
        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        while (true) {
            if (sum < M) { // 누적합이 M 미만
                sum += arr[e];
                e ++;
            } else if (e == N) { // 누적합이 M과 같거나 큰데 e가 끝점이면 살펴보지 않아도 된다.
                break;
            } else { // 누적합이 M과 같거나 큰데 e가 끝점이 아니면 계속 살펴본다.
                sum -= arr[s];
                s ++;
            }

            if (sum == M) {
                answer ++;
            }
        }

        System.out.println(answer);
    }
}