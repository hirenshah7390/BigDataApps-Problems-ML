package cs5543.tutorial.socketconnection;

import java.util.Random;

/**
 * Created by hhstm4 on 2/25/2016.
 */
public class Point {

    private static final Random RANDOM = new Random();
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point randomPoint(int x) {
        return new Point(x, RANDOM.nextInt(40));
    }

}
