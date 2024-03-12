package Archive.Dec_2023.day_16th;

import java.util.Arrays;

public class 세로_읽기 {

    static class Solution {
        public String solution(String my_string, int m, int c) {
            String answer = "";
            int myStrLen = my_string.length();
            int row = myStrLen/m; // 5
            int column = m; // 4
            int targetColumn = c - 1;
            String[][] arr = new String[row][column];

            int idx = 0;
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < column; j++) {
                    arr[i][j] = Character.toString(my_string.charAt(idx));
                    idx ++;
                    if (j == targetColumn) { // c - 1
                        answer += arr[i][j];
                    }
                }
            }

            System.out.println(Arrays.deepToString(arr));

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "programmers";
        int m = 1;
        int c = 1;

        System.out.println(s.solution(my_string, m, c));
    }

}
