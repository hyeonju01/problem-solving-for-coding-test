package Archive.Nov_2023.day_14th;

public class 수_조작하기_2 {
    static class Solution {
        public String solution(int[] numLog) {
            String answer = "";
            for (int i = numLog.length-1; i > 0; i--) {
                int num = numLog[i] - numLog[i-1];
                // 1 -> "w"
                // -1 -> "s"
                // 10 -> "d"
                // -10 -> "a"
                switch (num) {
                    case 1:
                        answer = "w" + answer;
                        break;
                    case -1:
                        answer =  "s" + answer;
                        break;
                    case 10:
                        answer = "d" + answer;
                        break;
                    case -10:
                        answer = "a" + answer;
                        break;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution.solution(numLog));
    }

}
