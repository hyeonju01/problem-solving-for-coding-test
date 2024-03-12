package Archive.Sep_2023.day_12nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 톱니바퀴 {

    public static void clockwise() {

        // 시계방향 회전 메소드 구현

    }

    public void counterClockwise() {

        // 반시계방향 회전 메소드 구현

    }

    public static void main(String[] args) throws IOException {

        // buffer 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] wheel1 = new int[8];
        int[] wheel2 = new int[8];
        int[] wheel3 = new int[8];
        int[] wheel4 = new int[8];

        for (int i = 0; i < wheel1.length; i++) {
            wheel1[i] = br.read();
        }
        for (int i = 0; i < wheel2.length; i++) {
            wheel2[i] = br.read();
        }
        for (int i = 0; i < wheel3.length; i++) {
            wheel3[i] = br.read();
        }
        for (int i = 0; i < wheel4.length; i++) {
            wheel4[i] = br.read();
        }

        int rotateNum = br.read();

//        for (int i = 1; i <= rotateNum; i++) {
//            int wheelNum = br.read();
//            int direction = br.read();
//
//            if (direction == 1) {
//                switch (wheelNum) {
//                    case 1:
//                        wheel1.clockwise();
//                        if (wheel1[2] != wheel2[6]) {
//                            wheel2.counterClockwise();
//                        }
//                        if (wheel2[2] != wheel3[6]) {
//                            wheel3.clockwise();
//                        }
//                        if (wheel3[2] != wheel4[6]) {
//                            wheel4.counterclockwise();
//                        }
//                        break;
//
//                    case 3:
//                        wheel3.clockwise();
//                        if (wheel1[2] != wheel2[6]) {
//                            wheel2.counterClockwise();
//                        }
//                        if (wheel2[2] != wheel3[6]) {
//                            wheel3.clockwise();
//                        }
//                        if (wheel3[2] != wheel4[6]) {
//                            wheel4.counterclockwise();
//                        }
//                        break;
//                }
//            } else {
//                switch ()
//            }
//        }

    }

}
