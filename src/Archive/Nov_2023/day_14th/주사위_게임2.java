package Archive.Nov_2023.day_14th;

public class 주사위_게임2 {

    static class Solution {
        public int solution(int a, int b, int c) {
            int answer = 0;

            if (a != b & b != a & a != c) {
                answer = a + b + c;
            }

            if ((a == b & b != c) || (a == c & b != c) || (b == c & a != c)) {
                answer = (a + b + c) * (a*a + b*b + c*c);
            }

            if (a == b & b == c) {
                answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2, 6, 1));
        System.out.println(solution.solution(5, 3, 3));
        System.out.println(solution.solution(4, 4, 4));
    }

}
