/**
 * 인덱스 바꾸기
 */
package Apr_2023.day_17th;

import java.lang.StringBuilder;

public class Problem47 {
    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";
            StringBuilder sb = new StringBuilder(my_string);
            String a = sb.substring(num1, num1+1);
            String b = sb.substring(num2, num2+1);
            sb = sb.replace(num1, num1+1, b);
            sb = sb.replace(num2, num2+1, a);
            answer = sb.toString();

            return answer;
        }
    }
}