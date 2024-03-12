package Archive.Mar_2023.day_30th;

/**
 *  [프로그래머스] 나이 출력
 *  기준 연도에서 age를 뺀 후 1을 더해주면 출생연도가 나온다.
 */

public class Problem15 {
    class Solution {
        public int solution(int age) {
            int answer = 0;
            int year = 2022;
            answer = year - age + 1;
            return answer;
        }
    }
}
