package Mar_2024.day_6th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 창고다각형 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] positions = new int[1001];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            positions[L] = H; // idx가 위치, value가 높이
        }

        int leftMost = 0;
        int rightMost = 0;

        for (int i = 0; i < positions.length; i++) {

            if (positions[i] > positions[leftMost]) {
                leftMost = i; // 높이가 크면 갱신
            }

            if (positions[i] > positions[rightMost]) {
                rightMost = i;
            }

        }

        int area = positions[rightMost] * (rightMost - leftMost);

        for(int i = leftMost; i <= rightMost; i++) {
            area -= Math.min(maxHeight(positions, 0, i), maxHeight(positions, i, positions.length));
        }

        System.out.println(area);

    }

    private static int maxHeight(int[] positions, int start, int end) {
        int max = 0;
        for (int i = start; i < end; i++) {
            max = Math.max(max, positions[i]);
        }
        return max;

    }

}
