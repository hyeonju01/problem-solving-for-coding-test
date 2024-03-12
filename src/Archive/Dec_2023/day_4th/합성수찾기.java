package Archive.Dec_2023.day_4th;

public class 합성수찾기 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i = 1; i < n + 1; i++) {
                int num = 0;
                for (int j = 1; j <= i; j++) {
                    System.out.println("i, j: " + i + " " + j);

//                     int num = 0;
                    if (i % j == 0) {
                        num = num + 1;
                    }
                    System.out.println("num: " + num);
                }
                if (num > 2) {
                    answer ++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

}
