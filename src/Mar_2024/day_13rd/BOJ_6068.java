package Mar_2024.day_13rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_6068 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // N <= 1000
        int[][] workArr = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] work = br.readLine().split(" ");
            workArr[i][0] = Integer.parseInt(work[0]); // 소요 시간
            workArr[i][1] = Integer.parseInt(work[1]); // 종료 시각
        }

        // workArr[i][1] 값으로 내림차순 정렬 (큰 수~작은 수)
        Arrays.sort(workArr, (w1, w2) -> w2[1] - w1[1]);

        int endTime = workArr[0][1];

        for (int[] work: workArr){
            if (endTime <= work[1]) {
                endTime -= work[0];
            } else {
                endTime = work[1] - work[0];
            }
        }

        if (endTime < 0) {
            System.out.println(-1);
        } else {
            System.out.println(endTime);
        }
    }
}