package Archive.Oct_2023.Oct_30th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이어트 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int G = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 2;

        boolean flag = false;

        while (end < 100000) {
            int oldWeight = start * start;
            int nowWeight = end * end;

            if (nowWeight - oldWeight == G){
                System.out.println(end);
                flag = true;
            }

            if (nowWeight - oldWeight > G) {
                start ++ ;
            } else {
                end ++;
            }
        }

        // 만족하는 수가 없을 경우 -1 출력
        if(!flag) {
            System.out.println(-1);
        }

    }

}