package Archive.Oct_2023.day_31st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 회전초밥 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 회전 벨트에 놓인 접시 갯수
        int d = Integer.parseInt(st.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시 갯수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i, Integer.parseInt(br.readLine()));
        }

        int startIdx = 0;
        int endIdx = startIdx + k;

        int answer = 0;

        for (int i = 0; i < list.size(); i++) {
            List<Integer> subList = new ArrayList<>();
            if (endIdx < list.size()) {
                subList = list.subList(startIdx, endIdx);
            } else {
                endIdx = endIdx - list.size();
                subList = list.subList(startIdx, endIdx);
            }

            

        }


    }

}
