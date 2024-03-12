package Archive.Dec_2023.day_20th;

import java.util.Arrays;

public class 정사각형으로_만들기 {

    static class Solution {
        public int[][] solution(int[][] arr) {
            int[][] answer = {};

            int row = arr.length; // 2
            int column = arr[0].length; //3

            if (row > column) {
                // 각 행의 끝에 0을 추가
                int newColumn = column + 1; //4
                answer = new int[row][newColumn];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < newColumn; j++) { // 0, 1, 2, 3
                        if (j < column) {
                            answer[i][j] = arr[i][j];
                        } else {
                            answer[i][j] = 0;
                        }
                    }
                }

            } else if (row < column) {
                // 각 열의 끝에 0을 추가
                int newRow = row + 1; // row: 2, newRow: 4
                answer = new int[newRow][column];
                for (int i = 0; i < newRow; i++) {
                    for (int j = 0; j < column; j++) {
                        if (i < row) { // i = 0, 1
                            answer[i][j] = arr[i][j];
                        } else {
                            answer[i][j] = 0;
                        }
                    }
                }

            } else {
                return arr;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        int[][] arr1 = {{572, 22, 37},
                    {287, 726, 384},
                    {85, 137, 292},
                    {487, 13, 876}};
        int[][] arr2 = {{57, 192, 534, 2},
                        {9, 345, 192, 999}};
        int[][] arr3 = {{1, 2},
                        {3, 4}};

        Solution s = new Solution();

        System.out.println(Arrays.deepToString(s.solution(arr1)));
        System.out.println(Arrays.deepToString(s.solution(arr2)));
        System.out.println(Arrays.deepToString(s.solution(arr3)));

    }

}
