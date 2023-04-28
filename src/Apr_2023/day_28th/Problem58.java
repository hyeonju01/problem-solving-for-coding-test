package Apr_2023.day_28th;

/**
 * 팩토리얼
 *  if문의 조건 잘 살피기
 */

public class Problem58 {

    class Solution {
        public int solution(int n) {
            // int answer = 0;
            int fac = 1;
            int idx = 1;
            while (true) {
                fac = fac * idx;
                if (fac > n) {
                    return idx - 1;
                } else if (fac == n) {
                    return idx;
                } else {
                    idx ++;
                }
            }
        }
    }

}
