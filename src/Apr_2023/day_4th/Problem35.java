package Apr_2023.day_4th;

/**
 *  숨어있는 숫자의 덧셈(1)
 */
public class Problem35 {

    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            for(int i = 0; i < my_string.length(); i++) {
                String word = String.valueOf(my_string.charAt(i));
                if (word.matches("^[1-9]*$")) {
                    int num = Integer.parseInt(word);
                    answer = answer + num;
                }
            }
            return answer;
        }
    }
    
}
