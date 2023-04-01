package Apr_2023.day_1st;

/**
 *  [프로그래머스] 아이스 아메리카노
 *  자바 산술연산자 /, %를 사용하여 몫과 나머지를 구하기
 */
public class Problem28 {
    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];
            int price = 5500;
            answer[0] = money / price;
            answer[1] = money % price;
            return answer;
        }
    }
}
