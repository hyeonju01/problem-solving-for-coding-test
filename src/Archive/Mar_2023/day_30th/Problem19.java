package Archive.Mar_2023.day_30th;

/**
 *  [프로그래머스] 점의 위치 구하기
 *      우선 x 좌표가 양수, 음수일 경우로 각각 분기
 *      그 다음 각각의 분기 안에서 y좌표가 양수, 음수일 경우를 각각 분기
 */

public class Problem19 {

    class Solution {
        public int solution(int[] dot) {
            int answer = 0;
            if(dot[0] > 0) {
                if (dot [1] > 0) {
                    answer = 1;
                } else {
                    answer = 4;
                }
            } else {
                if(dot[1] > 0) {
                    answer = 2;
                } else {
                    answer = 3;
                }
            }
            return answer;
        }
    }

}
