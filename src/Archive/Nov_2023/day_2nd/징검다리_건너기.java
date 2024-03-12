package Archive.Nov_2023.day_2nd;

public class 징검다리_건너기 {

    static class Solution {
        public int solution(int[] stones, int k) {
            int answer = 0;
            int zeroStone = 0;
            int niniz = 0;



            while (k > zeroStone) {
                for (int i = 0; i < stones.length; i++) {
                    if (stones[i] > 0) {
                        stones[i] --;
                    } else {
                        zeroStone ++;
                    }
                }
                niniz ++;
            }
            return niniz;
        }

        public int findZeroStone(int[] stones) {
            int num = 0;
            for (int i = 0; i < stones.length; i++) {
                if (stones[i] == 0) {
                    num ++;
                }
            }
            return num;
        }


    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        int k = 3;
        System.out.println(solution.solution(stones, k));
    }

}
