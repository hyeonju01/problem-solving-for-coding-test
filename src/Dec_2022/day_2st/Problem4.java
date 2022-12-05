package Dec_2022.day_2st;
/*
[Programmers] 몫 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120805
 */
public class Problem4 {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;
            if (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) {
                answer = num1 / num2;
            }
            return answer;
        }
    }

}
