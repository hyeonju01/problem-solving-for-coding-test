/**
 *  다항식 더하기..
 */

package Archive.May_2023.day_3rd;

public class Problem65 {

    static class Solution {
        public String solution(String polynomial) {
            String[] poly_array = polynomial.replaceAll("\\s+", "")
                                            .replaceAll("\\+", " ")
                                            .split(" ");
            int x_num_sum = 0;
            int num_sum = 0;

            for (String num: poly_array) {
                // x 1차 항 합계
                if (num.endsWith("x")) {
                    if(num.substring(0, 1).equals("x")) {
                        x_num_sum = x_num_sum + 1;
                    } else {
                        x_num_sum = x_num_sum + Integer.parseInt(num.replace("x", ""));
                    }

                    // 상수항 합계
                } else {
                    num_sum = num_sum + Integer.parseInt(num);
                }
            }

            if (x_num_sum == 1) {
                if (num_sum == 0) {
                    return "x";
                } else {
                    return "x + "+ String.valueOf(num_sum);
                }
            } else if (num_sum == 0) {
                return String.valueOf(x_num_sum)+"x";
            } else if (x_num_sum == 0) {
                return String.valueOf(num_sum);
            } else {
                return String.valueOf(x_num_sum)+"x + "+ String.valueOf(num_sum);
            }
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution("x"));

    }
}
