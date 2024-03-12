package Archive.Mar_2023.day_30th;

/**
 * [프로그래머스] 배열의 평균값
 * 배열 모든 원소를 순회하며 합하고, 그 합을 배열 원소 개수로 나눈다. 자료형에 주의.
 */

public class Problem17 {
    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
            answer = sum / numbers.length;
            return answer;
        }
    }
}
