package Archive.Mar_2023.day_29th;

import java.util.Arrays;

/**
 * [프로그래머스] 최빈값 구하기
 * 로직 변경 후 성공
 */

public class Problem12 {

    public class Solution {
        public int solution(int[] array) {
            int answer = 0;
            // 메모할 배열 생성
            int[] memo = new int[1000];

            // 메모 배열 값을 0으로 초기화
            Arrays.fill(memo, 0);

            // 동일한 값이 있을 경우 memo 배열 원소 값이 1씩 증가
            for (int i = 0; i < array.length; i++) {
                memo[array[i]] += 1;
            }

            int maxValue = 0; // 최빈값의 빈도
            int maxValueIdx = 0; // 최빈값

            for (int i = 0; i < memo.length; i++) {
                if (memo[i] > maxValue) {
                    maxValue = memo[i];
                    maxValueIdx = i;
                }
            }

            int count = 0;
            for (int i = 0; i < memo.length; i++) {
                if (memo[i] == maxValue) // memo의 값들 중 최빈값의 빈도와 동일한 값을 찾는다.
                    count += 1;
            }

            if (count > 1) {
                return -1;
            }

            answer = maxValueIdx;
            return answer;
        }
    }

}
