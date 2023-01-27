package L03_Working_Abstraction.P02_PointInRectangle;

public class Point {
    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean greaterOrEqual(Point other) {
        return this.x >= other.x && this.y >= other.y;
    }

    public boolean lessOrEqual(Point other) {
        return this.x <= other.x && this.y <= other.y;
    }
}
