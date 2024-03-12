package Archive.Apr_2023.day_21st;
import java.util.HashMap;
/**
 * 모스부호 (1)
 * HashMap을 사용한다.
 */
public class Problem53 {


    class Solution {
        public String solution(String letter) {
            String answer = "";
            HashMap<String, String> morse = new HashMap<>() {{
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }};

            String[] morse_chunks = letter.split(" ");

            for (int i = 0; i < morse_chunks.length; i++) {
                answer = answer + morse.get(morse_chunks[i]);
            }
            return answer;
        }
    }

}
