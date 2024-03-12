package Archive.Nov_2023.day_24th;

import java.util.HashMap;
import java.util.Map;

public class 모스부호_1 {

    static class Solution {
        public String solution(String letter) {
            String answer = "";

            // 모스 부호 사전 만들기
            Map<String, String> morseDictionary = new HashMap<>();
            String[] morses = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."};
            String lowercase = "abcdefghijklmnopqrstuvwxyz";
            char[] lowercases = lowercase.toCharArray();

            for (int i = 0; i < 26; i++) {
                morseDictionary.put(morses[i], String.valueOf(lowercases[i]));
            }

            String[] encodedLetters = letter.split(" ");

            for (String encodedLetter: encodedLetters) {
                answer = answer.concat(morseDictionary.get(encodedLetter));
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution(".... . .-.. .-.. ---"));

        }
    }


}
