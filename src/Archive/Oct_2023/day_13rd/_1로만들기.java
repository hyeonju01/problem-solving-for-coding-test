package Archive.Oct_2023.day_13rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1로만들기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1000001];
        int input = Integer.parseInt(br.readLine());
        for (int i = 2; i <= input; i++) {
            dp[i] = dp[i - 1] + 1;
            if( input / 2 == 0) {
//                dp[i] =
            }
        }
    }

}
