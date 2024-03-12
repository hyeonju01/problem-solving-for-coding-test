package Archive.Mar_2023.day_30th;

/**
 * [프로그래머스] 피자 나눠 먹기 (3)
 *  인원을 조각으로 나누었을 때 나머지가 없다면 그 몫이 곧 피자 개수이다.
 *  나머지가 있다면, 못 먹는 사람이 발생하는 것이니 한 판을 더 시켜야 한다.
 */
public class Problem20 {
    class Solution {
        public int solution(int slice, int n) {
            int answer = 0;
            if (n % slice == 0) {
                answer = n / slice;
            } else {
                answer = n / slice + 1;
            }
            return answer;
        }
    }
}
