package Apr_2023.day_27th;

/**
 * 공 던지기
 * 테스트 케이스 잘 살펴보고, 규칙을 잘 찾아야 한다.
 *
 */
public class Problem55 {

    class Solution {
        public int solution(int[] numbers, int k) {
            int answer = 0;
            int idx = 0;

            for (int i = 0 ; i < k ; i ++) {
                if (numbers.length > idx) {
                    answer = numbers[idx];
                    idx = idx + 2;
                } else {
                    idx = idx - numbers.length;
                    answer = numbers[idx];
                    idx = idx + 2;
                }
            }
            return answer;
        }
    }

}
