package Archive.Dec_2023.day_11st;

import java.util.Arrays;

public class x_사이의_개수 {

    static class Solution {
        public int[] solution(String myString) {

            myString = myString.replaceAll("x", " ");
            String[] splitted = myString.split(" ");
            System.out.println("splitted: " + Arrays.toString(splitted));
            int arrNum = splitted.length;

            int[] answer = new int[arrNum];

            for(int i = 0; i < arrNum; i++) {
                int strLen = splitted[i].length();
                answer[i] = strLen;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String myString = "oxooxoxxox";
        System.out.println(Arrays.toString(s.solution(myString)));
    }

}