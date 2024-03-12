package Archive.Nov_2023.day_14th;

import java.util.Arrays;

public class 수열과_구간_쿼리3 {
    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = {};

            for (int i = 0; i < queries.length; i++) {

                int firstIdx = queries[i][0];
                int lastIdx = queries[i][1];

                int temp = arr[firstIdx];
                arr[firstIdx] = arr[lastIdx];
                arr[lastIdx] = temp;

            }

            return arr;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        System.out.println(Arrays.toString(solution.solution(arr, queries)));
    }

}
