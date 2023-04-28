package Apr_2023.day_28th;

/**
 * 합성수 찾기
 */
public class Problem57 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            int cnt = 0;
            for(int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        cnt = cnt + 1;
                    }
                }
                if(cnt >= 3) {
                    answer = answer + 1;
                }
                cnt = 0;
            }

            return answer;
        }
    }

}
