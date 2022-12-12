package Dec_2022.day_10th;

/*
[프로그래머스] 분수의 덧셈 - 실패
https://school.programmers.co.kr/learn/courses/30/lessons/120808
1. num1, num2의 최소공배수를 구한다.
2. 최소공배수를 answer[1]에 넣는다.
3. 최소공배수를 num1, num2로 나눈다.
4. 그 몫을 각각 denum1, denum2에 곱하고 그 결과를 더하여 answer[0]에 넣는다.

반례 처리를 더해주어... 삼고초려 끝에 성공..^^
 */

public class Problem8 {
    class Solution {
        public int GCD(int a, int b) {
            if (a % b == 0) {
                return b;
            }
            return GCD(b, a % b);
        }
        public int[] solution(int denum1, int num1, int denum2, int num2) {
            int[] answer = new int[2];
            int GCD = GCD(num1, num2); //최대공약수
            int LCD = (num1 * num2) / GCD; //최소공배수
            answer[1] = LCD; //분모
            answer[0] = ((denum1 * (LCD / num1)) + (denum2 * (LCD / num2)));
            if (answer[0] == answer[1]) {
                answer[0] = answer[1] = 1;
            } else if (answer[0] % answer[1] == 0) {
                answer[0] = answer[0] / answer[1];
                answer[1] = 1;
            } else {
                int temp =answer[0];
                answer[0] = answer[0] / GCD(answer[0], answer[1]);
                answer[1] = answer[1] / GCD(temp, answer[1]);
            }
            return answer;
        }
    }
}