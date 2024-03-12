package Archive.Dec_2023.day_20th;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_조각하기 {

    static class Solution {
        public int[] solution(int[] arr, int[] query) {
            // int arr -> Integer list
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            int queryLen = query.length;

            for(int i = 0; i < queryLen; i++) {
                if (i % 2 == 0) {
                    // list.remove(el);
                    list = list.subList(0, query[i]+1); // 이후 삭제
                    System.out.println("현재 List: " + list);
                } else {
                    list = list.subList(query[i], list.size());
                    System.out.println("현재 List: " + list);
                }
            }

            System.out.println(list);

            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(arr, query)));
    }

}
