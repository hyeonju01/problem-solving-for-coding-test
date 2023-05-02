/**
 * 캐릭터의 좌표
 */

package May_2023.day_2nd;

import java.lang.Math;

public class Problem62 {


    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0, 0};
            for(String onward: keyinput) {
                if (onward.equals("left")) {
                    if (Math.abs(answer[0]) < board[0] / 2 || answer[0] == board[0] / 2) {
                        answer[0] = answer[0] - 1;
                    }
                } else if (onward.equals("right")) {
                    if (Math.abs(answer[0]) < board[0] / 2 || answer[0] == - (board[0] / 2)) {
                        answer[0] = answer[0] + 1;
                    }
                } else if (onward.equals("up")) {
                    if (Math.abs(answer[1]) < board[1] / 2 || answer[1] == - (board[1] / 2)) {
                        answer[1] = answer[1] + 1;
                    }
                } else if (onward.equals("down")) {
                    if (Math.abs(answer[1]) < board[1] / 2 || answer[1] == (board[1] / 2)) {
                        answer[1] = answer[1] - 1;
                    }
                }
            }
            return answer;
        }
    }

}
