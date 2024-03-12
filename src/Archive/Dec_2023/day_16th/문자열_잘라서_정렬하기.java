package Archive.Dec_2023.day_16th;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열_잘라서_정렬하기 {
    static class Solution {
        public String[] solution(String myString) {
            String[] answer = {};
            ArrayList<String> list = new ArrayList<>();
            String[] splitted = myString.split("x");
            System.out.println(Arrays.toString(splitted));
            for(String word: splitted) {
                if (!word.equals("x") && !word.isBlank()) {
                    list.add(word);
                    System.out.println("word: " + word);
                }
            }

            return list.stream().sorted().toArray(String[]::new);
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("axxbxx")));
    }
}