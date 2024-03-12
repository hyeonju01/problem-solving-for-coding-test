package Archive.Dec_2023.day_11st;

public class 원하는_문자열_찾기 {
    static class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;

            myString = myString.toLowerCase();
            int myStrLen = myString.length();

            pat = pat.toLowerCase();
            int patLen = pat.length();

            if (myStrLen < patLen)  {
                answer = 0;
            } else if (myStrLen == patLen) {
                if (!myString.equals(pat)) {
                    answer = 0;
                } else {
                    answer = 1;
                }
            } else {
                for (int i = 0; i <= myStrLen - patLen; i++) {
                    System.out.println("i: " + i);
                    String sub = myString.substring(i, i + patLen);
                    System.out.println("sub: " + sub);
                    if (pat.equals(sub)) {
                        answer = 1;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String myString = "aabbaa";
        String pat = "aaa";
        System.out.println(s.solution(myString, pat));
    }

}