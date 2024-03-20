package Mar_2024.day_20th;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  [백준 7682] https://www.acmicpc.net/problem/7682
 */

public class BOJ_7682 {
    static String[] available = {"valid", "invalid"};
    static char[][] board;
     static int pieceX;
     static int pieceO;
    static int none_piece;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        while (!(input = br.readLine()).equals("end")) {
            board = new char[3][3];
            pieceX = 0;
            pieceO = 0;
            none_piece = 0;
            makeBoard(input);
            boolean bingoX = checkBoard('X');
            boolean bingoO = checkBoard('O');

            // 검증
//            System.out.println("bingoX: " + bingoX);
//            System.out.println("bingoO: "+ bingoO);
//            System.out.println("pieceX: " + pieceX);
//            System.out.println("pieceO: " + pieceO);
//            System.out.println("none_piece: " + none_piece);

            // 맵이 찬 경우
            if (none_piece == 0) {
                if (!bingoO && pieceX == pieceO + 1 ) {
                    sb.append(available[0]).append("\n"); // valid
                } else {
                    sb.append(available[1]).append("\n"); //invalid
                }
            // 맵에 빈 칸이 있는 경우
            } else {
                if (bingoX && !bingoO && pieceX == pieceO + 1) {
                    sb.append(available[0]).append("\n");
                } else if (!bingoX && bingoO && pieceX == pieceO) {
                    sb.append(available[0]).append("\n");
                } else {
                    sb.append(available[1]).append("\n");
                }
            }

        }
        System.out.println(sb);

    }

    private static void makeBoard(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'X') {
                pieceX ++;
            } else if (c == 'O') {
                pieceO ++;
            } else {
                none_piece ++;
            }
            board[i / 3][i % 3] = c;
        }
    }

    private static boolean checkBoard(char c) {
        for (int i = 0; i < 3; i++) {
            // 가로 검사
            if (board[i][0] == c &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                return true;
            }

            // 세로 검사
            if (board[0][i] == c &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i]) {
                return true;
            }
        }

        // 우하향 대각선
        if (board[0][0] == c && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] == c && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        return false;

    }

}
