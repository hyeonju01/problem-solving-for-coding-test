package Archive.Nov_2023.day_28th;

public class 문자열_여러_번_뒤집기 {

    static class Solution {
        public String solution(String my_string, int[][] queries) {
            // String answer = "";
            StringBuilder sb = new StringBuilder(my_string);

            for(int[] query: queries) {
                int s = query[0];
                int e = query[1];
                StringBuilder subStr = new StringBuilder(sb.substring(s, e + 1));
                subStr = subStr.reverse();
                sb = sb.replace(s, e+1, String.valueOf(subStr));
            }

            return String.valueOf(sb);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution.solution(my_string, queries));
    }

}
