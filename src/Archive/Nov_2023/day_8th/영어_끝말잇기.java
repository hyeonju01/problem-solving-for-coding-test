package Archive.Nov_2023.day_8th;

import java.util.Arrays;
import java.util.List;

public class 영어_끝말잇기 {

    static class Solution {
        public int[] solution(int n, String[] words) {

            int[] answer = {};
            List<String> wordList = Arrays.asList(words);

            // 중복 여부, 탈락 여부를 체크하는 배열 생성
            int[][] memo = new int[words.length][2];

            // 중복 여부
            boolean a = (words.length != wordList.stream().distinct().count());

            // 순회하며 중복 및 탈락 여부 체크 후 memo에 기록
            for (int i = 0; i < words.length; i++) {

            }

            // memo 배열을 순회하며
            for (int i = 0; i < words.length; i++) {
                if (!a) {
                    answer = new int[]{};
                } else {
                    answer = new int[]{0, 0};
                }
            }


            return answer;
        }
    }
    public static void main(String[] args) {

    }

}
