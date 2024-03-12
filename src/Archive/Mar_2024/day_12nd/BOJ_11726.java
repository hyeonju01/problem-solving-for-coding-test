package Archive.Mar_2024.day_12nd;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  [백준_11726] 2xN 타일링
 *  https://www.acmicpc.net/problem/11726
 */

public class BOJ_11726 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= N; i++) {
            arr[i] = arr[i-1] + arr[i-2]; // arr[3] = arr[2] + arr[1]
        }

        int answer = arr[N];
        System.out.println(answer);

    }

}
