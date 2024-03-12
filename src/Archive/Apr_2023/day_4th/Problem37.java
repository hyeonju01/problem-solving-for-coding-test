package Archive.Apr_2023.day_4th;

/**
 *  개미 군단
 */
public class Problem37 {

    class Solution {
        public int solution(int hp) {
            int answer = 0; // 개미 병력 수

            final int general = 5;
            final int soldier = 3;
            final int worker = 1;

            int general_num = hp / general;
            answer = answer + general_num;
            hp = hp % general;

            int soldier_num = hp / soldier;
            answer = answer + soldier_num;
            hp = hp % soldier;

            int worker_num = hp / worker;
            answer = answer + worker_num;

            return answer;
        }
    }
    
}
