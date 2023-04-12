package Apr_2023.day_4th;

/**
 *  문자열안에 문자열
 */
public class Problem36 {

    class Solution {
        public int solution(String str1, String str2) {

            if (str1.contains(str2)) {
                return 1;
            } else {
                return 2;
            }

        }
    }
    
}
