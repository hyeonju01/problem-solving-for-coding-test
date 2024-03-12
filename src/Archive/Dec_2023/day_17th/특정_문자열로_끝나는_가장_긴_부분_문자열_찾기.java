package Archive.Dec_2023.day_17th;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

    static class Solution {
        public String solution(String myString, String pat) {
            String answer = "";

            int patLen = pat.length();
            int myStrLen = myString.length();
            for(int i = 0; i < myStrLen - patLen + 1; i++) {
                String subStr = myString.substring(0, i + patLen);
                System.out.println("i는 : " + i);
                System.out.println("subStr: " + subStr);

                if (subStr.endsWith(pat)) {
                    System.out.println("subStr은 pat으로 끝납니까? " + subStr.endsWith(pat));
                    if (subStr.length() > answer.length()) {
                        System.out.println("subStr.length(): " + subStr.length());
                        System.out.println("answer.length(): " + answer.length());
                        answer = subStr;
                    }
                }

            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String myStr = "AbCdEFG";
        String pat = "dE";
        System.out.println(s.solution(myStr, pat));
    }

}