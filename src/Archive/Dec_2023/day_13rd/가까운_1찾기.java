package Archive.Dec_2023.day_13rd;

public class 가까운_1찾기 {

    static class Solution {
        public int solution(int[] arr, int idx) {
            int answer = 0;
            int arrLen = arr.length;

            for(int i = idx; i < arrLen; i++) {
                if (arr[i] == 1) {
                    answer = i;
                    break;
                }
            }

            return answer > 0 ? answer: -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0};
        int idx = 0;
        Solution s = new Solution();

        System.out.println(s.solution(arr, idx));
    }

}
