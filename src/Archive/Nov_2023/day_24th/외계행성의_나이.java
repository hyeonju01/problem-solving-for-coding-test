package Archive.Nov_2023.day_24th;

import java.util.Map;

public class 외계행성의_나이 {

    static class Solution {
        public String solution(int age) {
            String answer = "";
            String ageStr = Integer.toString(age);
            System.out.println(ageStr);
            Map<String, String> dict = Map.of(
                "0","a",
                "1","b",
                "2","c",
                "3","d",
                "4","e",
                "5","f",
                "6","g",
                "7","h",
                "8","i",
                "9", "j");

            // a=0, b=1, c=2, d=3, e=4, f=5, g=6, h=7, i=8, j=9

            for (int i = 0; i < ageStr.length(); i++) {
                char c = ageStr.charAt(i);
                System.out.println("char:" + c);
                answer = answer + dict.get(Character.toString(c));
                System.out.println("answer: "+ answer);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int age = 23;
        System.out.println(solution.solution(age));
    }
}
