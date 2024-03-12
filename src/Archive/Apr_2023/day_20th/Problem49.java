package Archive.Apr_2023.day_20th;

/**
 * 가장 큰 수 찾기
 *  이중 for문으로 배열의 원소를 최댓값과 비교한다.
 */
public class Problem49 {

    public static void main(String[] args) {
        int[] answer = {0, 0};

        int[] array = {1, 8, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (answer[0] < array[j]) {
                    answer[0] = array[j];
                    answer[1] = j;
                    System.out.printf("%d %d \n", answer[0], answer[1]);
                }
            }
        }
    }

}
