package Archive.Dec_2023.day_6th;

public class 부분_문자열_이어_붙여_문자열_만들기 {
    static class Solution {
        public String solution(String[] my_strings, int[][] parts) {
            String answer = "";

            for(int i = 0; i < my_strings.length; i++) {
                String myStr = my_strings[i];
                int s = parts[i][0];
                int e = parts[i][1];
                answer = answer.concat(myStr.substring(s, e+1));
                System.out.println(answer);
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(s.solution(my_strings, parts));

    }

}
