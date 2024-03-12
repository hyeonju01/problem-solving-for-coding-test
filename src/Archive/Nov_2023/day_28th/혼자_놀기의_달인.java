package Archive.Nov_2023.day_28th;

import java.util.ArrayList;
import java.util.List;

public class 혼자_놀기의_달인 {

    static class Solution {
        public int solution(int[] cards) {
            int answer = 0;
            int[] boxes = new int[cards.length];

            for (int i = 0; i < cards.length; i++) {
                List<Integer> list = new ArrayList<>();
                int a = cards[i];
                while (!isFind(cards, a, list)) {

                }
            }

            return answer;
        }

        public boolean isFind (int[] cards, int cardNum, List<Integer> list) {
            if (!list.contains(cardNum)) {
                list.add(cards[cardNum]);
            } else {
                return false;
            }
            return isFind(cards, cards[cardNum], list);
        }

        public int find(int[] cards, int cardNum) {
            return cards[cardNum];
        }

    }

    public static void main(String[] args) {

    }
}
