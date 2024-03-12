package Archive.Apr_2023.day_21st;

/**
 * 369 게임
 * 제시한 숫자를 10으로 나눈다. 몫이 0이 될 때까지 나누고,
 * 반복문 탈출 조건을 몫이 0이 아닌 경우로 설정한다.
 */

public class Problem50 {

    class Solution {
        public int solution(int order) {
            int answer = 0;

            while(order != 0) {
                if (order % 10 == 3 ||
                    order % 10 == 6 ||
                    order % 10 == 9) {
                    answer = answer + 1;

                }
                order = order / 10;
            }

            return answer;
        }
    }

}
