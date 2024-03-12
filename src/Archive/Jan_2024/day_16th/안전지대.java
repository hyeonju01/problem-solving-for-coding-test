package Archive.Jan_2024.day_16th;

public class 안전지대 {
    static class Solution {
        public int solution(int[][] board) {
            int answer = 0;
            // a, b

            // left, right, up, down
            // board[a][b-1] = 1;
            // board[a][b+1] = 1;
            // board[a-1][b] = 1;
            // board[a+1][b] = 1;

            // diagonal
            // board[a-1][b-1] = 1;
            // board[a-1][b+1] = 1;
            // board[a+1][b-1] = 1;
            // board[a+1][b+1] = 1;

            return answer;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] board = {{0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0},
                         {0, 0, 1, 0, 0},
                         {0, 0, 0, 0, 0}};

        int[][] board2 = {{0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 1, 1, 0},
                          {0, 0, 0, 0, 0}};

        int[][] board3 = {{1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1}};

        System.out.println(s.solution(board));
        System.out.println(s.solution(board2));
        System.out.println(s.solution(board3));
    }

}
