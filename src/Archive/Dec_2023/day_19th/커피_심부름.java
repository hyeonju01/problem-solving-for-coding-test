package Archive.Dec_2023.day_19th;

public class 커피_심부름 {

    static class Solution {
        public int solution(String[] order) {
            int answer = 0;
            final int priceOfAme = 4500;
            final int priceOfLatte = 5000;
            int numOfAme = 0;
            int numOfLatte = 0;

            for(String item: order) {
                if (item.contains("americano")) {
                    numOfAme++;
                } else if (item.contains("latte")) {
                    numOfLatte++;
                } else {
                    numOfAme++;
                }
            }

            answer = (priceOfAme * numOfAme) + (priceOfLatte * numOfLatte);

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        String[] order2 = {"americanoice", "americano", "iceamericano"};
        System.out.println(s.solution(order1));
        System.out.println(s.solution(order2));

    }


}
