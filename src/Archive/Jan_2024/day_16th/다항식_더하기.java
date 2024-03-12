package Archive.Jan_2024.day_16th;

/**
 *
 * Test Case 2개 틀렸다.
 */
public class 다항식_더하기 {
    static class Solution {
        public String solution(String polynomial) {
            String answer = "";
            polynomial = polynomial.replaceAll(" + ", "");

            // List<String> withX = new ArrayList<>();
            int numX = 0;
            // List<String> nums = new ArrayList<>();
            int nums = 0;

            String[] splitted = polynomial.split(" ");
            // System.out.println(Arrays.toString(splitted));

            for(String content: splitted) {
                if (content.contains("x")) {
                    content=content.replace("x", "");
                    if (content.isBlank()) {
                        numX ++;
                    } else {
                        numX = numX + Integer.parseInt(content);
                    }
                } else if (!content.equals("+")){
                    nums = nums + Integer.parseInt(content);
                }
            }

            if (nums == 0) {
                if (numX == 1) {
                    answer = "x";
                } else {
                    answer = String.valueOf(numX) + "x";
                }
            } else if (numX == 0) {
                answer = String.valueOf(nums);
            } else {
                answer = String.valueOf(numX) + "x" + " + " + String.valueOf(nums);
            }

            return answer;
        }
    }
    public static void main(String[] args) {

        Solution s = new Solution();
        String polynomial1 = "3x + 7 + x";
        String polynomial2 = "x + x + x";

        System.out.println(s.solution(polynomial1));
        System.out.println(s.solution(polynomial2));
    }

}
