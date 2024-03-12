package Archive.Jan_2024.day_17th;

import java.util.HashSet;

public class Example {

    private static class Coord {
        public final int x;
        public final int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        HashSet<Coord> coordSet = new HashSet<>();

        Coord coord = new Coord(1, 2);
        coordSet.add(coord);

        Coord coord2 = new Coord(1, 2);

        System.out.println(coordSet.contains(coord2)); // False

    }

}
