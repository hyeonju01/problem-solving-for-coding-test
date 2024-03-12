package Archive.Nov_2023.day_14th;

public class 이어_붙인_수 {

    static class Solution {
        public int solution(int[] num_list) {
            String oddNums = "";
            String evenNums = "";

            for (int num: num_list) {
                if (num % 2 == 0) {
                    evenNums = evenNums + Integer.toString(num);
                } else {
                    oddNums = oddNums + Integer.toString(num);
                }
            }
            return Integer.parseInt(evenNums) + Integer.parseInt(oddNums);
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] num_list1 = {3, 4, 5, 2, 1};
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution.solution(num_list1));
        System.out.println(solution.solution(num_list2));

    }

}
