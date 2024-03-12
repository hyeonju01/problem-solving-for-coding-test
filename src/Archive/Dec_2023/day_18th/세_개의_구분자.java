package Archive.Dec_2023.day_18th;

import java.util.*;

public class 세_개의_구분자 {
    static class Solution {
        public String[] solution(String myStr) {
            ArrayList<String> arr = new ArrayList<>();
            int myStrLen = myStr.length();
            String word = "";

            for(int i = 0; i < myStrLen; i++) {

                String letter = String.valueOf(myStr.charAt(i));
                System.out.println("letter: " + letter);

                if (letter.equals("a") || letter.equals("b") || letter.equals("c")) {
                    arr.add(word);
                    word = "";
                } else {
                    word = word.concat(letter);
                }
            }

            arr.stream().forEach(i -> {
                if (i.isBlank()) {
                    arr.remove(i);
                }
            });

            if (arr.size() == 0) {
                String[] answer = {"EMPTY"};
                return answer;
            } else {
                return arr.toArray(String[]::new);
            }

        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        String myStr = "baconlettucetomato";
        System.out.println(Arrays.toString(s.solution(myStr)));

    }

}