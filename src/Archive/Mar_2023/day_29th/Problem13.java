package Archive.Mar_2023.day_29th;

/**
 * [프로그래머스] 짝수는 싫어요
 */

public class Problem13 {
    class Solution {
        public int[] solution(int n) {
            int[] answer;
            int idx = 0;
            // 배열 생성
            if (n % 2 == 0) {
                answer = new int[n / 2];  // 짝수
            } else {
                answer = new int[n / 2 + 1]; // 홀수
            }

            // 0부터 n까지 순회하며 홀수일 경우에만 배열에 대입
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 1) {
                    answer[idx] = i;
                    idx ++;
                }
            }

            return answer;
        }
    }
}
