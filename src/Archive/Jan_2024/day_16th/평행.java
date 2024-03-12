package Archive.Jan_2024.day_16th;

public class 평행 {

    static class Solution {
        public int solution(int[][] dots) {
            // int answer = 0;
            // 기울기
            // dot 1 - dot 2, dot 3 - dot 4
            // dot 1 - dot 3, dot 2 - dot 4
            // dot 1 - dot 4, dot 2 - dot 3

            double inclination1 = 0;
            double inclination2 = 0;

            int[] dot1 = dots[0]; int[] dot2 = dots[1];
            int[] dot3 = dots[2]; int[] dot4 = dots[3];

            inclination1 = (dot1[1] - dot2[1])/(dot1[0] - dot2[0]);
            inclination2 = (dot3[1] - dot4[1])/(dot3[0] - dot4[0]);

            System.out.println(inclination1);
            System.out.println(inclination2);

            if (inclination1 == inclination2) {
                return 1;
            }

            inclination1 = 0;
            inclination2 = 0;

            inclination1 = (dot1[1] - dot3[1])/(dot1[0] - dot3[0]);
            inclination2 = (dot2[1] - dot4[1])/(dot2[0] - dot4[0]);

            System.out.println(inclination1);
            System.out.println(inclination2);

            if (inclination1 == inclination2) {
                return 1;
            }

            inclination1 = 0;
            inclination2 = 0;

            inclination1 = (dot1[1] - dot4[1])/(dot1[0] - dot4[0]);
            inclination2 = (dot2[1] - dot3[1])/(dot2[0] - dot3[0]);

            System.out.println(inclination1);
            System.out.println(inclination2);

            if (inclination1 == inclination2) {
                return 1;
            }

            return 0;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        // int[][] dots1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        // int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        int[][] dots3 = {{10, 1}, {9, 3}, {2, 2}, {4, 4}};

        // System.out.println(s.solution(dots1));
        // System.out.println(s.solution(dots2));
        System.out.println(s.solution(dots3));
    }

}
