package Apr_2023.day_1st;

/**
 * [프로그래머스] 문자 반복 출력하기
 * 역시나 문자열 관련 메서드 잘 숙지하기
 */
public class Problem32 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < my_string.length(); i++) {
                for (int j = 1; j <= n; j++) {
                    sb.append(Character.toString(my_string.charAt(i)));
                }
            }
            return sb.toString();
        }
    }
}
