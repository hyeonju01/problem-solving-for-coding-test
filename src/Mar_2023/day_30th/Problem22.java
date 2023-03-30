package Mar_2023.day_30th;

/**
 * [프로그래머스] 머쓱이보다 키 큰 사람
 * 머쓱이 키에서 배열 원소를 뺀 값이 음수라면 그 친구가 키가 큰 것이니, answer를 증가시킨다.
 */

public class Problem22 {
    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;

            for (int i = 0; i < array.length; i++) {
                if (height - array[i] < 0) {
                    answer ++;
                }
            }

            return answer;
        }
    }
}
