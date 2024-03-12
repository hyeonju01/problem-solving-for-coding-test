package Archive.Dec_2023.day_22nd;

import java.util.ArrayList;
import java.util.Arrays;

public class 거리두기_확인하기 {

    static class Solution {
        public int[] solution(String[][] places) {
            int[] answer = {};
            // P: 사람, 0: 빈 테이블, X: 파티션
            int row = 5;
            int column = 5;

            for (String[] place: places) { // ["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"]
                ArrayList<Integer[]> personIdx = new ArrayList<>();
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        String el = Character.toString(place[i].charAt(i));
                        if (el.equals("P")) {
                            Integer[] idx = new Integer[2]; // row, column 순
                            idx[0] = i;
                            idx[1] = j;
                            personIdx.add(idx);
                        }
                    }
                }
                System.out.println(personIdx);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        String[][] places = {
            {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };

        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(places)));


    }

}