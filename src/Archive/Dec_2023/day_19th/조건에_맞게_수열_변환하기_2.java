package Archive.Dec_2023.day_19th;

import java.util.*;
public class 조건에_맞게_수열_변환하기_2 {


    static class Solution {
        public int solution(int[] arr) {

            int answer = 0;
            int arrSize = arr.length;
            int num = 0;
            int[] tempArr = arr;

            while(true) {
                num ++;

                for(int i = 0; i < arrSize; i++) {

                    System.out.println("origin: " + Arrays.toString(arr));
                    System.out.println("temp: " + Arrays.toString(tempArr));

                    if ((arr[i] < 50) && (arr[i] % 2 == 1)) { // 50 미만의 홀수인가?
                        tempArr[i] = arr[i] * 2 + 1;

                    } else if ((arr[i] >= 50) && (arr[i] % 2 == 0)) { // 50 이상의 짝수인가?
                        tempArr[i] = arr[i] / 2;
                    }
                }

                if (Arrays.equals(arr, tempArr)) {
                    answer = num;
                    break;
                }

                if (num > 2) {
                    arr = tempArr;
                }

            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(s.solution(arr));
    }

}
