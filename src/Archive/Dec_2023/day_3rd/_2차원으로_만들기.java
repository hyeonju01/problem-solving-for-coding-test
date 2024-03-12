package Archive.Dec_2023.day_3rd;

public class _2차원으로_만들기 {
    static class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[n][num_list.length/n];
            int idx = 0;

            while (idx < num_list.length) {
                for (int j = 0; j < answer.length; j++) {
                    for (int k = 0; k < n; k++) {
                        answer[j][k] = num_list[idx];
                        idx ++;
                    }
                }
            }

            return answer;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {1,2,3,4,5,6,7,8};
        System.out.println(s.solution(num_list, 2));
    }

}