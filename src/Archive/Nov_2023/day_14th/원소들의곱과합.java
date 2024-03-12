package Archive.Nov_2023.day_14th;

public class 원소들의곱과합 {

    static class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            int sum = 0;
            int multiple = 1;

            for (int i = 0; i < num_list.length; i++) {
                sum = sum + num_list[i];
                multiple = multiple * num_list[i];
            }

            if (multiple < sum*sum) {
                answer = 1;
            } else if (multiple > sum*sum){
                answer = 0;
            }


            return answer;
        }
    }

    public static void main(String[] args) {

        int[] num_list1 = {3, 4, 5, 2, 1};
        int[] num_list2 = {5, 7, 8, 3};

        Solution solution = new Solution();
        System.out.println(solution.solution(num_list1));
        System.out.println(solution.solution(num_list2));

    }

}
