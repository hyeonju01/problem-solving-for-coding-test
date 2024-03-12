package Archive.Dec_2023.day_4th;

public class 팩토리얼 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int temp = 1;
            int i = 1;
            while(true) {
                answer = i;
                temp = temp * i; // get factorial
                if (temp > n) {
                    answer = i-1;
                    break;
                } else if (temp == n){
                    break;
                } else {
                    i++;
                }
            }
            return answer;
        }

        public int factorial(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7));
    }
}