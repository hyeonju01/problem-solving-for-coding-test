package Archive.Mar_2023.day_31th;

/**
 * [프로그래머스] 짝수 홀수 개수
 * 정수 리스트를 순회하며 2로 나눈 결과에 따라 정답 배열 개수를 변화시킨다.
 */
public class Problem24 {

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = {0, 0};
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    answer[0] ++;
                } else {
                    answer[1] ++;
                }
            }
            return answer;
        }
    }

}
