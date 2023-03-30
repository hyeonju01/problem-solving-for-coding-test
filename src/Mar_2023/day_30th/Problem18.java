package Mar_2023.day_30th;

/**
 *  [프로그래머스] 양꼬치
 *      우선 총 금액을 계산한 후,
 *      양꼬치 주문 갯수를 10인분으로 나눈 몫이 1일 때 서비스 음료수 개수를 하나씩 올린다.
 *      그리고 서비스 음료수 가격을 계산하여 총 금액에서 할인한다.
 */

public class Problem18 {
    class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            int lamb = 12000;
            int soda = 2000;
            answer = (n * 12000) + (k * 2000);

            int service_soda = 0;
            if (n / 10 > 0) {
                service_soda = n / 10;
            }

            answer = answer - (2000 * service_soda);

            return answer;
        }
    }
}
