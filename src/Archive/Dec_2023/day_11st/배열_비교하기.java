package Archive.Dec_2023.day_11st;

import java.util.Arrays;

public class 배열_비교하기 {
    static class Solution {
        public int solution(int[] arr1, int[] arr2) {
            int answer = 0;

            int arr1Len = arr1.length;
            int arr2Len = arr1.length;

            if (arr1Len != arr2Len) {
                return arr1Len > arr2Len? 1: -1;
            } else {
                int arr1Sum = Arrays.stream(arr1).sum();
                System.out.println("arr1Sum: " + arr1Sum);
                int arr2Sum = Arrays.stream(arr2).sum();
                System.out.println("arr2Sum: " + arr2Sum);

                if (arr1Sum > arr2Sum) {
                    return 1;
                } else if (arr1Sum < arr2Sum) {
                    return -1;
                } else {
                    return 0;
                }

            }

        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(s.solution(arr1, arr2));
    }

}
