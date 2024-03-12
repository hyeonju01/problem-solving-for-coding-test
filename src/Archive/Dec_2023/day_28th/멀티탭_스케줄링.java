package Archive.Dec_2023.day_28th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 멀티탭_스케줄링 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 멀티탭 구멍 개수 N, 전기 제품 총 사용횟수 K
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        // K개의 전기 제품 번호가 순서에 맞춰 주어짐
        st = new StringTokenizer(br.readLine());

        ArrayList<Integer> utilsOrder = new ArrayList<>();

        // 전자제품별 수를 세어준다.
        HashMap<Integer, Integer> utilsPriority = new HashMap<>();
        for(int i = 0; i < utilsOrder.size(); i++) {
            if (utilsPriority.containsKey(utilsOrder.get(i))) {
                int v = utilsPriority.get(i);
                utilsPriority.put(i, v + 1);
            } else {
                utilsPriority.put(i, 1);
            }
        }

        for(int i = 0; i < K; i++) {
            utilsOrder.add(Integer.parseInt(st.nextToken()));
        }

        // System.out.println("멀티탭 구멍 개수: " + N );
        // System.out.println("전기 제품의 총 사용 횟수: " + K );
        // System.out.println("전기 제품의 사용 순서: " + Arrays.toString(utilsOrder) );

        ArrayList<Integer> plug = new ArrayList<>();

        // 처음 N개 꽂기
        for (int i = 0; i < N; i++) {
            int key = utilsOrder.get(i);
            plug.add(key);

            // value 줄여주기
            int v = utilsPriority.get(key);
            utilsPriority.put(key, v-1);

            // 순서에서 삭제
            utilsOrder.remove(i);
        }

        for(int i = 0; i < utilsOrder.size(); i++) {
            int util = utilsOrder.get(i);
            int maxValue = Collections.max(utilsPriority.values());
            int value = utilsPriority.get(util);

            // value가 max이고 이미 꽂혀져 있다면 그냥 꽂는다. -> max가 여러 개일때 ERROR!
            if (maxValue == value && plug.contains(util)) {
                utilsPriority.put(util, value - 1);
                continue;
            }
            // value가 max가 아니어도 꽂을 차례이면 그냥 꽂는다.

        }




    }

}
