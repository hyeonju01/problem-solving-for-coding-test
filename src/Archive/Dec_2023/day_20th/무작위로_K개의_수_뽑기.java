package Archive.Dec_2023.day_20th;

public class 무작위로_K개의_수_뽑기 {

//    class Solution {
//        public int[] solution(int[] arr, int k) {
//
//            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
//
//            ArrayList<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
//
//            int listSize = uniqueList.size(); // 2 -> k = 4
//            if (listSize == k) {
//                return uniqueList.stream().mapToInt(Integer::intValue).toArray();
//            } else if (listSize > k) {
//                for(int i = 3; i < listSize; i++) {
//                    uniqueList.remove(i);
//                }
//                return uniqueList.stream().mapToInt(Integer::intValue).toArray();
//            } else {
//                for(int i = listSize; i < k; i++) {
//                    uniqueList.add(-1);
//                }
//                return uniqueList.stream().mapToInt(Integer::intValue).toArray();
//            }
//
//            // return answer;
//        }
//    }

    public static void main(String[] args) {

    }

}
