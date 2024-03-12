package Archive.Dec_2023.day_14th;

public class 간단한_식_계산하기 {

    static class Solution {
        public int solution(String binomial) {
            int answer = 0;
            String[] splitted = binomial.split(" ");
            int a = Integer.parseInt(splitted[0]);
            String op = splitted[1];
            int b = Integer.parseInt(splitted[2]);
            switch(op) {
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                case "*":
                    answer = a * b;
                    break;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("43 + 12"));
        System.out.println(s.solution("0 - 7777"));
        System.out.println(s.solution("40000 * 40000"));
    }
}
