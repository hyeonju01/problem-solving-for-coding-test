package Apr_2023.day_1st;

/**
 * [프로그래머스] 문자열 뒤집기
 * 문자열을 붙일 때 여러 가지 방법이 있는데, StringBuffer의 append() 메소드를 사용하였다.
 */
public class Problem29 {

    class Solution {
        public String solution(String my_string) {
            String answer = "";
            StringBuffer sb = new StringBuffer();
            int word_length = my_string.length() - 1;
            for(int i = word_length; i >= 0; i--) {
                sb.append(my_string.charAt(i));
            }
            answer = sb.toString();
            return answer;
        }
    }

}
