package Archive.Dec_2023.day_26th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *  https://www.acmicpc.net/problem/20366
 */
public class BOJ_20366 {
    static int N;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] diameters = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            diameters[i] = Integer.parseInt(st.nextToken());
        }

        // System.out.println("N: " + N);
        // System.out.println("지름 배열: " + Arrays.toString(diameters));

        Arrays.sort(diameters);

        for (int i = 0; i <= N-4; i++) { // 0, 1
            for (int j = N-1; j >= i+3; j--) { // 4, 3
                int sister = diameters[i] + diameters[j]; //diameter[0] + diameter[4]
                int left = i + 1, right = j - 1; // left = 1, right = 3
                while(left < right) {
                    int youngSis = diameters[left] + diameters[right];
                    if (youngSis < sister) {
                        left ++ ;
                    } else if (youngSis > sister) {
                        right --;
                    } else {
                        break;
                    }
                    answer = Math.min(answer, Math.abs(sister - youngSis));
                }
            }
        }

        System.out.println(answer);

    }

}