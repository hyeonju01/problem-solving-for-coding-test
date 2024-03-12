package Archive.Nov_2023.day_14th;

public class 등차수열의_특정_항만_더하기 {

    static class Solution {
        public int solution(int a, int d, boolean[] included) {
            int answer = 0;

            for (int i = 0; i < included.length; i++) {
                if (included[i] == true) {
                    answer = answer + (a + d * i);
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean[] included1 = new boolean[]{true, false, false, true, true}; // 1, 2, 3, 4, 5항
        boolean[] included2 = new boolean[]{false, false, false, true, false, false, false}; // 1, 2, 3. .. ,7항

        System.out.println(solution.solution(3, 4, included1));
        System.out.println(solution.solution(7, 1, included2));


    }
}
