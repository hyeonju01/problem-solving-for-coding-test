package Archive.Dec_2023.day_20th;

import java.util.ArrayList;

public class 리스트_자르기 {

    class Solution {
        public int[] solution(int n, int[] slicer, int[] num_list) {
            int[] answer = {};
            ArrayList<Integer> arr = new ArrayList<>();
            int listLen = num_list.length;
            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];

//            switch(n) {
//                case 1: {
//                    answer = Arrays.copyOfRange(num_list, 0);
//                    break;
//                }
//                case 2: {
//                    answer = Arrays.copyOf(num_list, a, listLen);
//                    break;
//                }
//                case 3: {
//                    answer = Arrays.copyOf(num_list, a, b+1);
//                    break;
//                }
//                case 4: {
//                    for(int i = a; i < b+1; i += c) {
//                        arr.add(num_list[i]);
//                    }
//                    answer = arr.stream().mapToInt(Integer::intValue).toArray();
//                    break;
//                }
//            }

            return answer;
        }
    }

}
