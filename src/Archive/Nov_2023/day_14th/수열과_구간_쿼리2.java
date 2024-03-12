package Archive.Nov_2023.day_14th;

import java.util.Arrays;

public class 수열과_구간_쿼리2 {
    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];

            for (int i = 0; i < queries.length; i++) { // [0, 1, 2, 4, 3]
                int start = queries[i][0];
                int end = queries[i][1];
                int k = queries[i][2];

                int[] sliced = Arrays.copyOfRange(arr, start, end+1); // end를 포함해야 한다.
                // [0, 4, 2] -> sliced = {0, 1, 2, 4, 3}

                int minValue = 1000001;

                for (int j = 0; j < sliced.length; j++) { // {0, 1, 2, 4, 3}
                    if (sliced[j] > k) {
                        if (minValue > sliced[j]) {
                            minValue = sliced[j];
                        }
                    }
                }
                if (minValue == 1000001) { minValue = -1;}
                answer[i] = minValue;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5, 4, 3, 2, 1};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution.solution(arr, queries)));
    }

}
