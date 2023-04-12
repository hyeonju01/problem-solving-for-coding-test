package Apr_2023.day_11th;

/**
 * 제곱수 판별하기
 */
public class Problem38 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            if (Math.sqrt(n) % 1 == 0.0) {
                answer = 1;
            } else {
                answer = 2;
            }
            return answer;
        }
    }
}
