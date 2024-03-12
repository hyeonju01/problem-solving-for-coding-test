package Archive.Dec_2023.day_17th;

public class 문자열_뒤집기 {

    static class Solution {
        public String solution(String my_string, int s, int e) {
            // String answer = "";
            StringBuilder sb = new StringBuilder(my_string);
            System.out.println("my_string: " + my_string);
            StringBuilder subStr = new StringBuilder(sb.substring(s, e+1));
            subStr.reverse();
            sb.replace(s, e+1, String.valueOf(subStr));

            return String.valueOf(sb);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "Progra21Sremm3";

        int start = 6;
        int end = 12;

        System.out.println(s.solution(my_string, start, end));
    }

}
