package Archive.Nov_2023.day_24th;

public class 구슬을_나누는_경우의_수 {

    static class Solution {
        public int solution(int balls, int share) {
            return factorial(balls) / (factorial(balls-share) * factorial(share));
        }

        public int factorial(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * factorial(n-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(30, 14));
    }

}