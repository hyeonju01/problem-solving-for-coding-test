package Archive.Apr_2023.day_13th;

/**
 *  [프로그래머스] 최댓값 만들기 (2)
 *  이중 for문을 사용하여 모든 경우의 수를 나오게 하고, answer 값보다 큰 수가 나오면 갈아 끼워준다
 */

public class Problem45 {

    class Solution {
        public int solution(int[] numbers) {
            int answer = Integer.MIN_VALUE;
            for(int i = 0; i < numbers.length; i++) {
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[i] * numbers[j] > answer && i != j) {
                        answer = numbers[i] * numbers[j];
                    }

                }
            }
            return answer;
        }
    }

}
