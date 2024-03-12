package Archive.Dec_2022.day_2st;
/*
[Programmers] 두 수의 곱
https://school.programmers.co.kr/learn/courses/30/lessons/120804
 */
public class Problem3 {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;
            if (num1 >= 0 && num1 <=100 &&
            num2 >=0 && num2 <=100) {
                answer = num1 * num2;
            }
            return answer;
        }
    }
}
