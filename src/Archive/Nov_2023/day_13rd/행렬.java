package Archive.Nov_2023.day_13rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                A[N][M] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                B[N][M] = Integer.parseInt(st.nextToken());
            }
        }



    }

    static int[][] revert(int[][] array, int start) {
        int end = start + 3; //start 가 1이면 end는 4
        for (int i = start; i < end; i++) { // 1, 2, 3
            for (int j = i; j < end; j++) { // 1,1 2,1 3,1 / 1,2 2,2 3,2 / 1,3 2,3 3,3
                if (array[i][j] == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

}
