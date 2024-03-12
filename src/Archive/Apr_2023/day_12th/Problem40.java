package Archive.Apr_2023.day_12th;

/**
 * 가위바위보
 */
public class Problem40 {
    class Solution {
        public String solution(String rsp) {
            String answer = "";
            for (int i = 0; i < rsp.length(); i++) {
                char turn = rsp.charAt(i);
                switch (turn) {
                    case '0' : answer = answer + "5";
                        break;
                    case '2' : answer = answer + "0";
                        break;
                    case '5' : answer = answer + "2";
                        break;
                }
            }
            return answer;
        }
    }
}
