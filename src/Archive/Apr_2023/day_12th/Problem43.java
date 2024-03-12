package Archive.Apr_2023.day_12th;

/**
 * 주사위의 개수
 */

public class Problem43 {
    class Solution {
        public int solution(int[] box, int n) {
            int answer = 0;

            int width = box[0] / n;
            int depth = box[1] / n;
            int height = box[2] / n;

            answer = width * depth * height;

            return answer;
        }
    }

}
