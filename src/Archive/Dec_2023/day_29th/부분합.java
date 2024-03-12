package Archive.Dec_2023.day_29th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분합 {

    public static void main(String[] args) throws IOException {
        // Setup
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /**
         *  N: 수열의 길이
         *  S: 부분합 기준값
         *  seq: 수열 원소
         */
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] seq = new int[N+1];
        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        // Logic
        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        while (start <= end && end <= N) {

            if (sum < S) {
                sum += seq[end++];
            } else if (sum >= S) {
                minLength = Math.min(minLength, end-start);
                sum -= seq[start++];
            }
        }

        System.out.println(minLength == Integer.MAX_VALUE ? 0: minLength);

    }

}