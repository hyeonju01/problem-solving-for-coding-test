package Archive.Nov_2023.day_16th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 마법사_상어와_비바라기 {

    static int r; // 바구니 좌표
    static int c; // 바구니 좌표
    static int N; // 격자 크기
    static int M; // 이동 횟수
    static int dir; // 방향
    static int dist; // 거리

    public static void main(String[] args) throws IOException {

        /**
         * 입, 출력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 격자와 바구니 물 양 정보
        int[][] arr = new int[N][N];
        int[][] location = new int[2][4]; // 초기 구름 생성 위치
        Boolean[][] cloud = new Boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                cloud[i][j] = false;
            }
        }

        // 이동 정보
        int[][] move = new int[M][2];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                move[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /**
         *  로직
         */

        location[0] = new int[]{N - 1, 1};
        location[1] = new int[]{N - 1, 2};
        location[2] = new int[]{N, 1};
        location[3] = new int[]{N, 2};

        dir = move[0][0];
        dist = move[0][1];

        switch(dir){
            case 1: // ←
                 location[0][1] = location[0][1] - dist;
                 location[1][1] = location[1][1] - dist;
                 location[2][1] = location[1][1] - dist;
                 location[3][1] = location[1][1] - dist;
                 break;

            case 2: //↖︎
                location[0][0] = location[0][0] - dist;
                location[0][0] = location[0][1] - dist;
                location[1][0] = location[1][0] - dist;
                location[1][1] = location[1][1] - dist;
                location[2][0] = location[2][0] - dist;
                location[2][1] = location[2][1] - dist;
                location[3][0] = location[3][0] - dist;
                location[3][1] = location[3][1] - dist;

            case 3: // ↑
                location[0][0] = location[0][0] - dist;
                location[1][0] = location[1][0] - dist;
                location[2][0] = location[2][0] - dist;
                location[3][0] = location[3][0] - dist;

            case 4: //↗︎
                location[0][0] = location[0][0] - dist;
                location[0][0] = location[0][1] + dist;
                location[1][0] = location[1][0] - dist;
                location[1][1] = location[1][1] + dist;
                location[2][0] = location[2][0] - dist;
                location[2][1] = location[2][1] + dist;
                location[3][0] = location[3][0] - dist;
                location[3][1] = location[3][1] + dist;
            case 5: // →
                location[0][0] = location[0][1] + dist;
                location[1][0] = location[1][1] + dist;
                location[2][0] = location[2][1] + dist;
                location[3][0] = location[3][1] + dist;
            case 6: // ↘︎
                location[0][0] = location[0][0] + dist;
                location[0][0] = location[0][1] + dist;
                location[1][0] = location[1][0] + dist;
                location[1][1] = location[1][1] + dist;
                location[2][0] = location[2][0] + dist;
                location[2][1] = location[2][1] + dist;
                location[3][0] = location[3][0] + dist;
                location[3][1] = location[3][1] + dist;
            case 7: // ↓
                location[0][0] = location[0][0] + dist;
                location[1][0] = location[1][0] + dist;
                location[2][0] = location[2][0] + dist;
                location[3][0] = location[3][0] + dist;
            case 8: // ↙︎
                location[0][0] = location[0][0] + dist;
                location[0][0] = location[0][1] - dist;
                location[1][0] = location[1][0] + dist;
                location[1][1] = location[1][1] - dist;
                location[2][0] = location[2][0] + dist;
                location[2][1] = location[2][1] - dist;
                location[3][0] = location[3][0] + dist;
                location[3][1] = location[3][1] - dist;
        }
        for (int i = 0; i < location.length; i++) {
            location[i][0] = location[i][0] + dist;
            location[i][1] = location[i][1] + dist;
        }


    }

}
