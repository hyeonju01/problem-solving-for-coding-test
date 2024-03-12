package Archive.Nov_2023.day_28th;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 주사위_게임3 {

    static class Solution {
        public int solution(int a, int b, int c, int d) {
            int answer = 0;
            Map<Integer, Integer> map = new HashMap<>();
            push(a, map);
            push(b, map);
            push(c, map);
            push(d, map);

            // System.out.println(map);
            // a, b == p, c == q, d== r 이면 q * r
            // 모두 다르면 가장 작은 숫자

            // a, b, c, d 모두 같을 경우 1111 * p
            if (map.size() == 1) {
                return 1111 * map.get(a);

            // a, b, c가 같고 d는 다른 수가 나오면 (10 * p + q)(10 * p + q)
            } else if (map.size() == 2) {
                if (map.containsValue(3)) {
                    int p = 0;
                    int q = 0;
                    for (Integer key: map.keySet()) {
                        if (map.get(key) == 3) {
                            p = key;
                        }
                        if (map.get(key) == 1) {
                            q = key;
                        }
                    }
                    return ((10 * p) + q)*((10 * p) + q);

            // P = value가 2인 값, q = value가 2인 값 -> (p*q) * Math.abs(p-q)
                } else {
                    int p = 0;
                    int q = 0;
                    int[] arr = map.keySet().stream().mapToInt(Integer::intValue).toArray();
                    p = arr[0];
                    q = arr[1];
                    return (p + q) * Math.abs(p - q);
                }

            } else if (map.size() == 3) {
                // value가 1인 key들끼리 곱해준다..
//                for (Integer key: map.keySet()) {
                for(Integer key: Set.copyOf(map.keySet())) {
                    if (map.get(key) == 2) {
                        map.remove(key);
                    }
                }
                int[] arr = map.keySet().stream().mapToInt(Integer::intValue).toArray();
                int q = arr[0];
                int r = arr[1];
                return q * r;
            } else {
                return Math.min(Math.min(a, b), Math.min(c, d));
            }
        }

        public void push(int num, Map<Integer, Integer> map) {
            if (!map.containsKey(num)) { // false
                map.put(num, 1);
            } else {
                int value = map.get(num) + 1;
                map.put(num, value);
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6, 4, 2, 5));
    }

}