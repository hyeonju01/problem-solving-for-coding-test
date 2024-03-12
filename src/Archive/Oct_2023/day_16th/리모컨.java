package Archive.Oct_2023.day_16th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 리모컨 {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int brokenButtonNum = Integer.parseInt(br.readLine());
        int[] brokenButtons = new int[brokenButtonNum];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < brokenButtonNum; i++) {
            brokenButtons[i] = Integer.parseInt(st.nextToken());
        }

        //

        // System.out.println(N);
        // System.out.println(brokenButtonNum);
        // System.out.println(Arrays.toString(brokenButtons));


    }

}
