package May_2023.day_2nd;

/**
 * 직사각형의 넓이
 */

public class Problem61 {
    class Solution {
        public int solution(int[][] dots) {
            // int answer = 0;
            int x_max = -256;
            int x_min = 256;
            int y_max = -256;
            int y_min = 256;
            //x 순회
            for(int i = 0; i < dots.length; i++) {
                if (x_max < dots[i][0]) {
                    x_max = dots[i][0];
                }
                if (x_min > dots[i][0]) {
                    x_min = dots[i][0];
                }
                if (y_max < dots[i][1]) {
                    y_max = dots[i][1];
                }
                if (y_min > dots[i][1]) {
                    y_min = dots[i][1];
                }
            }

            return (x_max - x_min) * (y_max - y_min);
        }
    }

}
