package Apr_2023.day_21st;

/**
 * 외계행성의 나이
 *
 * 나이를 10으로 나누며, 나머지에 맞는 alphabet을 answer에 더한다.
 * 일의 자리부터 더하므로, 정답을 구하기 위해서는 StringBuilder의 reverse를 사용하여
 * answer를 거꾸로 뒤집어야 한다.
 */

public class Problem51 {
    class Solution {
        public String solution(int age) {
            String answer = "";
            String alphabet = "abcdefghij";

            while(age != 0) {
                if ((age % 10) < 10) {
                    answer = answer + Character.toString(alphabet.charAt(age % 10));
                }
                age = age / 10;
            }

            StringBuilder sb = new StringBuilder(answer);
            answer = sb.reverse().toString();

            return answer;
        }
    }
}
