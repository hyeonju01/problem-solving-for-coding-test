package Archive.Dec_2022.day_2st;
/*
[Programmers] 두 수의 합
https://school.programmers.co.kr/learn/courses/30/lessons/120802

[다른 솔루션]
class Solution {
    public int solution(int num1, int num2) {
        boolean val = (-50000<= num1 && num1<= 50000 && -50000<=num2 && num2 <= 50000);
        int answer = -1;
        if(val){
            answer = num1 + num2;
        }
        return answer;
    }
}

 */
public class Problem2 {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = num1 + num2;

            return answer;
        }
    }
}
