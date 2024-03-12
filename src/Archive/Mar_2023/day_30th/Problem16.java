package Archive.Mar_2023.day_30th;

/**
 *
 *  [프로그래머스] 짝수의 합
 *  정수 n 이하의 모든 짝수를 합하여 반환하기
 */

public class Problem16 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i < n+1; i++) {
                if (i % 2 == 0) {
                    answer = answer + i;
                }
            }
            return answer;
        }
    }
}
