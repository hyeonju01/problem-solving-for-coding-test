package Archive.Jan_2024.day_15th;

import java.util.Arrays;

public class 캐릭터의_좌표 {
    static class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0, 0};

            int horizontalMax = board[0] / 2;
            int verticalMax = board[1] / 2;

            for (String key: keyinput) {
                switch(key) {
                    case "up":
                        if (horizontalMax > answer[1]) {
                            answer[1]++;
                        }
                        break;
                    case "down":
                        if (answer[1] > (horizontalMax * -1)) { //
                            answer[1] --;
                        }
                        break;
                    case "left":
                        if (answer[0] > (verticalMax * -1)) {
                            answer[0] --;
                        }
                        break;
                    case "right":
                        if (answer[0] < verticalMax) {
                            answer[0] ++;
                        }
                        break;
                }
            }

            return answer;
        }
    }
    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] keyinput1 ={"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};
        System.out.println(Arrays.toString(solution.solution(keyinput1, board1)));
        String[] keyinput2 ={"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};
        System.out.println(Arrays.toString(solution.solution(keyinput2, board2)));

    }
}
