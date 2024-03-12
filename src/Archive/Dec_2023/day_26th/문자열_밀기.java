package Archive.Dec_2023.day_26th;

public class 문자열_밀기 {

    static class Solution {
        public int solution(String A, String B) {
            int answer = 0;
            StringBuilder sb_A = new StringBuilder(A);
            StringBuilder sb_B = new StringBuilder(B);
            int A_lastIdx = A.length() - 1;

            String reversedStr = sb_B.reverse().toString();

            if (A.equals(B)) {
                return 1;
            } else if (A.equals(reversedStr)) {
                return -1;
            }

            while (true) {
                String temp = sb_A.substring(A_lastIdx - 1, A_lastIdx + 1); // "o"
                sb_A = sb_A.deleteCharAt(A_lastIdx); // "hell"
                sb_A = new StringBuilder(temp.concat(sb_A.toString()));
                answer++;

                if (sb_A.equals(sb_B)) {
                    break;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution("hello", "ohell"));

    }
}