package June_2024.day_17th;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// [BOJ_10808] 알파벳 개수
public class P10808 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] lower_alpha = new int[26]; // 97 a ~ 122 z -> 122 - 96 = 26 글자
        for (int i = 0; i < word.length() ; i++) {
            int idx = word.charAt(i) % 97;
            lower_alpha[idx] += 1;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(lower_alpha[i] + " ");
        }
    }
}