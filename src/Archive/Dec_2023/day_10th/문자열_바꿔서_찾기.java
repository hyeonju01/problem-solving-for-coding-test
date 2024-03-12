package Archive.Dec_2023.day_10th;

public class 문자열_바꿔서_찾기 {

    static class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;
            int strLen = myString.length();
            int patLen = pat.length();
            String changedStr = "";
            for(int i = 0; i < strLen; i++) {
                char c = myString.charAt(i);
                if ((Character.toString(c)).equals("A")) {
                    changedStr = changedStr.concat("B");
                } else {
                    changedStr = changedStr.concat("A");
                }
            }

            if ((changedStr.length() == pat.length()) && (!changedStr.equals(pat))) {
                answer = 0;
            }

            if (strLen > patLen) {
                for (int i = 0; i < strLen - 3; i++) {
                    // pat
                    String subStr = changedStr.substring(i, i+patLen);
                    System.out.println(subStr);
                    if (subStr.equals(pat)) {
                        answer = 1;
                        break;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String myString = "AAAA";
        String pat = "AB";
        System.out.println(s.solution(myString, pat));

    }

}
