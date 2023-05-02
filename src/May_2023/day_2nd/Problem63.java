/**
 * 문자열 계산하기
 */

package May_2023.day_2nd;

public class Problem63 {

    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String[] strArr = my_string.split(" ");

            answer = answer + Integer.parseInt(strArr[0]);

            for(int i = 0; i < strArr.length; i++) {
                if(strArr[i].equals("+")) {
                    answer = answer + Integer.parseInt(strArr[i+1]);
                } else if(strArr[i].equals("-")) {
                    answer = answer - Integer.parseInt(strArr[i+1]);
                }
            }

            return answer;
        }
    }
}