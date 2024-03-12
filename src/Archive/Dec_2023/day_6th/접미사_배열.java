package Archive.Dec_2023.day_6th;

import java.util.ArrayList;
import java.util.Arrays;

public class 접미사_배열 {

    static class Solution {
        public String[] solution(String my_string) {
            String[] answer = {};
            ArrayList<String> list = new ArrayList<>();
            int s = 0;
            int e = my_string.length();
            for(int i = 0; i < my_string.length(); i++) {
                list.add(my_string.substring(s, e));
                s ++;
            }
            return list.stream().sorted().toArray(String[]::new);
        }
    }
    public static void main(String[] args) {

        Solution s = new Solution();
        // String my_string = "banana";
        String my_string = "programmers";
        System.out.println(Arrays.toString(s.solution(my_string)));

    }

}
