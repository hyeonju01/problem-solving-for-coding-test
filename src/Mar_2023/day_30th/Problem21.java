package Mar_2023.day_30th;

/**
 * [프로그래머스] 피자 나눠 먹기 (1)
 * 손님 수를 7로 나누었을 때 나누어 떨어진다면 몫 만큼만 피자를 주문한다.
 * 그렇지 않고 나머지가 있다면 몫보다 한 판 더 많은 피자를 주문해야 모두 피자를 한 조각 이상 먹을 수 있다.
 */
public class Problem21 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            if (n % 7 == 0) {
                answer = n / 7;
            } else {
                answer = n / 7 + 1;
            }
            return answer;
        }
    }
}
