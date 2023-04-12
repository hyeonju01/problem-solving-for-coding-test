package Apr_2023.day_12th;

/**
 * 암호 해독
 */
public class Problem39 {
    class Solution {
        public String solution(String cipher, int code) {
            String answer = "";
            for (int i = 0; i < cipher.length(); i++) {
                if ((i + 1) % code == 0) {
                    answer = answer + Character.toString(cipher.charAt(i+1));
                }
            }
            return answer;
        }
    }
}
