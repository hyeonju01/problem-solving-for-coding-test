package Mar_2023.day_31th;

/**
 * [프로그래머스] 배열 뒤집기
 */

public class Problem26 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            int idx = 0;
            for (int i = num_list.length - 1; i >= 0 ; i--) {
                answer[idx] = num_list[i];
                idx ++;
            }

            return answer;
        }
    }
}
