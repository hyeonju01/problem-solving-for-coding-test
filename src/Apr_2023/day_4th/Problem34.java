package Apr_2023.day_4th;

/**
 *  모음 제거
 */
public class Problem34 {

    class Solution {
        public String solution(String my_string) {
            String[] vowels = new String[] {"a", "e", "i", "o", "u"};
            String answer = "";
            for (int i = 0; i < vowels.length; i++) {

                if (my_string.contains(vowels[i])) {
                    answer = my_string.replaceAll(vowels[i], "");
                    my_string = answer;
                } else {
                    answer = my_string;
                }
            }
            return answer;
        }
    }
    
}
