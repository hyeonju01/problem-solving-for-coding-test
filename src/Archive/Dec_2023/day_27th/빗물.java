package Archive.Dec_2023.day_27th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빗물 {

    public static void main(String[] args) throws IOException {
        // Set up
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] heightWidthArr = input.split(" ");

        int height = Integer.parseInt(heightWidthArr[0]);
        int width = Integer.parseInt(heightWidthArr[1]);

        int[] blocks = new int[width];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < width; i++) {
            blocks[i] = Integer.parseInt(st.nextToken());
        }

        int[] rainWater = new int[width]; // 빗물 저장할 배열

        // Logic
        int rainWaterHeight = 0; // 빗물 높이
        for (int i = 0; i < width; i++) {
            rainWaterHeight = Math.max(rainWaterHeight, blocks[i]);
            rainWater[i] = rainWaterHeight; // 빗물 높이와 블록 높이 중 높은 것을 저장한다.
        }

        rainWaterHeight = 0; // 빗물 높이 0으로 초기화
        int answer = 0;

        for(int  i = width-1; i >= 0; i--) {
            rainWaterHeight = Math.max(rainWaterHeight, blocks[i]);
            rainWater[i] = Math.min(rainWaterHeight, rainWater[i]); // 저장된 빗물 높이와 오른쪽부터 살펴본 빗물 높이 중 더 낮은 것을 저장.
            answer += rainWater[i] - blocks[i];
        }

        System.out.println(answer);
        br.close();
    }

}
