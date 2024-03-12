package Archive.Dec_2023.day_14th;

import java.util.ArrayList;
import java.util.Arrays;

public class 테이블_해시_함수 {

    static class Solution {
        public int solution(int[][] data, int col, int row_begin, int row_end) {
            // 정렬
            Arrays.sort(data, (t1, t2) -> t1[col-1] == t2[col-1] ? t2[col-2] - t1[col-2]: t1[col-1] - t2[col-1]);
            // System.out.println(Arrays.deepToString(data));

            ArrayList<Integer> sumOfRange = new ArrayList<>();
            for (int i = row_begin; i <= row_end; i++) { // 2, 3 -> 1 <= i < 3 -> 1, 2
                int sum = 0;
                System.out.println("i: " + i);
                int arrLen = data[0].length;
                System.out.println("data: " + Arrays.toString(data[i]));
                for (int j = 0; j < arrLen; j++) {
                    sum += data[i-1][j] % i;
                }
                sumOfRange.add(sum);
            }

            System.out.println(sumOfRange);

            int answer = sumOfRange.get(0);
            for (int i = 1; i < sumOfRange.size(); i++) {
                answer = answer ^ sumOfRange.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] data = {
            {2, 2, 6},
            {1, 5, 10},
            {4, 2, 9},
            {3, 8, 3}
        };
        int col = 2;
        int row_begin = 2;
        int row_end = 3;
        System.out.println(s.solution(data, col, row_begin, row_end));
    }

}
