package Archive.May_2023.day_2nd;

/**
 *  숨어있는 숫자의 덧셈(2)
 */

public class Problem64 {

    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            my_string = my_string.replaceAll("[a-zA-Z]", " ").replaceAll("\\s+", " ").trim();
            if (my_string.equals("")) {
                return 0;
            } else {
                String[] str_arr = my_string.split(" ");

                for(String num: str_arr) {
                    answer = answer + Integer.parseInt(num);
                }
                return answer;
            }

        }
    }
}
