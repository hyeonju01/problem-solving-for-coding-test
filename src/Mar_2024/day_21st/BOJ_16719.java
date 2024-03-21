package Mar_2024.day_21st;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *  [백준 16719] ZOAC
 *  https://www.acmicpc.net/problem/16719
 */
public class BOJ_16719 {
    
    static boolean [] visited;
    static String word;
    static int wordLen;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();
        wordLen = word.length();
        visited = new boolean[wordLen];
        findWord(0, wordLen - 1);
    }

    private static void findWord(int left, int right) {
        int min = Integer.MAX_VALUE;
        int idx = -1;

        for (int i = left; i < right + 1; i++) { // left ~ right 까지 모두 탐색
            if (!visited[i] && min > word.charAt(i)) {
                min = word.charAt(i);
                idx = i;
            }
        }
        
        if (min == Integer.MAX_VALUE) return;

        visited[idx] = true; // 방문 처리

        String temp = "";
        for (int i = 0; i < wordLen; i++) {
            if (visited[i]) {
                temp = temp.concat(String.valueOf(word.charAt(i)));
            }
        }
        System.out.println(temp);

        findWord(idx + 1, right); // Right
        findWord(left, idx - 1); // Left
    }
}