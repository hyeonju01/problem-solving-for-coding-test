package Archive.Apr_2023.day_1st;

/**
 * [프로그래머스] 특정 문자 제거하기
 *  charAt으로 떼어낸 char를 String으로 바꿔서 equals 메서드로 비교하기..
 *  문자열 관련 메서드를 숙지해야겠다.
 */
public class Problem31 {
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = "";
            for(int i = 0; i < my_string.length(); i++) {
                if (!Character.toString(my_string.charAt(i)).equals(letter)) {
                    answer = answer + my_string.charAt(i);
                }
            }
            return answer;
        }
    }
}
