package Archive.Apr_2023.day_28th;

/**
 * 구슬을 나누는 경우의 수
 *   재귀함수 사용
 */
public class Problem56 {

    public static void main(String[] args) {
        System.out.println(combination(30, 5));
    }

    public static int combination(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return (combination(n-1, r-1) +combination(n-1, r));
        }
    }

}
