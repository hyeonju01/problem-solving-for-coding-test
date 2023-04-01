package Apr_2023.day_1st;

import java.util.Arrays;

/**
 *  [프로그래머스] 삼각형의 완성조건(1)
 *  가장 긴 변의 길이가 길 때 1, 아닌 경우 2를 리턴한다.
 */
public class Problem27 {
    class Solution {
        public int solution(int[] sides) {
            Arrays.sort(sides);
            int anothers = sides[0] + sides[1];
            if (sides[2] < anothers ) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
