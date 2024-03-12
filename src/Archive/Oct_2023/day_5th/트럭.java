package Archive.Oct_2023.day_5th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 트럭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 트럭 수
        int W = Integer.parseInt(st.nextToken()); // 다리 길이
        int L = Integer.parseInt(st.nextToken()); // 다리의 최대 하중

        int[] trucks = new int[N]; // 트럭 무게 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < trucks.length; i++) {
            trucks[i] = Integer.parseInt(st.nextToken());
        }

        Queue<Integer> load = new LinkedList<>();

        // 로직
        while (N > 0) {




        }


        int answer = 0;

        // debugging
        // System.out.println("트럭수:"+N);
        // System.out.println("다리 길이:"+W);
        // System.out.println("하중:"+L);
        // System.out.println("트럭의 무게:"+Arrays.toString(trucks));
    }

}
