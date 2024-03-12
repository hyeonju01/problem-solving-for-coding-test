package Archive.Nov_2023.day_6th;

import java.util.Arrays;

public class 교점에별만들기 {

    static int A; static int B; static int E; static int C; static int D; static int F;
    static class Solution {
        public String[] solution(int[][] line) {
            String[] answer = {};

            for (int i = 0; i < line.length; i++) {
                for (int j = 1; j < line.length; j++) {

                    A = line[i][0];
                    B = line[i][1];
                    E = line[i][2];

                    C = line[j][0];
                    D = line[j][1];
                    F = line[j][2];

                    int X_numerator = B*F - E*D; // X 좌표 분자
                    int Y_numerator = E*C - A*F; // Y 좌표 분자
                    int denominator = A*D - B*C; // 분모

                    if (denominator == 0) {
                        // 평행하거나 일치하여 교점이 없다.
                    }

                    if (X_numerator % denominator != 0 || Y_numerator % denominator != 0) {
                        // X, Y 좌표 중 하나라도 정수가 아니라면 교점에서 제외함
                    } else {



                    }
                }
            }



            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        System.out.println(Arrays.toString(line[1]));
        solution.solution(line);
    }

}
