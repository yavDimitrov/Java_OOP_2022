package L03_Working_Abstraction.P02_PointInRectangle;

public class Rectangle {
    private Point A;
    private Point C;

    public Rectangle(Point A, Point C){
        this.A = A;
        this.C = C;
    }

    public boolean contains(Point x) {
        return x.greaterOrEqual(A) && x.lessOrEqual(C);
    }
}
