package Archive.Apr_2023.day_21st;

/**
 * 2차원으로 만들기
 * 2차원 배열을 선언한 후, 입력 배열의 인덱스를 별도의 변수로 선언하여
 * 순회하며 1씩 올려준다.
 */

public class Problem54 {

    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length/n][n];
            int idx = 0;
            for (int i = 0; i < answer.length; i++) {

                for (int j = 0; j < answer[i].length; j++) {

                    answer[i][j] = num_list[idx];
                    idx ++;
                }
            }

            return answer;
        }
    }
}
