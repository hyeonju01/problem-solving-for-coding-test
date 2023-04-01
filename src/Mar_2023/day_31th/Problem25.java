package Mar_2023.day_31th;

import java.util.Arrays;

/**
 * [프로그래머스] 배열 자르기
 * Arrays의 copyOfRange 함수를 사용하여 해결
 * 해당 함수의 세번째 인자보다 하나 작은 인덱스 값을 반환하니, 1을 더해줘야 의도한 배열로 잘린다.
 *
 */

public class Problem25 {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
            return answer;
        }
    }
}
