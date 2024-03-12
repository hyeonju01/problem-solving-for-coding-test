package Archive.Oct_2023.Oct_27th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 수묶기 {

    static int N;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> minusNum = new ArrayList<>();
        int oneNum = 0;
        int zeroNum = 0;
        
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > 0) {
                nums.add(input);
            } else if (input == 0) {
                oneNum ++;
            } else if (input < 0) {
                minusNum.add(input);
            }
        }

        answer = 0;

        //System.out.println(Arrays.toString(array));
    }
}
