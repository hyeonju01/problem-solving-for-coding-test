package Archive.Dec_2022.day_10th;

import java.util.*;
/*
[푸는 중] 프로그래머스 최빈값 구하기
계수 정렬 이용하기
HashMap 활용하여 구현 시도 한번 더 해보기 ㅠㅠ
 */
public class Problem11 {
    static class Solution {
        public int solution(int[] array) {
            int answer = 0;
            int[] memo = new int[1000]; // array의 원소는 0부터 999까지
            int maxValueIdx = 0;

            Arrays.fill(memo, 0); // 계수정렬 배열의 값을 0으로 초기화

            for (int i = 0; i < array.length; i++) {
                memo[array[i]] += 1;
            }

            for (int i = 0; i < memo.length; i++) {
                if (memo[i] > memo[maxValueIdx]
                        && maxValueIdx != i) {
                    maxValueIdx = i;
                }
            }

            answer = maxValueIdx;

            for (int i = 0; i < memo.length; i++) {
                if (memo[maxValueIdx] > memo[i]){ //answer가 최대값일 때
                    if (maxValueIdx != i && answer == memo[i]) {
                        return -1;
                    }
                }
            }

            return answer;
        }

    }
}
