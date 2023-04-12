package Apr_2023.day_12th;

/**
 * 대문자와 소문자
 */
public class Problem41 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            for (int i = 0; i < my_string.length(); i++) {
                int ascii_val = (int) (my_string.charAt(i));
                String c = Character.toString(my_string.charAt(i));

                if (ascii_val >= 65 && ascii_val <= 90) {
                    answer = answer + c.toLowerCase();
                } else if (ascii_val >= 97 && ascii_val <= 122) {
                    answer = answer + c.toUpperCase();
                }
            }

            return answer;
        }
    }
}
