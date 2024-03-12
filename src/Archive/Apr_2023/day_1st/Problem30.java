package Archive.Apr_2023.day_1st;

/**
 * [프로그래머스] 옷가게 할인 받기
 *  타입캐스팅, 그리고 할인을 받지 않는 경우의 수에 대해 생각해야 한다. 살짝 난이도 상승해서 당황ㅎㅎ..
 */
public class Problem30 {

    class Solution {
        public int solution(int price) {
            double dc_price = 0;
            double base_discount = 0.05;
            double double_price = price;

            if (price >= 100000 && price < 300000 ) {
                dc_price = double_price * base_discount;
            } else if(price >= 300000 && price < 500000) {
                dc_price = double_price * base_discount * 2;
            } else if(price >= 500000) {
                dc_price = double_price * base_discount * 4;
            } else {
                dc_price = 0.0;
            }
            int answer = (int) (price - dc_price);
            return answer;
        }
    }

}
