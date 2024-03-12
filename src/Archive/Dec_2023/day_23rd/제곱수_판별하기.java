package Archive.Dec_2023.day_23rd;

public class 제곱수_판별하기 {

    static class Solution {
        public int solution(int n) {
            double sqrRoot = Math.sqrt(n);
            if (sqrRoot % 1 == 0) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(144));

    }

}
