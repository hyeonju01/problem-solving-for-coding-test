package Archive.Mar_2023.day_30th;

/**
 * [프로그래머스] 각도기
 * if문을 사용하여 각도의 네 가지 조건을 나누어 처리
 */

public class Problem14 {

    class Solution {
        public int solution(int angle) {
            int answer;
            if (angle > 0 && angle <90) {
                answer = 1;
            } else if (angle == 90) {
                answer = 2;
            } else if (angle > 90 && angle < 180) {
                answer = 3;
            } else {
                answer = 4;
            }
            return answer;
        }
    }

}
